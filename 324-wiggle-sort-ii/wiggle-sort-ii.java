class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        int n = nums.length;

        int left = (n - 1) / 2;   
        int right = n - 1;  
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                nums[i] = arr[left--];
            }
            else{
                nums[i] = arr[right--];
            }
        }
    }
}