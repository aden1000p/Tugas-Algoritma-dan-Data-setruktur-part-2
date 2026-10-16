import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // menentukan input dari 2 sampai N
        System.out.print("masukan angka sejumlah N : ");
        int N = input.nextInt();

        // menguraikan dari 2 sampai ke N 
        for (int angka = 2; angka <= N; angka++){
            // anggap ini adalah area prima 
            boolean prima = true;
            // kita buat yang bukan primanya ini khusus bilangan tidak prima
            for (int i = 2; i < angka; i++){
                if (angka % i == 0){
                    prima = false;
                    break;
                }
            }

            // jika prima true artinya disini terdapat bilangan prima; 
            if (prima){
                System.out.print(" "+angka+" ");
            }
        }
    }
}