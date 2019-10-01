import java.util.Scanner;

public class sumOfMatrix {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of matrix :");
        n = scanner.nextInt();
        int array[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j ++){
                System.out.print("A [" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                if (i==j){
                    sum += array[i][j];
                }
            }
        }
        System.out.print("Sum = " + sum);
    }
}
