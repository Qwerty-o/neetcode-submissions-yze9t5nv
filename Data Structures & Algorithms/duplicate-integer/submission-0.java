class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create a set for seen elements
        HashSet<Integer> done = new HashSet<>();

        //go through elements in nums array
        for (Integer n : nums){
            if (done.contains(n)){
                return true;
            }
            done.add(n);
        }
        return false;
        //if element is in set then return true
        //if elements is not then add it to the thing
    }
}