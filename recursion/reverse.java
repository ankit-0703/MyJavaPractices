class reverse{
    public static void main(String[] args){
        reverse r=new reverse();
        System.out.println(r.rev(12345));
    }
    int sum=0;
    public int rev(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);
        return sum;
    }
}