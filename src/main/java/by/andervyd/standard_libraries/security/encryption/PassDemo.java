package by.andervyd.standard_libraries.security.encryption;

public class PassDemo {
    public static void main(String[] args) {

        byte[] pass = PassEncrypt.encrypt("fdEr356dsDS");
        for (byte digest : pass) {
            System.out.print(digest);
        }
        // >> -91-428155-38-67-119120-8-21-35-61872-6187-3513-7358
    }
}
