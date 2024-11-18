import java.util.Scanner;

public class Clase_18_11_2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();

        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }

        System.out.println(nombre.toUpperCase());


    }
}
