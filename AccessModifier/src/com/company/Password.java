package com.company;

public class Password {
    private static final int key = 134968;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){
        // can make methods final to prevent overridden
        System.out.println("Saving password as "+ this.encryptedPassword);
    }

    public boolean login(int password){
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("success");
            return true;
        } else {
            System.out.println("fail");
            return false;
        }
    }

}
