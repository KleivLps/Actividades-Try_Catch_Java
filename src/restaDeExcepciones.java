import java.util.Scanner;

public class restaDeExcepciones {

        public static void main(String[] args) {

            Scanner Numero = new Scanner(System.in);
            System.out.println("HOLA ESTO ES UNA RESTA DE NUMEROS!!");
            System.out.println("Ingresa el primer numero: ");

            int Num1 = Numero.nextInt();

            System.out.println("Ingresa el segundo numero: ");

            int Num2 = Numero.nextInt();
            try {
                double Resta = Num1-Num2;

                System.out.println("El resultado de la division de "+Num1+" y "+Num2+ " es: "+Resta);
            } catch ( Exception e) {
                System.out.println("Error: no se añadio ningun numero.");
            }
            System.out.println("¡¡GRACIAS!!");

            Numero.close();

        }




    }


