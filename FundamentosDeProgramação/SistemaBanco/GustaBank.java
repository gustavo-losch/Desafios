package FundamentosDeProgramação.SistemaBanco;

/*
 * @author Gustavo Losch do Amaral
 */

import java.util.Scanner;

public class GustaBank{
    public static void main(String []args){
        Scanner t = new Scanner(System.in);
        double saldo,limite,saque,deposito;
        int opcao,fim;

        limite = 0;
        fim = 0;

        System.out.println("\fQual é o saldo da conta em reais?");
        saldo = t.nextDouble();
        
        if (saldo<500) limite = Double.POSITIVE_INFINITY;
        else if (saldo>=500 && saldo<1000) limite = (saldo*0.08);
        else if (saldo>=1000) limite = (saldo*0.15);
        else System.out.println("Saldo inválido");

        while (fim == 0) {
            
            System.out.println(""); //Menu
            System.out.println("-------------------");
            System.out.println("   GustaBank :)");
            System.out.println("-------------------");
            System.out.println("Selecione uma das opções: ");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Limite");
            System.out.println("4 - Finalizar");
            opcao = t.nextInt();

        switch (opcao){
                    
                    case 1: //saque
                            System.out.println("Qual o valor a ser sacado?");
                            saque = t.nextDouble();
                                if(saque<=saldo && saque<=limite) {
                                    saldo -= saque;
                                    System.out.println("O saque foi efetuado. Saldo restante: "+(saldo));
                                }
                                else if (saque>limite) System.out.println("O saque ultrapassa o limite permitido para sua conta.");
                                else if (saldo<saque) System.out.println("Saldo insuficiente.");
                break;


                case 2: //depósito
                            System.out.println("Qual o valor a ser depositado?");
                            deposito = t.nextDouble();
                                if(deposito>0) {
                                    saldo += deposito;
                                    System.out.println(+deposito+" reais foram depositados em sua conta. Saldo médio: "+(saldo));
                                }
                                else System.out.println("Valor inválido.");
                break;


                case 3: //limite
                                if (saldo<500) limite = Double.POSITIVE_INFINITY;
                                else if (saldo>=500 && saldo<1000) limite = (saldo*0.08);
                                else if (saldo>=1000) limite = (saldo*0.15);
                                else System.out.println("Saldo inválido");
                            System.out.println("O limite da sua conta é de: "+limite+" reais.");
                break;


                case 4: //finalizar
                        System.out.println("Processo finalizado.");
                        fim = 1;
                break;
            }
        }
        t.close();
    }
}
