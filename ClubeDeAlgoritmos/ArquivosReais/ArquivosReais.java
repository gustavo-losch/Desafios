package ClubeDeAlgoritmos.ArquivosReais;

/*
 * Link do problema: "https://cdass.vercel.app/problemas/22"
 */

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArquivosReais {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner reader = new Scanner(new FileReader("C:\\Users\\User\\Desktop\\Gustavo\\Repositórios\\Desafios\\ClubeDeAlgoritmos\\ArquivosReais\\input.txt"));
        String[] vet = new String[1040];
        String[] linha = new String[1];



        for (int i = 0; reader.hasNextLine(); i++) {
            vet[i] = reader.nextLine();

            for (int j = 0; j<vet[i].length(); j++) {
                char caractC = vet[i].charAt(j);
                String caractS = Character.toString(caractC);


            }

            if (vet[i].length()==11) {
                
            }

            else if (vet[i].length()==9 || vet[i].length()==10) {

            }

            else {
                vet[i] = "";
                i--;
            }

        }


    }
}

//Situação 1 - 11 dígitos | validar os dois últimos dígitos
//Situação 2 - 9 ou 10 dígitos | gerar 1 ou 2 últimos dígitos
//Situação 3 - menos de 9 dígitos | descartar documentos