import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.NumberFormat;

public class Exer02 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            DecimalFormat format = new DecimalFormat("####.#");

            int candA,candB,candC,candNul,votos;
            float valido,votosValidos,valorA,valorB,valorC,valorD;

            System.out.print("=========== Menu de Votação ===========\n");

            System.out.print("1 - Candidato A\n");

            System.out.print("2 - Candidato B\n");

            System.out.print("3 - Candidato C\n");

            System.out.print("4 - Voto Nulo\n");

            System.out.print("\n");


            try {
                System.out.print("Digite o código do candidato para o primeiro voto: \n");
                candA = entrada.nextInt();

                System.out.print("Digite o código do candidato para o segundo voto: \n");
                candB = entrada.nextInt();

                System.out.print("Digite o código do candidato para o terceiro voto: \n");
                candC = entrada.nextInt();

                System.out.print("Digite o código do candidato para o quarto voto: \n");
                candNul = entrada.nextInt();

                validarValor(candA);

                validarValor(candB);

                validarValor(candC);

                validarValor(candNul);



                votos = candA + candB + candC + candNul;
                votosValidos = (candA + candB + candC) - candNul;
                valido = (votosValidos * 100) / (float)votos;
                valorA = (candA * 100) / (float)votos;
                valorB = (candB * 100) / (float)votos;
                valorC = (candC * 100) / (float)votos;
                valorD = (candNul * 100) / (float)votos;

                System.out.println("       ");

                System.out.println("Percentual de Votos Válidos: "+format.format(valido)+" %");

                System.out.println("Percentual de Votos Candidato 1: "+format.format(valorA)+" %");

                System.out.println("Percentual de Votos Candidato 2: "+format.format(valorB)+" %");

                System.out.println("Percentual de Votos Candidato 3: "+format.format(valorC)+" %");

                System.out.println("      ");
                System.out.println("      ");

                if (candA > candB && candA > candC){
                    
                System.out.print("Candidato vencedor: Candidato A");
                
                } else if (candB > candA && candB > candC) {

                    System.out.print("Candidato vencedor: Candidato B");

                } else if (candC > candA &&  candC > candB) {

                    System.out.print("Candidato vencedor: Candidato C");
                }

            }
            catch(InputMismatchException error) {
                System.out.print("Opção inválida, o voto não será computado");
            }
            catch(RuntimeException e){
                System.out.println(e.getMessage());
            }



        }
    public static void validarValor( int valor){
        if (valor<= 0){
            throw new RuntimeException("Opção inválida, o voto não será computado");
        }
    }

    }
