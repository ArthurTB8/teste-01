import java.util.InputMismatchException;
import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            String indiviA, indiviB, indiviC, sexoA, sexoB, sexoC;
            int idadeA, idadeB, idadeC, frase;
            String m , M , f , F;
            
            
            try {
                System.out.print("Digite o nome do indivíduo 01:  ");
                indiviA = entrada.nextLine();

                if (temErro(indiviA)) {
                    throw new InputMismatchException("Valor invalido");
                }


                System.out.print("Digite a idade do " + indiviA + ":  ");
                idadeA = entrada.nextInt();
                
                entrada.nextLine();

                System.out.print("Digite o sexo do(a)" + indiviA + ":  ");
                sexoA = entrada.nextLine();

                if (sexoA.equals("m") || sexoA.equals("M") || sexoA.equals("f") || sexoA.equals("F") ) {


                } else  {

                    System.out.println("Valor invalido");
                }


                System.out.println("       ");

                if (idadeA <= 13) {

                    System.out.println(indiviA + " é criança \n");

                } else if (idadeA <= 20) {

                    System.out.println(indiviA + " é adolescente \n");

                } else if (idadeA <= 50) {

                    System.out.println(indiviA + " é adulto \n");
                } else if (idadeA > 50) {

                    System.out.println(indiviA + " é da melhor idade \n");
                }

                System.out.print("Digite o nome do indivíduo 02: ");
                indiviB = entrada.nextLine();

                System.out.print("Digite a idade do " + indiviB + ":  ");
                idadeB = entrada.nextInt();
                
                 entrada.nextLine();

                System.out.print("Digite o sexo do(a)" + indiviB + ":  ");
                sexoB = entrada.nextLine();
                
                  if (sexoB.equals("m") || sexoB.equals("M") || sexoB.equals("f") || sexoB.equals("F") ) {


                } else  {

                    System.out.println("Valor invalido");
                }
                
                 

                System.out.println("       ");

                if (idadeB <= 13) {

                    System.out.println(indiviB + " é criança \n");

                } else if (idadeB <= 20) {

                    System.out.println(indiviB + " é adolescente \n");

                } else if (idadeB <= 50) {

                    System.out.println(indiviA + " é adulto \n");
                } else if (idadeB > 50) {

                    System.out.println(indiviB + " é da melhor idade \n");
                }

                 System.out.print("Digite o nome do indivíduo 03: ");
                indiviC = entrada.nextLine();

               System.out.print("Digite a idade do " + indiviC + ":  ");
                idadeC = entrada.nextInt();
                
                 entrada.nextLine();

                System.out.print("Digite o sexo do(a)" + indiviC + ":  ");
                sexoC = entrada.nextLine();
                
                  if (sexoC.equals("m") || sexoC.equals("M") || sexoC.equals("f") || sexoC.equals("F") ) {


                } else  {

                    System.out.println("Valor invalido");
                }
                

                System.out.println("       ");

                if (idadeC <= 13) {

                    System.out.println(indiviC + " é criança \n");

                } else if (idadeC <= 20) {

                    System.out.println(indiviC + " é adolescente \n");

                } else if (idadeC <= 50) {

                    System.out.println(indiviC + " é adulto \n");
                } else if (idadeC > 50) {

                    System.out.println(indiviC + " é da melhor idade \n");
                }

                System.out.println("       ");



                if (idadeA > idadeB && idadeA > idadeC){

                    System.out.println("O nome do indivíduo mais velho é:" +indiviA);

                } else if (idadeB > idadeA && idadeB > idadeC) {

                    System.out.println("O nome do indivíduo mais velho é:" +indiviB);

                } else if (idadeC > idadeA && idadeC > idadeB){

                    System.out.println("O nome do indivíduo mais velho é:" +indiviC);
                }

            } catch (InputMismatchException error) {
                System.out.print(error.getMessage());
            } catch (RuntimeException e) {
                System.out.println("");
            }

        }

        public static boolean temErro(String valor) {
            try {
                Integer  valorInteiro = Integer.parseInt(valor);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

    }

