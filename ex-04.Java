import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;



public class av  {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        DecimalFormat format = new DecimalFormat("####.##");

        int pagA,pagB,pagC,pagD,pagE;
        float valido,votosValidos,valorA,valorB,valorC,valorD;
        float total,totalA,totalB,totalC,totalD,totalE;


        try {

            System.out.print("Compra 01\n");

            System.out.println("       ");
            System.out.println("       ");


            System.out.print("Digite o valor total: R$ \n");
            totalA = entrada.nextFloat();
            if (totalA<=0){
               System.out.print("Opção inválida, a compra não será processada");
                System.out.println("       ");
                System.out.println("       ");
            }

            System.out.print("Digite a forma de pagamento: \n");
            pagA = entrada.nextInt();
            if (pagA >= 1 && pagA <= 4){
                if (pagA == 1 ){

                    System.out.print("À vista, com 8% de desconto \n");

                    totalA = totalA * (float)0.92;

                    System.out.print("Valor final: R$ "+format.format(totalA));

                    System.out.println("       ");
                    System.out.println("       ");


                } else if (pagA == 2) {

                    System.out.print("À vista no cartão, 4% de desconto \n");

                    totalA = totalA * (float)0.96;

                    System.out.print("Valor final: R$ "+format.format(totalA));

                    System.out.println("       ");
                    System.out.println("       ");

                } else if (pagA == 3) {

                    float totalfinalA = totalA / 2;
                    System.out.print("Em 2x de R$ "+totalfinalA);

                    System.out.println("Valor final: R$ "+totalA);

                    System.out.println("       ");
                    System.out.println("       ");

                } else if (pagA == 4) {

                    System.out.print("Em 4x, preço acrescido de 8% \n");

                    totalA = totalA + (totalA * (float)0.08);

                    System.out.print("Valor final: R$ "+format.format(totalA));

                    System.out.println("       ");
                    System.out.println("       ");

                }

            } else{
                System.out.println("Opção inválida, a compra não será processada");
                System.out.println("       ");
                System.out.println("       ");
            }



            System.out.print("Compra 02\n");

            System.out.println("       ");
            System.out.println("       ");


            System.out.print("Digite o valor total: R$ \n");
            totalB = entrada.nextFloat();

            if (totalB<=0){
                System.out.print("Opção inválida, a compra não será processada");
                System.out.println("       ");
                System.out.println("       ");
            }

            System.out.print("Digite a forma de pagamento: \n");
            pagB = entrada.nextInt();

            if (pagB >= 1 && pagB <= 4) {
                if (pagB == 1) {

                    System.out.print("À vista, com 8% de desconto \n");

                    totalB = totalB * (float) 0.92;

                    System.out.print("Valor final: R$ " + format.format(totalB));

                    System.out.println("       ");
                    System.out.println("       ");


                } else if (pagB == 2) {

                    System.out.print("À vista no cartão, 4% de desconto \n");

                    totalB = totalB * (float) 0.96;

                    System.out.print("Valor final: R$ " + format.format(totalB));

                    System.out.println("       ");
                    System.out.println("       ");

                } else if (pagB == 3) {

                    float totalfinalB = totalB / 2;

                    System.out.print("Em 2x de R$ " + totalfinalB);

                    System.out.println("Valor final: R$ " + totalB);


                    System.out.println("       ");
                    System.out.println("       ");

                } else if (pagB == 4) {

                    System.out.print("Em 4x, preço acrescido de 8% \n");

                    totalB = totalB + (totalB * (float) 0.08);

                    System.out.print("Valor final: R$ " + format.format(totalB));

                    System.out.println("       ");
                    System.out.println("       ");

                }
            } else{
                System.out.println("Opção inválida, a compra não será processada");
                System.out.println("       ");
                System.out.println("       ");
            }






            System.out.print("Compra 03\n");

            System.out.println("       ");
            System.out.println("       ");


            System.out.print("Digite o valor total: R$ \n");
            totalC = entrada.nextFloat();

            if (totalC<=0){
                System.out.print("Opção inválida, a compra não será processada");
                System.out.println("       ");
                System.out.println("       ");
            }

            System.out.print("Digite a forma de pagamento: \n");
            pagC = entrada.nextInt();

            if (pagC >= 1 && pagC <= 4) {
                if (pagC == 1) {

                    System.out.print("À vista, com 8% de desconto \n");

                    totalC = totalC * (float) 0.92;

                    System.out.print("Valor final: R$ " + format.format(totalC));

                    System.out.println("       ");
                    System.out.println("       ");


                } else if (pagC == 2) {

                    System.out.print("À vista no cartão, 4% de desconto \n");

                    totalC = totalC * (float) 0.96;

                    System.out.print("Valor final: R$ " + format.format(totalC));

                    System.out.println("       ");
                    System.out.println("       ");

                } else if (pagC == 3) {

                    float totalfinalC = totalC / 2;

                    System.out.print("Em 2x de R$ " + totalfinalC);

                    System.out.println("Valor final: R$ " + totalC);

                    System.out.println("       ");
                    System.out.println("       ");

                } else if (pagC == 4) {

                    System.out.print("Em 4x, preço acrescido de 8% \n");
                    float A = totalC * (float) 0.08;
                    totalC = totalC + A;

                    System.out.print("Valor final: R$ " + format.format(totalC));

                    System.out.println("       ");
                    System.out.println("       ");

                }
            } else{
                System.out.println("Opção inválida, a compra não será processada");
                System.out.println("       ");
                System.out.println("       ");
            }



            System.out.print("Compra 04\n");

            System.out.println("       ");
            System.out.println("       ");


            System.out.print("Digite o valor total: R$ \n");
            totalD = entrada.nextFloat();

            if (totalD<=0){
                System.out.print("Opção inválida, a compra não será processada");
                System.out.println("       ");
                System.out.println("       ");
            }

            System.out.print("Digite a forma de pagamento: \n");
            pagD = entrada.nextInt();


            if (pagD >= 1 && pagD <= 4) {
                if (pagD == 1) {

                    System.out.print("À vista, com 8% de desconto \n");

                    totalD = totalD * (float) 0.92;

                    System.out.print("Valor final: R$ " + format.format(totalD));

                    System.out.println("       ");
                    System.out.println("       ");


                } else if (pagD == 2) {

                    System.out.print("À vista no cartão, 4% de desconto \n");

                    totalD = totalD * (float) 0.96;

                    System.out.print("Valor final: R$ " + format.format(totalD));

                    System.out.println("       ");
                    System.out.println("       ");

                } else if (pagD == 3) {

                    float totalfinalD = totalD / 2;
                    System.out.print("Em 2x de R$ " + totalfinalD);

                    System.out.println("Valor final: R$ " + totalD);

                    System.out.println("       ");
                    System.out.println("       ");

                } else if (pagD == 4) {

                    System.out.print("Em 4x, preço acrescido de 8% \n");

                    totalD = totalD + (totalD * (float) 0.08);

                    System.out.print("Valor final: R$ " + format.format(totalD));

                    System.out.println("       ");
                    System.out.println("       ");

                }
            } else{
                System.out.println("Opção inválida, a compra não será processada");
                System.out.println("       ");
                System.out.println("       ");
            }


            System.out.print("Compra 05\n");

            System.out.println("       ");
            System.out.println("       ");


            System.out.print("Digite o valor total: R$ \n");
            totalE = entrada.nextFloat();

            if (totalE<=0){
                System.out.print("Opção inválida, a compra não será processada");
                System.out.println("       ");
                System.out.println("       ");
            }

            System.out.print("Digite a forma de pagamento: \n");
            pagE = entrada.nextInt();


            if (pagE >= 1 && pagE <= 4) {
                if (pagE == 1) {

                    System.out.print("À vista, com 8% de desconto \n");

                    totalE = totalE * (float) 0.92;

                    System.out.print("Valor final: R$ " + format.format(totalE));

                    System.out.println("       ");
                    System.out.println("       ");


                } else if (pagE == 2) {

                    System.out.print("À vista no cartão, 4% de desconto \n");

                    totalE = totalE * (float) 0.96;

                    System.out.print("Valor final: R$ " + format.format(totalE));

                    System.out.println("       ");
                    System.out.println("       ");

                } else if (pagE == 3) {

                    float totalfinalE = totalE / 2;
                    System.out.print("Em 2x de R$ " + totalfinalE);

                    System.out.println("Valor final: R$ " + totalE);

                    System.out.println("       ");
                    System.out.println("       ");

                } else if (pagE == 4) {

                    totalE = totalE + (totalE * (float) 0.08);

                    float totalfinalE = totalE / 4;

                    System.out.print("Em 4x de R$" + format.format(totalfinalE));


                    System.out.println("Valor final: R$ " + format.format(totalE));

                    System.out.println("       ");
                    System.out.println("       ");

                }
            } else{
                System.out.println("Opção inválida, a compra não será processada");
                System.out.println("       ");
                System.out.println("       ");
            }


            System.out.print("Total de compras À vista: R$");

            System.out.println("Total de compras parceladas:");

            System.out.println("       ");
            System.out.println("       ");

            System.out.print("Total de descontos: R$");

            System.out.println("Total de Juros: R$");

            validarValor(pagA);

            validarValor(pagB);

            validarValor(pagC);

            validarValor(pagD);

            validarValor(pagE);



        }
        catch(InputMismatchException error) {
            System.out.print("Opção inválida, a compra não será processada");
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }



    }
    public static void validarValor( int valor){
        if (valor<= 0){
            throw new RuntimeException("Opção inválida, a compra não será processada");
        } else if (valor > 5){
            System.out.println ("Opção inválida, a compra não será processada");
        }
    }

}
