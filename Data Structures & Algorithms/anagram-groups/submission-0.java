class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String temp = new String(strChar);
            if(map.containsKey(temp)){
                List<String> oldList = map.get(temp);
                oldList.add(str);
                map.put(temp,oldList);
            } 
            else{
                List<String> arrayList = new ArrayList();
                arrayList.add(str);
                map.put(temp,arrayList);
            }
        }

        List<List<String>> result = new ArrayList<>(map.values());

        return result;
    }
}
