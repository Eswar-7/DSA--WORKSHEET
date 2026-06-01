package Recursion;

public class Print1toN {
    static void Printnumber(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        Printnumber(i+1, n);
    }
    public static void main(String[] args) {
        int n = 10;
        Printnumber(1,n);
    }
    
}
