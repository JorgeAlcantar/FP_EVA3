
package eva3_2_metodo;


public class EVA3_2_METODO {


    public static void main(String[] args) {
        // CÓDIGO main
        repetirMensaje("HOLA", 6);//EL MÉTODO TIENE QUE ESTAR ESCRITO EN ORDEN, EN ESTE CASO NO REGREA NINGÚM VALOR, SI ES ESCRITO EN ORDEN DISTINTO APARECERA UN ERROR.
    }
    //DECLARACIÓN DEL MÉTODO
    public static void repetirMensaje(String mensaje, int repetición){
        for(int i = 0; i < repetición; i++){
            System.out.println(mensaje);
        }
    
    }
}
