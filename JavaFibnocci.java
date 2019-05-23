import java.util.*;
import java.io.*;

class JavaFibnocci{

    //ArrayList<int> memory=new ArrayList();
    static int[] a= new int[100];
    

    static int fib(int n){

        if(a[n]!=0)
        {
            return a[n];
        }
        
        if(n==0 || n==1){
            a[n]=1;
            return 1;
        }
        
        int val= fib(n-1) + fib(n-2);
        a[n]=val;
        return val;

        
        
    }

    public static void main(String[] args) {
        
        int p = fib(5);
        System.out.println(p);

    
        
    }
}