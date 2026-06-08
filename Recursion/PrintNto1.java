package Recursion;

public class PrintNto1 {
    static void printreversenumbers(int i, int n ){
        if(i < 1){
            return;
        }
        System.out.println(i);
        printreversenumbers(i - 1,n);
    }
    public static void main(String[] args) {
         int n = 10;
        printreversenumbers(n,n);
    }
}