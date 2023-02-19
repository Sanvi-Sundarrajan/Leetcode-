import java.util.*;
class Main {
    public int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++) {
      nums[i] = nums[i] + nums[i-1];   
    }
    return nums;
    }
    
    public static void main(String args [])
    {
        Main s = new Main();
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
