import java.util.*;
class Richest_Customer{
    public static int maximumWealth(int[][] accounts) {
        int sum=0,max=0;
      for(int i=0;i<accounts.length;i++){
      for(int j=0;j<accounts[i].length;j++)
    {
        sum+=accounts[i][j];
    }
    if(max<sum)  // takes the sum conderation after jth iteration
        {
            max=sum;
        }
        sum=0;
    
    }
    return max;
    }
    public static void main (String [] args)
    { 

        int accounts[][]= new int[1][50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: accounts = ");
        for(int i=0;i<accounts.length;i++)
      for(int j=0;j<accounts[i].length;j++)
      {
          accounts[i][j]=sc.nextInt();
      }

        int richest= maximumWealth(accounts);
    }
}
