package Recursion; 
class PrintnamesNtime{
    static void PrintName(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Eswar");
        PrintName(i+1,n);
    }
    public static void main(String[] args){
        int n = 5;
        PrintName(1,n);
    }
}