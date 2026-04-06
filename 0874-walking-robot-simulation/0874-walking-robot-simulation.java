class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<Long> obstacleSet = new HashSet<>();
        for (int[] obs : obstacles) {
            long ox = obs[0] + 30000;
            long oy = obs[1] + 30000;
            obstacleSet.add((ox << 16) | oy);
        }

        int x = 0, y = 0;
        int maxDistSq = 0;
        Direction d = Direction.NORTH;

        for (int cmd : commands) {
            if (cmd == -2) {
                d = d.turnLeft();
            } else if (cmd == -1) {
                d = d.turnRight();
            } else {
                for (int i = 0; i < cmd; i++) {
                    int nx = x, ny = y;
                    switch (d) {
                        case NORTH: ny++; break;
                        case EAST:  nx++; break;
                        case SOUTH: ny--; break;
                        case WEST:  nx--; break;
                    }

                    long key = ((long)(nx + 30000) << 16) | (ny + 30000);
                    if (obstacleSet.contains(key)) {
                        break;
                    }

                    x = nx;
                    y = ny;
                    maxDistSq = Math.max(maxDistSq, x * x + y * y);
                }
            }
        }
        return maxDistSq;
    }

    public enum Direction {
        NORTH, EAST, SOUTH, WEST;

        public Direction turnRight() {
            switch (this) {
                case NORTH: return EAST;
                case EAST:  return SOUTH;
                case SOUTH: return WEST;
                case WEST:  return NORTH;
                default: throw new IllegalStateException();
            }
        }

        public Direction turnLeft() {
            switch (this) {
                case NORTH: return WEST;
                case WEST:  return SOUTH;
                case SOUTH: return EAST;
                case EAST:  return NORTH;
                default: throw new IllegalStateException();
            }
        }
    }
}