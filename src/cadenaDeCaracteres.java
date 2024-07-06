import java.util.Scanner;



public class cadenaDeCaracteres {

    public static void main(String[] args) {
        Scanner Cadena = new Scanner(System.in);
        System.out.println("CADENA DE CARACTERES");
        System.out.println("Ingresa una cadena de caracteres que representan un numero entero:");

        String Caracteres = Cadena.nextLine();

        try {
            int numero = Integer.parseInt(Caracteres);
            System.out.println("El numero ingresado es :" +numero);
        } catch (NumberFormatException e ){
            System.out.println("Error: la cadena no puede ser convertida en un numero entero.");
        }

        Cadena.close();

    }
}
