class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();

        for(String s : strs){
            String sp=key(s);

            if(mp.containsKey(sp)){
                      mp.get(sp).add(s);
            }
            else{
                mp.put(sp,new ArrayList<>());
                mp.get(sp).add(s);
            }

        }

        return new ArrayList(mp.values());
    }

    static String key(String s){
        int[] arr=new int[26];

        for(int i=0;i<s.length();i++) arr[s.charAt(i)-'a']++;

        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<26;i++){
            sb.append((char)i+'a');
            sb.append(arr[i]);
        }

        return sb.toString();
        
    }
}
