package by.andervyd.standard_libraries.security.check_pass;

import by.andervyd.standard_libraries.security.encryption.PassEncrypt;

public class PassComparerDemo {
    public static void main(String[] args) {

        String pass = "root1234";

        byte[] bytePass = PassEncrypt.encrypt(pass);

        PassComparer comparer = new PassComparer();
        boolean isCheck = comparer.isEqual(bytePass, pass);

        System.out.println(isCheck);
    }
}
