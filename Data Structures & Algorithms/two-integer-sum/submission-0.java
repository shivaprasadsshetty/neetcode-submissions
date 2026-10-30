class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int j=0;
        for(int i: nums){
            if(hm.containsKey(target-i)){
                
                int arr[]={hm.get(target-i),j};
                return arr;
            }
            else{
                hm.put(i,j++);
            }
        }
        int arr[]= new int[2];
        return arr;
    }
}
