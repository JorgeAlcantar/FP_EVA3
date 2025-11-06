
package eva3_4_temperatura;

import java.util.Scanner;


public class EVA3_4_TEMPERATURA {

    public static void main(String[] args) {
        // CALCULADORA DE TEMPERATURA
        Scanner input = new Scanner(System.in);
        int eleccion;
        do{
            //MENÚ PRINCIPAL
            System.out.println("***CALCULADORA DE CONVERSIÓN DE TEMPERATURAS***");
            System.out.println("¿QUÉ OPERACIÓN DESEA REALIZAR?");
            System.out.println("1. FAHRENHEIT A CELSIUS.");
            System.out.println("2. CELSIUS A KELVIN.");
            System.out.println("3. FAHRENHEIT A KELVIN.");
            System.out.println("4. TERMINAR PROGRAMA.");
            eleccion = input.nextInt();
            //SELECCIÓN DE MENUS
            switch(eleccion){
                case 1:
                    celciusFahr();
                    break;
                case 2:
                    celKev();
                    break;
                case 3:
                    fahrKev();
                    break;
            }
        }while(eleccion != 4);//SELECCIÓN PARA SALIR DEL PROGRAMA

    }
    //OPERACIONES DE CONVERSIÓN
    public static double temperaturaFahrenheit(double far){ //OPERACIÓN DE CELCIUS A FAHRENHEIT
        double resu = (far - 32) / 1.8;
        return resu;
    }
    public static double celciusKelvin(double cel){//OPERACIÓN DE CELCIUS A KELVIN
        double resu1 = cel + 273.15;
        return resu1;
    }
    public static double fahrKelvin(double fahr1){//OPERACIÓN DE FAHRENHEIT A KELVIN
        double resu2 = ((5 * (fahr1  - 32)) / 9) + 273.15;
        return resu2;
    }
    //MENUS DE LAS OPERACIONES DE CONVERSIÓN
    public static void celciusFahr(){
        Scanner input = new Scanner(System.in);
        double fahr, resu;
        System.out.println("GRADOS FAHRENHEIT:");
        fahr = input.nextDouble();
        resu = temperaturaFahrenheit(fahr);
        System.out.println(fahr + " fahrenheit es: " + resu + "C");
    }
    public static void celKev(){
    Scanner input = new Scanner(System.in);
        double cel, resu;
        System.out.println("GRADOS CELCIUS:");
        cel = input.nextDouble();
        resu = celciusKelvin(cel);
        System.out.println(cel + " celcius es: " + resu + "K");
    }
    public static void fahrKev(){
        Scanner input = new Scanner(System.in);
        double fahr1, resu;
        System.out.println("GRADOS FAHRENHEIT:");
        fahr1 = input.nextDouble();
        resu = fahrKelvin(fahr1);
        System.out.println(fahr1 + " fahrenheit es: " + resu + "K");
    }
}
