import java.util.*;
public class RowColumn {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("SIMULATING ROW & COLUMN TRANSPOSITION CIPHER");
        System.out.println("-----------------------");
        System.out.print("Enter the plain text:");
        String pl= sc.next();
        pl+=sc.nextLine();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        String s= "";
        s= pl.replaceAll(" ","");
        int len=s.length();
        int k = 0;
        int row= (int)Math.ceil((double)len/col);
        char ch[][] = new char[row][col];
        for (int i=0; i< row; i++) {
            for (int j =0;j < col; j++) {
                if (k < len) {
                    ch[i][j] = s.charAt(k);
                    k++;
                }
                else {
                    ch[i][j]= 'X';
                }
            }
        }
        System.out.println("The row and column matrix");
        for (int i = 0; i< row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ch[i][i] + " ");
            }
            System.out.println();
        }
        System.out.print("The cipher text is: ");
        for (int i=0; i< col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(ch[j][i]);
            }
        }
    }
}


