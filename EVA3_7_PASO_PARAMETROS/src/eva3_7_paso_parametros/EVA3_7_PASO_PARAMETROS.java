/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_parametros;

/**
 *
 * @author JORGE
 */
public class EVA3_7_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        int numero = 5;
        System.out.println("ORIGINAL: " + numero);
        incrementar(numero);//SE MANDA UNA COPIA DEL VALOR ALMACENADO EN numero
        System.out.println("DESPUES DE INCREMENTAR: " + numero);
    }
    //IMCRMENTA UN ENTERO EN 1
    public static void incrementar(int valor){//INCREMENTA EL DUPLICADO, PERO NO EL VALOR ORIGINAL, ES SOLO UN DUPLICADO LO QUE SE ENVÍA A OTROS METHODS
        valor = valor + 1;
        
    }
    
}
