import java.io.*;
import java.util.*;

class fibnocci
{
  

	static int fib(int i)
	 {

	    if(i<=1)
	    {
	 	return 1;
	    }
	 else 
	    {
	 	return fib(i-1) + fib(i-2);
	    }

    }


    public static void main(String[] args) 

    {
    	
    int n = fib(5);
	System.out.println(n);
	
   
    }



}