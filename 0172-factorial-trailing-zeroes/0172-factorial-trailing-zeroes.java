class Solution 
{
    public int trailingZeroes(int n) 
    {
            int fact=1;
            int cnt=0;
            if(n<5)
            {
                return 0;
            }
            int sum=0;
          
           while(n>=5)
           {
             sum+=n/5;
             n=n/5;
           }
        return sum;
    }

}