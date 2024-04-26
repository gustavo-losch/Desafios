package ClubeDeAlgoritmos.CodigoReal;

/*
 * Link do desafio: "https://cdass.vercel.app/problemas/20"
 */

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CodigoReal {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner reader = new Scanner(new FileReader("C:\\Users\\Gustavo Losch\\Documents\\Repositórios\\Desafios\\ClubedeAlgoritmos\\CodigoReal\\input.txt"));
        String[] vet = new String[77000];
        
        int linha = 0; int somalinhas = 0;
        String caractS; String caractSpas = "";

        for(int i=0; reader.hasNextLine(); i++){
            vet[i] = reader.nextLine();

            for (int j = vet[i].length()-1 ; j>=0 ; j--){
                char caractC = vet[i].charAt(j);
                caractS = Character.toString(caractC);

                if (j!=0) {
                    char caractCpas = vet[i].charAt(j-1);
                    caractSpas = Character.toString(caractCpas);
                }

                if(caractS.equals("!")) {
                    linha += 1;
                }

                else if (caractS.equals("@")){
                    if (caractSpas.equals("!")) {
                        linha += 4;
                        j--;
                    }
                    else linha += 5;
                }

                else if (caractS.equals("#")){
                    if (caractSpas.equals("!")) {
                        linha += 9;
                        j--;
                    }
                    else linha += 10;
                }

                else if (caractS.equals("$")){
                    if (caractSpas.equals("#")) {
                        linha += 40;
                        j--;
                    }
                    else linha += 50;
                }

                else if (caractS.equals("%")){
                    if (caractSpas.equals("#")) {
                        linha += 90;
                        j--;
                    }
                    else linha += 100;
                }

                else if (caractS.equals("&")){
                    if (caractSpas.equals("%")) {
                        linha += 400;
                        j--;
                    }
                    else linha += 500;
                }

                else if (caractS.equals("*")){
                    if (caractSpas.equals("%")) {
                        linha += 900;
                        j--;
                    }
                    else linha += 1000;
                }
            }
            //System.out.println(linha); 
            somalinhas += linha;
            linha = 0;
            caractSpas = "";
        }
        System.out.println(somalinhas);
        reader.close();
    }
}

