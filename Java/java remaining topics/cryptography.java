import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;


public class cryptography {
    public static void main(String[] args) throws Exception {
        // Generate a secret key
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // AES-256
        SecretKey secretKey = keyGen.generateKey();

        // Initialize cipher for encryption
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Encrypt
        String plaintext = "Hello, World!";
        byte[] encrypted = cipher.doFinal(plaintext.getBytes());
        String encryptedText = Base64.getEncoder().encodeToString(encrypted);
        System.out.println("Encrypted: " + encryptedText);

        // Initialize cipher for decryption
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        System.out.println("Decrypted: " + new String(decrypted));
    }
}