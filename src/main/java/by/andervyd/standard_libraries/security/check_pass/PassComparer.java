package by.andervyd.standard_libraries.security.check_pass;

import by.andervyd.standard_libraries.security.encryption.PassEncrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PassComparer {
    private MessageDigest messageDigest;
    private String encrypted;

    public PassComparer() {
    }

    public PassComparer(String encrypted) {
        this.encrypted = encrypted;
        try {
            messageDigest = MessageDigest.getInstance("sha-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public boolean isEqual(byte[] bytePass, String pass) {
        String encryptedPass = new String(PassEncrypt.encrypt(pass));
        return MessageDigest.isEqual(bytePass, pass.getBytes());
    }
}
