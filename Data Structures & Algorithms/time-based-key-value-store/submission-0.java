class TimeMap {
    HashMap<String, List<Pair>> keys;
    public TimeMap() {
        keys = new HashMap<>();
    }
    class Pair {
        private int timestamp;
        private String value;
        public Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    public void set(String key, String value, int timestamp) {
        List<Pair> e = keys.getOrDefault(key, null);
        Pair val = new Pair(timestamp, value);
        if(e != null) {
            e.add(val);
        }
        else {
            ArrayList<Pair> arr = new ArrayList<>();
            arr.add(val);
            keys.put(key,arr);
        }
    }
    
    public String get(String key, int timestamp) {
        List<Pair> timeValues = keys.getOrDefault(key, null);
        if(timeValues == null) {
            return "";
        }
        int l = 0;
        int r = timeValues.size() - 1;
        while(l <= r) {
            int m = l + (r-l) / 2;
            Pair pair = timeValues.get(m);
            if(pair.timestamp == timestamp) {
                return pair.value;                
            }
            else if (pair.timestamp < timestamp) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        if(r < 0) {
            return "";
        }
        return timeValues.get(r).value;
    }
}
