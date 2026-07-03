class TimeMap {

    HashMap<String,TreeMap<Integer,String>> map;

    public TimeMap() {
            this.map= new HashMap<>();

        
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)){
        map.put(key, new TreeMap<>());

        }
         map.get(key).put(timestamp,value);
        
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> bucket = map.get(key);
        

        if(!map.containsKey(key)){
        return "";
    }
Integer closest = bucket.floorKey(timestamp);
    if(closest ==null){
        return "";

    }
    
    else return bucket.get(closest);
    
    
    
    }
}
