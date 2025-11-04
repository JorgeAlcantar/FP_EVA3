
package eva3_1_metodos;


public class EVA3_1_METODOS {


    public static void main(String[] args) {
        //INVOCACIÓN DEL METHOD 
        // LLAMADA PROCEDIMIENTO O FUNCIÓN
        //1. Si queremos recuperar el valor.
        int resu = calcularCuadrado(4);
        System.out.println("El cuadrado de 4 es: " + resu);
        //2. Llamar y no almacenar
        System.out.println("El cuadrado de 4 es: " + calcularCuadrado(4));
        //3. NO REGRESA NINGÚN RESULTADO, PERO LO LLAMA 
        calcularCuadrado(4);
    }
    //modificadores 
    //public, private, protected, default --- modificador de acceso
    //STATIC -- SE NECESITA PARA USAR NUESTRO MÉTODOS EN EL MAIN
    //public static
        //VALOR DE RETORNO (tipo de dato)
            //(LISTA DE PARAMETROS) 
            //CERO O N CANTIDAD DE PARAMETROS
    public static int calcularCuadrado(int num){//ENCABEZADO DEL MÉTODO: DECLARACIÓN 
        //{} ---- > IMPLEMENTACIÓN DEL MÉTODO (CUERPO DEL MÉTODO)
        int cuadrado = num * num;
        return cuadrado;//REGRESAMOS EL RESULTADO DE LA OPERACIÓN
        //YA NO PUEDE SEGUIR EL CÓDIGO AQUÍ, DESPUÉS DEL RETURN
    }
}
