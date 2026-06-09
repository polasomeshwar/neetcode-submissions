class Solution {

    public String encode(List<String> strs) {
        String enco = "";
        for(String str: strs){
            enco = enco+str.length()+"#"+str;
        }
        return enco;
    }

    public List<String> decode(String str) {
        System.out.println(str);
        int i=0;
        List<String> res = new ArrayList<>();
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            System.out.println(j);

            int length = Integer.parseInt(str.substring(i,j));
            j++;
            res.add(str.substring(j,j+length));
            i=j+length;
        }
        return res;
    }
}
