class Solution {
    public int getDigitSum(int num){
        int sum = 0;
        while(num>0){
            sum+=(num%10);
            num/= 10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int result = -1;
        int[] mp = new int[82];

        for(int i = 0; i<n; i++){
            int digitsum = getDigitSum(nums[i]);

            if (mp[digitsum]>0){
                result = Math.max(result, (nums[i]+mp[digitsum]));
            }

            mp[digitsum] = Math.max(mp[digitsum], nums[i]);
        }
return result;
        
    }
}