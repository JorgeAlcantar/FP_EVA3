
package eva3_6_arreglos_metodos;


public class EVA3_6_ARREGLOS_METODOS {
        final static String[] menu = {"Productos", "Ventas", "Clientes", "Salir"};
        final static String[] productos = {"Tacos", "Pizza", "Soda", "Hamburguesas"};

    public static void main(String[] args) {
        //
        System.out.println(menu);
        System.out.println(productos);
    }
        //IMPRIMIR UN ARREGLO
    public static void imprimirArreglo(String[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(i + 1 + "[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
}
