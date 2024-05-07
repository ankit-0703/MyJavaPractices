class palindrome{
    public static void main(String[] args){
        palindrome p=new palindrome();
        System.out.println(p.pali(12331));
    }
    public boolean pali(int n){
        return n==rev(n);
    }
    int sum=0;
    private int rev(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);
        return sum;
    }

}