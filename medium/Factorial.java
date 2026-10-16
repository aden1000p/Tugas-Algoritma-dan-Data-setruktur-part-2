public class Factorial {
    public static void main(String[] args){
        int fact = 1;
        for (int i = 1; i <= 3; i++){
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}

