import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        int D;
        N = scan.nextInt();
        D = scan.nextInt();

        int x = 0;
        int t = 0;
        for (int i = 0; i < N; i++) {
            int L;
            int C;
            int Z;
            L =  scan.nextInt();
            C =  scan.nextInt();
            Z =  scan.nextInt();

            t += L - x;
            x = L;
            while (t % (C + Z) < C) {
                System.out.println("TIEMPO: "+t);
                ++t;
            }
        }
        t += D - x;
        x = D;
        System.out.printf ("%d\n", t);

    }
}