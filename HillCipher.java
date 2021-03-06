import java. util. Scanner;
public class HillCipher {
    public static int[][] keymat = new int[3][3];
    private static String encode(char a, char b, char c) {
        String ret= "";
        int x, y, z;
        int posa = (int) a - 65;
        int posb=(int) b - 65;
        int posc= (int) c - 65;
        x= posa * keymat[0][0]+ posb * keymat[1][0] + posc * keymat[2][0];
        y= posa * keymat[0][1]+ posb * keymat[1][1] + posc * keymat[2][1];
        z= posa * keymat[0][2]+ posb * keymat[1][2] + posc * keymat[2][2];
        a=(char)(x % 26 + 65);
        b=(char)(y % 26 + 65);
        c=(char)(z % 26 + 65);
        ret = ""+a+b+c;
        return ret;
    }
    public static void main(String[] args) {
        String msg ;
        String enc = "";
        int n;
        System.out.println("Simulation of Hill Cipher\n------- ");
        System.out.println ("Enter the 3x3 key matrix(0 to 25)");
        Scanner scan=new Scanner(System.in);
        for(int i=0; i<3;i++){
            for (int j=0; j < 3 ;j++){
                keymat[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the plain text");
        msg=scan.next();
        msg+=scan.nextLine();
        msg= msg. toUpperCase();
        msg= msg.replaceAll("\\s", "");
        n = msg.length() % 3;
            if (n!=0) {
                for (int i = 1; i <= (3 - n); i++) {
                    msg += 'X';
                }
            }
            System.out.println("Padded plain text: " + msg);
                    char[] plaintext = msg.toCharArray();
                    for (int i = 0; i< msg.length(); i += 3){
                        enc += encode(plaintext[i], plaintext[i + 1], plaintext[i + 2]);
                    }
                    System.out.println("Encoded cipher text " + enc);
            }
    }