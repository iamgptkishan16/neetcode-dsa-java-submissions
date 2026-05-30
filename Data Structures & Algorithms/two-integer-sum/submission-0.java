class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int nextSum = target - nums[i];

            if(map.containsKey(nextSum)){
                return new int[] {map.get(nextSum), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        int target = 7;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
