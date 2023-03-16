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
        System.out.println(" 0,0  "+nombre[0][0]+"  $"+precio[0][0]+" | "+" 0,1  "+nombre[0][1]+"  $"+precio[0][1]+" | "+" 0,2  "+nombre[0][2]+"  $"+precio[0][2]+" | "+" 0,3  "+nombre[0][3]+"  $"+precio[0][3]);
        System.out.println(" 1,0  "+nombre[1][0]+"  $"+precio[1][0]+" | "+" 1,1  "+nombre[1][1]+"  $"+precio[1][1]+" | "+" 1,2  "+nombre[0][2]+"  $"+precio[1][2]+" | "+" 1,3  "+nombre[1][3]+"  $"+precio[1][3]);
        System.out.println(" 2,0  "+nombre[2][0]+"  $"+precio[2][0]+" | "+" 2,1  "+nombre[2][1]+"  $"+precio[2][1]+" | "+" 2,2  "+nombre[0][2]+"  $"+precio[2][2]+" | "+" 2,3  "+nombre[2][3]+"  $"+precio[2][3]);
        System.out.println(" 3,0  "+nombre[3][0]+"  $"+precio[3][0]+" | "+" 3,1  "+nombre[3][1]+"  $"+precio[3][1]+" | "+" 3,2  "+nombre[0][2]+"  $"+precio[3][2]+" | "+" 3,3  "+nombre[3][3]+"  $"+precio[3][3]);

        Capturar.close();
    }
}