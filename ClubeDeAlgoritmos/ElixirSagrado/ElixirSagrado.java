package ClubeDeAlgoritmos.ElixirSagrado;

/*
 * Link do desafio: "https://cdass.vercel.app/problemas/19"
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ElixirSagrado {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new FileReader("C:\\Users\\Gustavo Losch\\Documents\\Repositórios\\Desafios\\ClubedeAlgoritmos\\ElixirSagrado\\input.txt"));
        String[] vet = new String[146];
        int ciclo, densidade, forcaS;
        ciclo = 0;
        forcaS = 0;
        densidade = 1;
    
        for (int i = 0; reader.hasNextLine(); i++) {

            ciclo += 1; 

            forcaS = ciclo(ciclo, densidade, forcaS);

            vet[i] = reader.nextLine();

            if (vet[i].length() > 4) {
                
                ciclo += 1;
                forcaS = ciclo(ciclo, densidade, forcaS);
                
                String num = "";
                num = vet[i].substring(5);
                densidade += Integer.parseInt(num);
                
            }
        }

        System.out.println("A força do sinal é: " + forcaS);
        reader.close();
    }

    public static int ciclo(int ciclo, int densidade, int forcaS) {
        int ciclob = ciclo + 20;
        int sinal = forcaS;

        if (ciclob % 40 == 0 && ciclo >= 20 && ciclo <= 220) {
            System.out.println("A densidade no " + ciclo + "º ciclo é de " + densidade);
            sinal += ciclo * densidade;
        }

        return sinal;
    }
}

// addx 2 ciclos e muda densidade
// noop 1 ciclo