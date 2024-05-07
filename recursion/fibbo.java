import java.util.Scanner;
class fibbo{
    public int fibbos(int n){
        if(n<2){
            return n;
        }
        else{
            return fibbos(n-1)+fibbos(n-2);
        }
    }
    public static void main(String[] args){
        fibbo f=new fibbo();
        int n=5;
        System.out.print(f.fibbos(n));

    }
}