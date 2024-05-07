import java.util.*;

public class OneToN{
    public int printer(int n){
        if(n>0){
            return n;
            printer(n-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        printer p=new printer();
        System.out.print("enter the value of N");
        int n=sc.nextInt();
        System.out.println("Number are:"+p.printer(n));
    }

}