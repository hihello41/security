import java.util.Scanner;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
public class DES {
    public static void main(String[] argv) {
        try {
            System.out.println("Message Encryption Using DES Algorithm\n ");
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();
            Cipher desCipher;
            desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the plain text: ");
            String ptext = scan.next();
            ptext += scan.nextLine();
            byte[] text = ptext.getBytes();
            System.out.println("Plain text [Byte Format]: " + text);
            byte[] textEncrypted = desCipher.doFinal(text);
            System.out.println("Encrypted plain text:" + textEncrypted);
            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            byte[] textDecrypted = desCipher.doFinal(textEncrypted);
            System.out.println("Decrypted cipher text: " + new String(textDecrypted));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
