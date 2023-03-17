import java.util.Scanner;

//crear la clase
public class reto3 {
    //invocar metodo main
    public static void main(String[] args) {
        //declarar variables
        String[][]nombre=new String[4][4];
        int[][]precio=new int[4][4];

        //instanciar clase scanner
        Scanner Capturar=new Scanner(System.in);

        //bucle para capturar datos
        for(int fila=0;fila<4;fila++){
            for (int columna=0;columna<4;columna++) {
                System.out.println("Digite el nombre del producto");
                nombre[fila][columna]=Capturar.next();
                System.out.println("Digite el precio del producto");
                precio[fila][columna]=Capturar.nextInt();
            }
        }
        
        
        //mensajes con el resultado
        System.out.println("Catálogo de productos");
        for (int fila=0;fila<4;fila++) {
            System.out.print("| ");
            for (int columna=0;columna<4;columna++) {
                System.out.print(fila+""+columna+" "+nombre[fila][columna]+"  $"+precio[fila][columna]+" | ");
            }
            System.out.println(" ");
        }
        
        Capturar.close();
    }
}