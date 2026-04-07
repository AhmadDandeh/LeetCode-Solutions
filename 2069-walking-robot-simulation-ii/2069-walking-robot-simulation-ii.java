class Robot {
    int pos, width, height, perimeter;
    boolean moved = false;

    public Robot(int width, int height) {
        this.height = height;
        this.width = width;
        this.perimeter = 2 * (height + width -2);
        pos = 0;
    }
    
    public void step(int num) {
        moved = true;
        pos = (pos + num) % perimeter;
    }
    
    public int[] getPos() {
        if (pos < width) return new int[]{pos, 0};
        if (pos < width + height - 1) return new int[]{width - 1, pos - (width - 1)};
        if (pos < 2 * width + height - 2) 
            return new int[]{width - 1 - (pos - (width + height - 2)), height - 1};
        
        return new int[]{0, height - 1 - (pos - (2 * width + height - 3))};
    }
    
    public String getDir() {
        if (pos == 0 && !moved) return "East";
        if (pos > 0 && pos < width) return "East";
        if (pos >= width && pos < width + height - 1) return "North";
        if (pos >= width + height - 1 && pos < 2 * width + height - 2) return "West";
        
        return "South";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */