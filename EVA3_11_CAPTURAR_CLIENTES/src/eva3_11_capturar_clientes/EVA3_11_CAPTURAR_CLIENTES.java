
package eva3_11_capturar_clientes;

import java.util.Scanner;


public class EVA3_11_CAPTURAR_CLIENTES {


    public static void main(String[] args) {
        //
        String[] clientes = new String[10];
        double[] credito = new double[10];
        System.out.println("CAPTURA DE CLIENTES");
        capturarClientes(clientes, credito);
        System.out.println("NOMBRES");
        imprimirArreglo(clientes);
        System.out.println("CREDITOS");
        imprimirCredito(credito);
        System.out.println("CLIENTES Y CREDITOS:");
        imprimirArre(clientes, credito);
        
        
        
    }
    public static void capturarClientes(String[] clientes, double credito[]){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < clientes.length; i++){
            Scanner input2 = new Scanner(System.in);
            System.out.println("NOMBRE DE CLIENTES");
            clientes[i] = input2.nextLine();
            
            System.out.println("Creditos:");
            credito[i] = input.nextDouble();
        
        }
        System.out.println("");
    
    }
    public static void imprimirArreglo(String[] clientes){
        for(int i = 0; i < clientes.length; i++){
            System.out.println("NOMBRE DE CLIENTES");
            System.out.println("[" + clientes[i] + "]");
            }
        System.out.println("");
    }
    public static void imprimirCredito(double[] credito){
        for(int i = 0; i < credito.length; i++){
            System.out.println("CREDITO");
            System.out.println("[" + credito[i] + "]");
        
        }
        System.out.println("");
    }
    public static void imprimirArre(String[] arreglo, double[] credito){
        for(int i = 0; i < credito.length; i++){
            System.out.println("[" + arreglo[i] + "]");
            System.out.println("[" + credito[i] + "]");
        
        }
        System.out.println("");
    }
}
