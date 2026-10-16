import java.util.Scanner;

public class EvenNumberSum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("masukan angka dengan sejumlah N : ");
        int N = input.nextInt();

        int count = 0;
        for (int i = 0; i <= N; i++){
            if (i % 2 == 0){
                count += i;
            }
        }

        System.out.print("Sum of numbers even : "+ count);
    }
}