class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> noDups = new HashSet<>();
        for(int n : nums){
            noDups.add(n);
        }
        if (nums.length == noDups.size()) {
            return false;
        }
        else {
            return true;
        }

        }
    }
