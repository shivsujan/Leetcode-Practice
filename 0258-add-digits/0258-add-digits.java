class Solution {
    public int addDigits(int num) {
        int n1=sum(num);
        while(n1>=10){
            n1=sum(n1);
        }
        return n1;

    }
    public static int sum(int num){
        int sum=0;
        while(num!=0){
            int l=num%10;
            sum=sum+l;
            num/=10;
        }
        return sum;
    }
}