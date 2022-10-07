package com.revature;

public class PrimeNumber {
    public static boolean isPrime(int a){

        for (int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }

}
