import java.util.*;
class Running_sumofanarray {
    public int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++) {
      nums[i] = nums[i] + nums[i-1];   
    }
    return nums;
    }
    
    public static void main(String args [])
    {
        Running_sumofanarray s = new Running_sumofanarray();
        int nums []= new int [];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        nums = s.runningSum(nums);
        System.out.println("Output: "+Arrays.toString(nums));

    }
    }
