
package eva3_14_sobrecargas_de_metodos;

import java.util.Scanner;


public class EVA3_14_SOBRECARGAS_DE_METODOS {


    public static void main(String[] args) {
        //EJERCICIOS PARA CALCULAR EL AREA
        int eleccion;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("***CALCULADORA DE ÁREAS DE FÍGURAS GEOMÉTRICAS***");
            System.out.println("1. ÁREA DE UN CIRCULO");
            System.out.println("2. ÁREA DE UN TRAPECIO");
            System.out.println("3. ÁREA DE UN RECTANGULO");
            System.out.println("4. TERMINAR PROGRAMA");
            eleccion = input.nextInt();
            switch(eleccion){
                case 1:
                    capturarCirculo();
                    break;
                case 2:
                    capturarTrapecio();
                    break;
                case 3:
                    capturarRectangulo();
                    break;
            }
        }while(eleccion != 4);
    }
    public static void capturarCirculo(){
        Scanner input = new Scanner(System.in);
        double areaCirculo, resu;
        System.out.println("***ÁREA DE UN CIRCULO***");
        System.out.println("INTRODUCE EL RADIO DE LA CIRCUNFERENCIA: ");
        areaCirculo = input.nextDouble();
        resu = capturarArea(areaCirculo);
        System.out.println("AREA DEL CIRCULO: " + resu);
    }
    public static double capturarArea(double valor){
        double resu1;
        resu1 = 3.1416 * valor;
        return resu1;

    }
    public static void capturarTrapecio(){
        Scanner input = new Scanner(System.in);
        double baseMayor, baseMenor, altura, res3;
        System.out.println("***ÁREA DE UN TRAPECIO***");
        System.out.println("INTRODUCE LA BASE MAYOR: ");
        baseMayor = input.nextDouble();
        System.out.println("INTRODUCE LA BASE MENOR: ");
        baseMenor = input.nextDouble();
        System.out.println("INTRODUCE LA ALTURA: ");
        altura = input.nextDouble();
        res3 = capturarArea("EL ÁREA DEL TRAPECIO ES: ", baseMayor, baseMenor, altura);
        System.out.println("EL ÁREA DEL TRAPECIO ES: " + res3);
    
    }
    public static double capturarArea(String mensaje2, double base, double basemenor, double altura){
        double resultado;
        resultado = ((base + basemenor) * altura) / 2;
        return resultado;
    }
    public static void capturarRectangulo(){
        Scanner input = new Scanner(System.in);
        double base, altura, resucitado;
        System.out.println("***ÁREA DE UN RECTANGULO***");
        System.out.println("INTRODUCE LA BASE: ");
        base = input.nextDouble();
        System.out.println("INTRODUCE LA ALTURA: ");
        altura = input.nextDouble();
        resucitado = capturarArea("LA VARIABLE DE XOR ES or exclusivo, como XOR de UCN en FNaF 7", base, altura);
        System.out.println("EL ÁREA DEL RECTANGULO ES: " + resucitado);
    }
    public static double capturarArea(String mensajefnaf, double debajo, double h){
        double Salmos23;
        Salmos23 = debajo * h;
        return Salmos23;
    }
}
