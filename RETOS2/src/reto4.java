//crear la clase
public class reto4 {
    //invocar metodo main
    public static void main(String[] args) {
        //declarar variables
        String[][]calculadora=new String[5][4];
        //llenar matriz
        calculadora[0][0]=" ";
        calculadora[0][1]=" ";
        calculadora[0][2]=" ";
        calculadora[0][3]="C";

        calculadora[1][0]="7";
        calculadora[1][1]="8";
        calculadora[1][2]="9";
        calculadora[1][3]="/";

        calculadora[2][0]="4";
        calculadora[2][1]="5";
        calculadora[2][2]="6";
        calculadora[2][3]="x";

        calculadora[3][0]="1";
        calculadora[3][1]="2";
        calculadora[3][2]="3";
        calculadora[3][3]="-";

        calculadora[4][0]="0";
        calculadora[4][1]=".";
        calculadora[4][2]="=";
        calculadora[4][3]="+";
        //mensajes con el resultado
        System.out.println("Calculadora");
        System.out.println(calculadora[0][0]+" | "+calculadora[0][1]+" | "+calculadora[0][2]+" | "+calculadora[0][3]);
        System.out.println(calculadora[1][0]+" | "+calculadora[1][1]+" | "+calculadora[1][2]+" | "+calculadora[1][3]);
        System.out.println(calculadora[2][0]+" | "+calculadora[2][1]+" | "+calculadora[2][2]+" | "+calculadora[2][3]);
        System.out.println(calculadora[3][0]+" | "+calculadora[3][1]+" | "+calculadora[3][2]+" | "+calculadora[3][3]);
        System.out.println(calculadora[4][0]+" | "+calculadora[4][1]+" | "+calculadora[4][2]+" | "+calculadora[4][3]);
    }
}
