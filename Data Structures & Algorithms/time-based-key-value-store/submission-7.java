class TimeMap {

    private final Map<String, List<String>> timeMap;
    private int min = 0;

    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {


        //timeMap.put(key, timeMap.getOrDefault(key, ))
        if(timeMap.containsKey(key)) {
            //System.out.println("eeeee: "+ timeMap.get(key));
            timeMap.get(key).add(value+":"+timestamp);
        }
        else{
        List<String> insert = new ArrayList<>();
        insert.add(value+":"+timestamp);
        timeMap.put(key, insert);}
        
    }
    
    public String get(String key, int timestamp) {

        System.out.println("dasdsa: "+ timeMap);

        System.out.println("check null: "+ timeMap.get(key));
        if(null == timeMap.get(key)) {
            return "";
        }

        List values = timeMap.get(key);

        String min_str = (String)values.get(0);
        int min = Integer.parseInt(min_str.substring(min_str.indexOf(":")+1));

        if(timestamp < min) {
            return "";
        }

        int l = 0, r = values.size()-1, mid =0;

        System.out.println("value of r : "+ r);

        while(l<=r) {
            mid = l+(r-l)/2;
            //System.out.println("rrrrrr: "+ mid);
            String inStr = (String)values.get(mid);
            //System.out.println("dasdsa: "+ inStr);
            if(Integer.parseInt(inStr.substring(inStr.indexOf(":")+1)) == timestamp) {
                System.out.println("inside eqoal: "+ mid);
                break;
            }
            else if (Integer.parseInt(inStr.substring(inStr.indexOf(":")+1)) < timestamp) {
                l = mid + 1;
            }
            else {
                r=mid-1;
            }
        }

        String str1 = (String)values.get(mid);

        if(Integer.parseInt(str1.substring(str1.indexOf(":")+1)) > timestamp) {
            mid = mid -1;
        }
        
        String str = (String)values.get(mid);
        //System.out.println("rrrrrr: "+ mid);
        return str.substring(0,str.indexOf(":"));
    }
}
