import java.util.*;
public class pattern5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number of rows");
        int r=sc.nextInt();
        for(int i=r;i>0;i--){
            for(int k=i;k<=r;k++){
                System.out.print(" ");
            }

            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}