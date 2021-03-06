import java.util.Scanner;
public class CaesarCipher {
    public static String encode(String enc, int offset){
        StringBuffer encoded = new StringBuffer();
        for (char i : enc.toCharArray()){
            if (Character.isLetter(i)){
                if (Character.isUpperCase(i)){
                    encoded.append((char) ('A'+(i-'A'+ offset)% 26));
                }
                else {
                    encoded.append((char) ('a'+(i-'a'+ offset)% 26));
                }
            }
            else{
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
    public static String decode(String enc,int offset) {
        return encode(enc, 26 - offset);
    }
    public static void main(String[] args) throws java.lang.Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println(" Simulating Caesar Cipher\n");
        System.out.println(" Enter the plain text");
        String msg = scan.next();
        System.out.println("Enter the key");
        Integer key = scan.nextInt();
        String cipher=encode(msg, key);
        System.out.println("Encrypted Message:");
        System.out.println(cipher);
        System.out.println("Decrypted Message:");
        System.out.println(decode(cipher, key));
    }
}
