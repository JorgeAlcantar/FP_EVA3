
package eva3_13_sobrecarga;

import java.util.Scanner;


public class EVA3_13_SOBRECARGA {

    public static void main(String[] args) {
        //CAPTURA
        String resu;
        resu = capturar("INTRODUCE EL NOMBRE DEL CLIENTE");
        System.out.println(resu);
        double dummy1 = capturar("SALARIO DEL CLIENTE", 0);
        System.out.println(dummy1);
        int resu1;
        resu1 = capturar("INTRODUCE LA EDAD:", 1);
        System.out.println(resu1);
    }
    public static String capturar(String mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextLine();
    }
    public static double capturar(String mensaje, double dummy){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        System.out.println(dummy);
        return input.nextDouble();
    }
    public static int capturar(String mensaje, int dummy){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        System.out.println(dummy);
        return input.nextInt();
    }
}
