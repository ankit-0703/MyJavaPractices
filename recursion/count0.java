class count0{
    public static void main(String[] args){
        count0 c=new count0();
        long zeros=c.count(302010401);
        System.out.println(zeros);
    }
    public int count(int n){
        int count=0;
        return helper(n,count);
    }
    private int helper(int n,int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,count+1);
        }
        else{
            return helper(n/10,count);
        }
    }
}