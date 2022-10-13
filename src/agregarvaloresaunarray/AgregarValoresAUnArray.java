package agregarvaloresaunarray;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author LENOVO
 */
public class AgregarValoresAUnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroElementos;
        
        System.out.println("Digite el numero de elementos que tendra el Array:");
        numeroElementos = entrada.nextInt();
        String [] letras = new String[numeroElementos];

        System.out.println("Digite los los elementos del arreglo:");
        
        for(int i = 0; i < numeroElementos; i++){
            System.out.println("Digite el caracter "+(i+1)+":");
            letras[i] = entrada.next();
        }

        System.out.println("\n\nLos caracteres del Array son: ");
        for(int i = 0; i < numeroElementos; i++){
            System.out.print(letras[i]+" ");
        }
    }
}
