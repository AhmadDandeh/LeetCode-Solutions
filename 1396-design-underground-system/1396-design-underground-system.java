class UndergroundSystem {
    record In(String name, int time){}
    HashMap<Integer, In> mapIn;
    record Agg(int allTime, int count){}
    HashMap<String, Agg> mapAgg;

    public UndergroundSystem() {
        mapIn = new HashMap<>();
        mapAgg = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        mapIn.put(id, new In(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        In r = mapIn.remove(id);
        String full = r.name + "-" + stationName;
        if(mapAgg.containsKey(full)){
            Agg a = mapAgg.remove(full);
            mapAgg.put(full, new Agg(a.allTime + t - r.time, a.count+1));
        }
        else{
            mapAgg.put(full, new Agg(t - r.time, 1));
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        Agg a = mapAgg.get(startStation + "-" + endStation);
        return ((double) a.allTime)/a.count;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */