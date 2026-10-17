import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka dari sejumlah N: ");  
        int N = input.nextInt();

        for (int angka = 2; angka < N; angka++){
            boolean prima = true;
            for (int i = 2; i < angka; i++){
                if (angka % i == 0){
                    prima = false;
                    break;
                }
            }

            if (prima){
                System.out.print(" "+angka+" ");
            }
        }
    }
}