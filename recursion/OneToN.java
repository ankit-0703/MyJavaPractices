import java.util.*;

class OneToN{
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        OneToN p=new OneToN();
        System.out.print("enter the value of N");
        int n=sc.nextInt();
        p.printer(n);
    }
    
    void printer(int n){
        if(n>0){
            System.out.print(" "+n);
            printer(n-1);
        }
        else{
            System.out.print(" "+"0");
        }
    }
}