import java.util.Random;
import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10000);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i+":"+numeros[i]);
        }
    }
}
