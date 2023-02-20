class Solution {
    public int[] sortArray(int[] nums) {
        int min= nums[0];
       for (int i= 0;i<=nums.length-2;i++){
       min=i;
       for (int j =i+1;j<=nums.length-1;j++)
       {
           if(nums[j]<nums[min])
            min = j;
       }
       int temp=nums[min];
       nums[min]=nums[i];
       nums[i]=temp;
}
return nums;
}
}
//main to be added
