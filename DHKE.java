import java.util.Scanner;
class DHKE{
    public static void main (String[] args) {
        int q= 23;
        int a =5;
        System.out.println("Simulation of Diffie-Hellman key exchange algorithm\n-----");
        System.out.println("Global public element prime number q= "+ q);
        System.out.println("Global public element a =" + a);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the private key of user A (Xa<q Here the value of q is 23): ");
        int Xa = scan.nextInt();
        System.out.print("Enter the private key of user B (Xb<q Here the value of qis 23): ");
        int Xb= scan.nextInt();
        double Ya = (Math.pow(a, Xa)) % q;
        double Kb = (Math.pow(Ya, Xb)) % q;
        double Yb = (Math.pow(a, Xb)) % q; double Ka = (Math.pow(Yb, Xa)) % q;
        System.out.println("Public key of User A (Ya): "+ Ya);
        System.out.println("User B computes signature using public key of user A (Kb):"+ Kb);
        System.out.println("Public key of User B (Yb): " + Yb);
        System.out.println("User A computes signature using public key of user B (Ka): "+ Ka);
        if (Ka == Kb)
            System.out.println("'Success: Shared key matches! "+ Ka);
        else
            System.out.println("Error: Shared key does not match");
    }
}