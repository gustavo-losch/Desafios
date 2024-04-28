package ClubeDeAlgoritmos.CodigoReal;

/*
 * Link do desafio: "https://cdass.vercel.app/problemas/20"
 */

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CodigoReal {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner reader = new Scanner(new FileReader("C:\\Users\\User\\Desktop\\Gustavo\\Repositórios\\Desafios\\ClubeDeAlgoritmos\\CodigoReal\\input.txt"));
        String[] vet = new String[77000];

        int linha = 0; int somalinhas = 0;
        String caractSfut = ""; String caractS = "";

        for (int i = 0; reader.hasNextLine(); i++) {
            vet[i] = reader.nextLine();

            for(int j=0; j<vet[i].length(); j++) {
                char caractC = vet[i].charAt(j);
                caractS = Character.toString(caractC);

                if(j<vet[i].length()-1) {
                    char caractCfut = vet[i].charAt(j+1);
                    caractSfut = Character.toString(caractCfut);
                }

                if(caractS.equals("!")) {
                    if(caractSfut.equals("@")) {
                        linha += 4;
                        j++;
                    }
                    else if(caractSfut.equals("#")) {
                        linha += 9;
                        j++;
                    }
                    else {
                        linha += 1;
                    }
                }

                if(caractS.equals("@")){
                    linha += 5;
                }

                if (caractS.equals("#")) {
                    if(caractSfut.equals("$")) {
                        linha += 40;
                        j++;
                    }
                    else if (caractSfut.equals("%")) {
                        linha += 90;
                        j++;
                    }
                    else {
                        linha += 10;
                    }
                }

                if (caractS.equals("$")) {
                    linha += 50;
                }
                
                if (caractS.equals("%")) {
                    if(caractSfut.equals("&")) {
                        linha += 400;
                        j++;
                    }
                    else if (caractSfut.equals("*")) {
                        linha += 900;
                        j++;
                    }
                    else {
                        linha += 100;
                    }
                }
                
                if (caractS.equals("&")) {
                    linha += 500;
                }
                
                if (caractS.equals("*")) {
                    linha += 1000;
                }

            }

            somalinhas += linha;
            linha = 0;
            caractSfut = "";

        }
        System.out.println(somalinhas);
        reader.close();
    }
}
