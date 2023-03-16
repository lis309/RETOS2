import java.util.Scanner;
//crear clase
public class reto1 {
    //invocar metodo main
    public static void main(String args[]){

        //declarar variables
        String nombre,letra;
        int apuesta,resta,resultado=0;
        int oportunidades=0;
        int victorias=0;
        int suma=0;

        //instaciar la clase scanner
        Scanner Capturar= new Scanner(System.in);

        String [] palabra= new String[4];
        palabra[0]="s";
        palabra[1]="e";
        palabra[2]="n";
        palabra[3]="a";

        //condicion para repetir el proceso
        for (int i=0;i<=oportunidades || i<=victorias;i++) {
            //solicitar datos
            System.out.println("Digite su nombre");
            nombre=Capturar.next();
            //solicitar datos
            System.out.println("Digite la cantidad que desea apostar");
            apuesta=Capturar.nextInt();
            System.out.println("Una letra");
            letra=Capturar.next();
            letra=letra.toLowerCase();
            //creando condicion para el comparar si la letra es igual a la que esta en el vector
            if (letra.equals(palabra[i])) {
                System.out.println("La letra es correcta");
                suma=suma+apuesta;
                resultado=suma;
                victorias=victorias+1;
                //condicion para mostrar el mensaje al ganador
                if ( victorias==3) {
                    System.out.println("Felicidades!!! "+nombre+" usted acumulo "+resultado+" la palabra era "+palabra[0]+palabra[1]+palabra[2]+palabra[3]);
                }
                
            }
            else{
                System.out.println("la letra es incorrecta");
                //operacion apuesta
                resta=suma-apuesta;
                resultado=resta;
                oportunidades++;
                //condicion para las oportunidades
                if (oportunidades==3) {
                    System.out.println("El juego a terminado la palabra era "+palabra[0]+palabra[1]+palabra[2]+palabra[3]);
                    System.out.println(nombre+" su ganacia fue de "+resultado);
                }
            }
        }
            

            
        Capturar.close();


     }
}
