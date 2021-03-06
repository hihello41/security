import java.util.Scanner;
public class railfenceCipher {
    String encode(String msg) {
        int len = msg.length();
        int k = 0, i = 0;
        String enc="";
        while (k!=len) {
            enc += msg.charAt(i);
            i += 2;
            if (i >= len) {
                i=1;
            }
            k++;
        }
        return enc;
    }

    String decode(String encmsg) {
        int len = encmsg.length();
        int k = 0, i = 0;
        int j = (int) Math.ceil((double) len / 2);
        String dec = "";
        while (k != len) {
            if (k % 2 == 0) {
                dec += encmsg.charAt(i);
                i++;
            }
            else{
                    dec += encmsg.charAt(j);
                    j++;
                }
                k++;
            }
            return dec;
        }
        public static void main(String[] args) {
        railfenceCipher rf = new railfenceCipher();
        String msg, enc, dec;
        Scanner scan = new Scanner(System.in);
        System.out.println("Simulating Railfence Cipher\n -- ");
        System.out.print("Enter the plain text: ");
        msg = scan.next();
        msg += scan.nextLine();
        enc = rf.encode(msg);
        dec = rf.decode(enc);
        System.out.println("Encrypted Message: " + enc);
        System.out.println("Decrypted Message: " + dec);
    }
}

