import java.util.Scanner;
//crear clase
public class reto2{
    //invocar metodo main
    public static void main(String args[]){

        //declarar variables
        String palabra;
        int izquierda,derecha;

        //instaciar la clase scanner
        Scanner Capturar= new Scanner(System.in);

        //solicitar datos
        System.out.println("Digite una palabra");
        //capturar datos
        palabra=Capturar.next();
        //Convertir palabras en minusculas con el metodo toLowerCase
        palabra=palabra.toLowerCase();

        //Crear vector y usar el meetodo toCharArray para separar las letras y guardarlas individualmente en el vector
        char [] palindromo= palabra.toCharArray();
        //Inicializar contador izquierdo
        izquierda=0;
        //Inicializar contador derecho con las posiciones del vector menos uno porque las numeraciones en java empiezan en 0, 
        //por lo tanto no existe una posicion 5 en el vector
        derecha=palindromo.length-1;

        //bucle para comprobar palabra
        for (int i=0;izquierda<derecha;i++) {
            /*condicion para ver si el vector con la posicion del contador izquierdo es igual al vector con la posicion del contador derecho si es 
            si el contador derecho disminuye y el izquierdo aumenta */
            if (palindromo[izquierda]==palindromo[derecha]) {
                derecha--;
                izquierda++;
            }
            //si no cumple con la condicion la palabra no es un palindromo
            else{
                System.out.println("La palabra no es un palindromo");
                //el break es para romper el ciclo y saltar a la siguiente linea
                break;
            }
        }
        //Ahora si el contador de la izquierda es igual a la derecha lanza el mensaje de que es un palindromo
        if (izquierda==derecha) {
            System.out.println("La palabra "+palabra+" es un palindromo");
        }
        
        
        Capturar.close();


     }
}


