class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] ans=new int[2];
        for(int a=0;a<nums.length;a++){
            
            int rem=target-nums[a];
            if(mp.containsKey(rem)){
                ans[0]=mp.get(rem);
                ans[1]=a;
            } 

            mp.put(nums[a],a);
        }

        if(nums[0]<nums[1]){
            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
        }
        return ans;
    }
}
