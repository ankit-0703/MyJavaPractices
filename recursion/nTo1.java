class nTo1{
    public static void main(String[] args){
        
        nTo1.fun(10);
    }
    static int fun(int n){
        if(n==0){
            return;
        }
        else{
            fun(n-1);
            System.out.println(n);
        }
    }
}