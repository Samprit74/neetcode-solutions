class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int curr=i+1;
            int last=nums.length - 1;
            while(curr<last){
                int sum=nums[curr] + nums[i]+ nums[last];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[curr],nums[i],nums[last]));
                     curr++;
                     last--;
                }
                else if(sum>0) last--;
                else curr++;
               
            }
        }
        return new ArrayList<>(ans);
    }
}
