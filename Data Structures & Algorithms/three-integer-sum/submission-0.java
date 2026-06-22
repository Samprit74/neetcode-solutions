class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target =0;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Map<Integer,Integer> mp = new HashMap<>();
            for(int j=i+1;j<nums.length;j++){
                int rem=target -nums[i] -nums[j];
                Integer re=mp.get(rem);
                if(re != null){
                    List<Integer> li=new ArrayList<>();
                    li.add(rem);
                    li.add(nums[i]);
                    li.add(nums[j]);
                    ans.add(li);
                }

                mp.put(nums[j],j);

            }
        }
        for(List<Integer> li : ans){
            Collections.sort(li);
        }
        Set<List<Integer>> st = new HashSet<>(ans);


        return new ArrayList<>(st);

    }
}
