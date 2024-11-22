import java.util.*;

import javax.swing.JOptionPane;


public class InvertirVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //JOptionPane.showMessageDialog(null,"Ingrese el tamaño del vector");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
        int[] numeros = new int[n];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(numeros));
        numeros = invertirVector(numeros);
        JOptionPane.showMessageDialog(null,Arrays.toString(numeros));
        String[] opciones ={"si","no","talvez"};
        //JOptionPane.showOptionDialog(null,"Seleccione opcion","Opciones",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, opciones,null);
        

    }

    public static int[] invertirVector(int[] numeros){
        for (int i = 0; i < numeros.length/2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length-1-i];
            numeros[numeros.length-1-i]=temp;
        }
        return numeros;
    }
}
