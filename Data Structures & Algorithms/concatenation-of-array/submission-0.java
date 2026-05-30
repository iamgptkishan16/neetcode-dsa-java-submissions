class Solution {
    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < n * 2; i++) {
            // ans[i] = nums[i];
            // ans[n + i] = nums[i];
            ans[i] = nums[i%n];
        }
        return ans;
        
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 1};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}