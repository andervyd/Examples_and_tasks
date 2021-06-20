package by.andervyd.standard_libraries.security.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PassEncrypt {

    public static byte[] encrypt(String pass) {
        try {
            MessageDigest digest = MessageDigest.getInstance("sha-1");
            digest.update(pass.getBytes());
            return digest.digest();

        } catch (NoSuchAlgorithmException e) {
        }
        return null;
    }
}
