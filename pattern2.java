import java.util.*;

public class pattern2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number of rows");
        int r=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}