import java.util.Scanner;



public class TryCatch {

    public static void main(String[] args) {

        Scanner Numero = new Scanner(System.in);
        System.out.println("HOLA ESTO ES UN DIVISOR DE NUMEROS!!");
        System.out.println("Ingresa el primer numero: ");

        int Num1 = Numero.nextInt();

        System.out.println("Ingresa el segundo numero: ");

        int Num2 = Numero.nextInt();
        try {
            double Division = Num1/Num2;

            System.out.println("El resultado de la division de "+Num1+" y "+Num2+ " es: "+Division);
        } catch ( ArithmeticException e) {
            System.out.println("Error: no es posible dividir por 0.");
        }
        System.out.println("¡¡GRACIAS!!");

        Numero.close();

    }




}