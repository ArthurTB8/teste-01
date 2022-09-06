import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer01 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a quantidade de dinheiro a ser sacada: ");
            int  X = 0;

            try {
                X = entrada.nextInt();
                validarValor(X);

                System.out.println(X / 100+ " nota(s) de R$ 100,00");
                X = X % 100;

                System.out.println(X / 50+ " nota(s) de R$ 50,00");
                X = X % 50;

                System.out.println(X / 20+ " nota(s) de R$ 20,00");
                X = X % 20;

                System.out.println(X / 10+ " nota(s) de R$ 10,00");
                X = X % 10;

                System.out.println(X / 5+ " nota(s) de R$ 5,00");
                X = X % 5;
            }
            catch(InputMismatchException error) {
                System.out.print("Valor precisa ser um numero inteiro");
            }
            catch(RuntimeException e){
                System.out.println(e.getMessage());
            }



        }
    public static void validarValor( int valor){
        if (valor<= 0){
            throw new RuntimeException("Valor precisa ser maior que 0");
        }   else if ((valor % 5) != 0){
            throw new RuntimeException("Valor precisa ser multiplo de 5");
        }
    }

    }
