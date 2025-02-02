class Solution {
    public boolean isArraySpecial(int[] nums) {
        int xor = nums[0] & 1;
        for(int i=1;i<nums.length;i++){
if((xor^=1) != (nums[i]&1))return false;
}
return true;
    }
}