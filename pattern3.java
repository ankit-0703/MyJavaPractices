import java.util.*;

public class pattern3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number of rows");
        int r=sc.nextInt();
        for(int i=5;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}