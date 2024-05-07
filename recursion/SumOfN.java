import java.util.*; 

public class SumOfN{
    public static void main(String[]Args){
        SumOfN s=new SumOfN();
        int a=s.sum(10);
        System.out.print("Sum is:"+a);
    }
    int sum(int n){
        if(n<0){
            return 0;
        }
        else{
            return n+sum(n-1);
        }
    }
}
