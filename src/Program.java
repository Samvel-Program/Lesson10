import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Заполните массив");
        int t, i;
        int table[][] = new int[2][2];
        for (t = 0; t < 2; t++) {
            for (i = 0; i < 2; i++) {

                table[t][i] = in.nextInt();
            }
        }

        for (i = 0; i < 2; i++) {
            System.out.println(table[0][i]*3);
        }
    }
}
