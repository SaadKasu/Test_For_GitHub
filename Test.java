import java.lang.*;
import java.util.*;

Class Test{
    public static void main(String [] args){
        System.out.println("This is a Test");
    }
    static boolean isPrime(int num){
        for(int i =2;i<=Math.sqrt(num);i++)
            if (num%i==0)
                return false;
        return true;        
    }
    static boolean isGreater(int a,int b){
        if (a>b)
            return true;
        else
            return false;    
    }
}