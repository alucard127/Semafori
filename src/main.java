import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        int L;
        System.out.println("Enter Times: ");
        N = scan.nextInt();
        L = scan.nextInt();

        int x = 0;
        int t = 0;
        for (int i = 0; i < N; i++)
        {
            int D;
            int R;
            int G;
            D =  scan.nextInt();
            R =  scan.nextInt();
            G =  scan.nextInt();
            t += D - x;
            x = D;
            while (t % (R + G) < R)
            {
                t++;
            }
        }
        t += L - x;
        x = L;

        System.out.println(t);

    }

}