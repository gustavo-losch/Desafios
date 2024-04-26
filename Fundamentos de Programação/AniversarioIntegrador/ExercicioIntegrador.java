
/*
 * @author Gustavo Losch do Amaral e Vinicius Moço Quintian
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExercicioIntegrador {
    public static void main(String[] args) {
        String data, aniversario;
        Scanner t = new Scanner(System.in);

        pulaLn();
        System.out.println("Insira a data de aniversário no formato (dd/mm/aaaa): ");
        aniversario = t.nextLine();
        pulaLn();
        System.out.println("Insira a data autal no formato (dd/mm/aaaa): ");
        data = t.nextLine();

        int diaA = diaAniversario(aniversario);
        int mesA = mesAniversario(aniversario);
        int anoA = anoAniversario(aniversario);

        int diaN = diaNormal(data);
        int mesN = mesNormal(data);
        int anoN = anoNormal(data);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(aniversario, formatter);

        // Obtendo o dia da semana da data de nascimento
        String diaDaSemana = traduzirDiaSemana(dataNascimento.getDayOfWeek());

        pulaLn();
        System.out.println(aniversario(diaA, mesA, diaN, mesN));
        System.out.println("O seu signo é de " + signo(aniversario) + ",");
        System.out.println("Você nasceu em um(a) " + diaDaSemana.toString().toLowerCase() + ",");
        

        if (mesA > mesN) {
            System.out.println("Faltam " + diasAniversario(diaA, mesA, diaN, mesN, anoA, anoN) + " dias para seu aniversário,");
        }

        else if (mesN > mesA) {
            System.out.println("Se passaram " + diasAniversario(diaA, mesA, diaN, mesN, anoA, anoN) + " dias do seu aniversário,");
        } 

        else {

            if (diaA > diaN) {
                System.out.println("Faltam " + diasAniversario(diaA, mesA, diaN, mesN, anoA, anoN)+ " dias para seu aniversário,");
            }

            else if (diaN > diaA) {
                System.out.println("Se passaram " + diasAniversario(diaA, mesA, diaN, mesN, anoA, anoN)+ " dias do seu aniversário,");
            }

            else
                System.out.println("");
        }

        if (anoBissexto(anoA, anoN) == true) {
            System.out.println("O ano de seu nascimento é bissexto.");
        }
        
        else {
            System.out.println("O ano de seu nascimento não é bissexto!");
        }

        t.close();
    }

    public static int diaAniversario(String aniversario) { // Em seguida, métodos para retornar os valor inteiros, separado por dias, meses e anos.
        String[] data = aniversario.split("/");
        int dia = Integer.parseInt(data[0]);
        return dia;
    }

    public static int mesAniversario(String aniversario) {
        String[] data = aniversario.split("/");
        int mes = Integer.parseInt(data[1]);
        return mes;
    }

    public static int anoAniversario(String aniversario) {
        String[] data = aniversario.split("/");
        int ano = Integer.parseInt(data[2]);
        return ano;
    }

    public static int diaNormal(String data) {
        String[] date = data.split("/");
        int dia = Integer.parseInt(date[0]);
        return dia;
    }

    public static int mesNormal(String data) {
        String[] date = data.split("/");
        int mes = Integer.parseInt(date[1]);
        return mes;
    }

    public static int anoNormal(String data) {
        String[] date = data.split("/");
        int ano = Integer.parseInt(date[0]);
        return ano;
    }

    public static String aniversario(int diaA, int mesA, int diaN, int mesN) { // Método para verificação se é aniversário do usuário.
        String aniv = "Parabéns é seu aniversário!";
        if (diaA == diaN && mesA == mesN)
            return aniv;
        return "Não é seu aniversário,";
    }

    public static String signo(String aniversario) { // Método para a verificação do signo do usuário.
        String signo = "";
        String[] aniver = aniversario.split("/");
        int dia = Integer.parseInt(aniver[0]);
        int mes = Integer.parseInt(aniver[1]);

        if (mes == 1 && dia > 20 || mes == 2 && dia < 19)
            signo = "Aquário";
        if (mes == 2 && dia > 18 || mes == 3 && dia < 21)
            signo = "Peixes";
        if (mes == 3 && dia > 20 || mes == 4 && dia < 21)
            signo = "Áries";
        if (mes == 4 && dia > 20 || mes == 5 && dia < 21)
            signo = "Touro";
        if (mes == 5 && dia > 20 || mes == 6 && dia < 21)
            signo = "Gêmeos";
        if (mes == 6 && dia > 20 || mes == 7 && dia < 23)
            signo = "Câncer";
        if (mes == 7 && dia > 22 || mes == 8 && dia < 23)
            signo = "Leão";
        if (mes == 8 && dia > 22 || mes == 9 && dia < 23)
            signo = "Virgem";
        if (mes == 9 && dia > 22 || mes == 10 && dia < 23)
            signo = "Libra";
        if (mes == 10 && dia > 22 || mes == 11 && dia < 22)
            signo = "Escorpião";
        if (mes == 11 && dia > 21 || mes == 12 && dia < 22)
            signo = "Sagitário";
        if (mes == 12 && dia > 21 || mes == 1 && dia < 21)
            signo = "Capricórnio";
        return signo;
    }

    public static int diasAniversario(int diaA, int mesA, int diaN, int mesN, int anoA, int anoN) { // Método para contagem de dias faltantes ou passados do aniversário do usuário.

        int[] dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] diasB = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int somaA = 0;
        int somaN = 0;

        if (mesA < mesN) { // Em seguida, laços de repetição para somar os dias de meses com dias diferentes (31!=30!=28)

            if (anoBissextoN(anoA, anoN) == true) {
                int fimA = mesA - 1;
                for (int a = 0; a >= 0 && a <= fimA; a++) {
                    somaA += diasB[a];
                }

                int fimN = mesN - 1;
                for (int b = 0; b >= 0 && b <= fimN; b++) {
                    somaN += diasB[b];
                }

                int dif = (somaN - (dias[fimN] - diaN)) - (somaA - (dias[fimA] - diaA));
                return dif;
            }

            else {
                int fimA = mesA - 1;
                for (int a = 0; a >= 0 && a <= fimA; a++) {
                    somaA += dias[a];
                }

                int fimN = mesN - 1;
                for (int b = 0; b >= 0 && b <= fimN; b++) {
                    somaN += dias[b];
                }

                int dif = (somaN - (dias[fimN] - diaN)) - (somaA - (dias[fimA] - diaA));
                return dif;
            }
        }

        if (mesA > mesN) {

            if(anoBissextoN(anoA, anoN)) {
            int fimA = mesA - 1;
            for (int c = 0; c >= 0 && c <= fimA; c++) {
                somaA += diasB[c];
            }

            int fimN = mesN - 1;
            for (int d = 0; d >= 0 && d <= fimN; d++) {
                somaN += diasB[d];
            }

            int dif = (somaA - (dias[fimA] - diaA)) - (somaN - (dias[fimN] - diaN));
            return dif;
            }

            else{
            int fimA = mesA - 1;
            for (int c = 0; c >= 0 && c <= fimA; c++) {
                somaA += dias[c];
            }

            int fimN = mesN - 1;
            for (int d = 0; d >= 0 && d <= fimN; d++) {
                somaN += dias[d];
            }

            int dif = (somaA - (dias[fimA] - diaA)) - (somaN - (dias[fimN] - diaN));
            return dif;
            }
        }

        if (mesA == mesN) {
            if (diaA > diaN) {
                int dif = diaA - diaN;
                return dif;
            }

            if (diaN > diaA) {
                int dif = diaN - diaA;
                return dif;
            }
        }
        return 0;
    }

    public static boolean anoBissexto(int anoA, int anoN) {

        int ano = anoA;
        if (ano % 100 == 0 && ano % 400 == 0) {
            return true;
        } else if (ano % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean anoBissextoN(int anoA, int anoN) {

        int ano = anoN;
        if (ano % 100 == 0 && ano % 400 == 0) {
            return true;
        } else if (ano % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void pulaLn() {
      System.out.println("");
    }

    private static String traduzirDiaSemana(DayOfWeek dia) {

      switch (dia) {
          case MONDAY:
              return "segunda-feira";
          case TUESDAY:
              return "terça-feira";
          case WEDNESDAY:
              return "quarta-feira";
          case THURSDAY:
              return "quinta-feira";
          case FRIDAY:
              return "sexta-feira";
          case SATURDAY:
              return "sábado";
          case SUNDAY:
              return "domingo";
          default:
              return "";
      }
    }
}