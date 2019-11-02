package com.company;

import java.math.BigInteger;

public class bigFactorial {

    public void factorial(int n){
        BigInteger result = new BigInteger("1");
        for(int i=2; i<=n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }

}
