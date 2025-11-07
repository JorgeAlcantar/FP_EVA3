
package eva3_5_arreglos_metodos;


public class EVA3_5_ARREGLOS_METODOS {


    public static void main(String[] args) {
        System.out.println("***CREADOR DE ARREGLOS***");
        int[] miArreglo;
        miArreglo = crearArreglo(50,1000);
        imprimirArreglo(miArreglo);
        //ARREGLO EN MÉTODOS
    }
    //METODO PARA CREAR UN ARREGLO Y LO DEVUELVA LLENO DE VALORES ALEATORIOS
    public static int[] crearArreglo(int tamaño, int valorAleatorio){
        int resu[] = new int[tamaño];
        for(int i = 0; i < resu.length; i++){
            resu[i] = (int)Math.random() * valorAleatorio;
        }
        return resu;
    
    }
    //IMPRIMIR UN ARREGLO
    public static void imprimirArreglo(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
}
