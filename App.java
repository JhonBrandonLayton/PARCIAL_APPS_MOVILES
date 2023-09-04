import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Recursividad en java: \n");
        
        Scanner lectura = new Scanner(System.in); 
        System.out.println("Ingrese numero base: ");
        int numBase = lectura.nextInt();

        System.out.println("Ingrese numero potencia: ");
        int numPotencia = lectura.nextInt();

        int potencia = (numBase*numPotencia)*numBase; 
        System.out.println("La potencia de Numero base: "+numBase+"\nNumero potencia: "+numPotencia+"\nEs: "+potencia);

    }
}
