class Number_of_steps_to_zero {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0)
        {
            if(num%2==0)
            {
                num/=2;
                count++;
            }
            else
            {
                num-=1;
                count++;
            }
        }
        return count;
    }
}
