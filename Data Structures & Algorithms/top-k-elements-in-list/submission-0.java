class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      

        Map<Integer,Integer> mp=new HashMap<>();

        for(int i :nums) mp.put(i,mp.getOrDefault(i,0)+1);
        Comparator<Integer> cp = (a,b)-> mp.get(b)-mp.get(a);
        PriorityQueue<Integer> pq = new PriorityQueue<>(cp);
        for(int i : mp.keySet()){
            pq.offer(i);
        }
        int[] ans=new int[k];

        for(int i=0;i<k;i++)ans[i]=pq.poll();
        return ans;
    }
}
