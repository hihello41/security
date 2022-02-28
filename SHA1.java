import java.security.*;
import java.util.Scanner;
public class SHA1 {
    public static void main(String[] a){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            System.out.println("Message digest object info: \n--");
            System.out.println("Algorithm-"+ md.getAlgorithm());
            System.out.println("Provider=" + md.getProvider());
            System.out.println("ToString"+ md.toString());
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the message: ");
            String input = scan.next() ;
            input += scan.nextLine();
            md.update(input.getBytes());
            md.update(input.getBytes());
            byte[] output= md.digest();
            System.out.println("SHA1(\""+ input + "\")="+ bytesTo Hex(output);
            catch (Exception e){
                System.out.println("Exception:" + e)
            }
        }
        private static String bytesToHex(bytel b){
            char hexDigit[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}
            StringBuffer buf = new StringBuffer();
            for (byte aB : b) {
                buf.append(hexDigit[(aB >> 4) & Ox0f]);
                buf.append(hexDigit[aB & 0xOf]);
            }
            return buf.toString();
        }
    }