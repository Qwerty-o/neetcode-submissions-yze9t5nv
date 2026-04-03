class Solution {
    public boolean isAnagram(String s, String t) {
        //use a hashtab;e to see if the letters are in the other one

        //first check if lengths are equal to each other
        if(s.length()!= t.length()) {
            return false;
        }
        //create frequency counter for lowercase alphabets
        int[] count = new int [26];
        //count characters, add for str s and subract for str t

        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }        
        // convert char to array indexes and increment
        //convert char to array index and decrement

        for(int val : count){
            if(val != 0) {
                return false;
            }
        }
        // check if all counts are zero

        //if imbalance is found then its not an anagram
        return true;
        //if all counts are 0 then its an anagram
    }
}
