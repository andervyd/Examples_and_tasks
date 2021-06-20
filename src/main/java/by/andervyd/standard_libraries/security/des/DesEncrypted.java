package by.andervyd.standard_libraries.security.des;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class DesEncrypted {  // NOT WORK (Base64)
    Cipher eCipher;
    Cipher dCipher;

    public DesEncrypted(SecretKey key) {
        try {
            eCipher = Cipher.getInstance("DES");
            dCipher = Cipher.getInstance("DES");

            eCipher.init(Cipher.ENCRYPT_MODE, key);
            dCipher.init(Cipher.DECRYPT_MODE, key);

        } catch (NoSuchAlgorithmException |
                    NoSuchPaddingException |
                        InvalidKeyException e) {
            e.printStackTrace();
        }
    }

    public String encrypt(String string) {
        try {
            byte[] utf8 = string.getBytes("utf8");
            byte[] enc = eCipher.doFinal(utf8);

//            return new Encoder(enc);

        } catch (UnsupportedEncodingException |
                    BadPaddingException |
                        IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String decrypt(String string) {
        try {
//            byte[] dec = new Base64.Decoder;
            byte[] utf8 = string.getBytes("utf8");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
