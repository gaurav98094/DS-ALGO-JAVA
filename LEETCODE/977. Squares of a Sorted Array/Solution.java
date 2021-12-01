class Solution {
    public int[] sortedSquares(int[] nums) {
        // return Arrays.stream(nums).map(el -> el * el).sorted().toArray(); 
        int l = 0;
		int r = nums.length - 1;
		int indx = nums.length - 1;

		int[] res = new int[nums.length];

		while (l <= r) {
			if (Math.abs(nums[l]) > Math.abs(nums[r])) {
				res[indx--] = nums[l] * nums[l];
				l++;
			} else {
				res[indx--] = nums[r] * nums[r];
				r--;
			}
		}

		return res;
    }
}