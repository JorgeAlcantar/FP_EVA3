
package eva3_3_metodos;

import java.util.Scanner;


public class EVA3_3_METODOS {


    public static void main(String[] args) {
        //DIVIDIR UN PROYECTO EN VARIAS PARTES
        Scanner input = new Scanner(System.in);
        int valor;
        do{
            imprimirMenu();
            valor = input.nextInt();
            //MANEJO DE OPCIONES
            switch(valor){
                case 1:
                    System.out.println("***CALCULADORA DE SUMAS***");
                    calcularSuma();
                    break;
                case 2:
                    System.out.println("CALCULADORA DE POTENCIAS***");
                    calcularPotencia();
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(valor != 4);
        
    }
    //Imprimir menú 
    public static void imprimirMenu(){
        System.out.println("***FREDDY FAZBEAR´S PIZZA");
        System.out.println("Elige la opción que necesitas: ");
        System.out.println("1. Calcular una suma");
        System.out.println("2. Calcular una potencia");
        System.out.println("3. Imprimir un mensaje");
        System.out.println("4. Terminar");
    }
    //CALCULAR SUMA
    public static void calcularSuma(){
        Scanner input = new Scanner(System.in);
        int val1, val2;
        System.out.println("VALOR 1: ");
        val1 = input.nextInt();
        System.out.println("VALOR 2: ");
        val2 = input.nextInt();
        int resu = sumaCompleta(val1, val2);
        System.out.println("LA SUMA ES: " + resu);
    }
    public static int sumaCompleta(int num1, int num2){
        return num1 + num2;
    }
    public static void calcularPotencia(){
        Scanner input = new Scanner(System.in);
        int val3, val4;
        System.out.println("NUMERO QUE VA A ELEVAR: ");
        val3 = input.nextInt();
        System.out.println("VALOR DE LA POTENCIA: ");
        val4 = input.nextInt();
        int resu1 = potenciaCompleta(val3, val4);
        System.out.println("EL RESULTADO DE LA POTENCIA ES: " + resu1);
    }
    public static int potenciaCompleta(int base, int exp){
        int potencia = 1;
        for(int i = 0; i <= exp; i++){
            potencia = base * base;
        }
        return potencia;
    }
}
