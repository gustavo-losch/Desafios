import java.util.Scanner;

public class VerbosRegulares{
    public static void main(String args[]){
        String verbo;
        Scanner t = new Scanner(System.in);

        System.out.println("Insira um verbo regular no infinitivo: ");
        verbo = t.nextLine();
        
        System.out.println("Digite uma das opções abaixo: ");
        System.out.println("1 - Passado");
        System.out.println("2 - Presente");
        System.out.println("3 - Futuro");
        int opcao = t.nextInt();

        int pos = verbo.length() - 2;
        char conjug = verbo.charAt(pos);
        String conjugS = Character.toString(conjug);

        String radical = verbo.substring(0,pos);


        switch (opcao){
            case 1:
                if(conjugS.equals("a")){
                    System.out.println(radical+"ei");
                    System.out.println(radical+"aste");
                    System.out.println(radical+"ou");
                    System.out.println(radical+"amos");
                    System.out.println(radical+"astes");
                    System.out.println(radical+"aram");
                }

                if(conjugS.equals("e")){
                    System.out.println(radical+"i");
                    System.out.println(radical+"este");
                    System.out.println(radical+"eu");
                    System.out.println(radical+"emos");
                    System.out.println(radical+"estes");
                    System.out.println(radical+"eram");
                }
                
                if(conjugS.equals("i")){
                    System.out.println(radical+"i");
                    System.out.println(radical+"iste");
                    System.out.println(radical+"iu");
                    System.out.println(radical+"imos");
                    System.out.println(radical+"istes");
                    System.out.println(radical+"iram");
                }
            break;
                
            case 2:
                if(conjugS.equals("a")){
                    System.out.println(radical+"o");
                    System.out.println(radical+"as");
                    System.out.println(radical+"a");
                    System.out.println(radical+"amos");
                    System.out.println(radical+"ais");
                    System.out.println(radical+"am");
                }

                if(conjugS.equals("e")){
                    System.out.println(radical+"o");
                    System.out.println(radical+"es");
                    System.out.println(radical+"e");
                    System.out.println(radical+"emos");
                    System.out.println(radical+"eis");
                    System.out.println(radical+"em");
                }

                if(conjugS.equals("i")){
                    System.out.println(radical+"o");
                    System.out.println(radical+"es");
                    System.out.println(radical+"e");
                    System.out.println(radical+"imos");
                    System.out.println(radical+"is");
                    System.out.println(radical+"em");
                }
            break;

            case 3:
                if(conjugS.equals("a")){
                    System.out.println(radical+"arei");
                    System.out.println(radical+"arás");
                    System.out.println(radical+"ará");
                    System.out.println(radical+"aremos");
                    System.out.println(radical+"areis");
                    System.out.println(radical+"arão");
                }

                if(conjugS.equals("e")){
                    System.out.println(radical+"erei");
                    System.out.println(radical+"erás");
                    System.out.println(radical+"erá");
                    System.out.println(radical+"eremos");
                    System.out.println(radical+"ereis");
                    System.out.println(radical+"erão");
                }
                if(conjugS.equals("i")){
                    System.out.println(radical+"irei");
                    System.out.println(radical+"irás");
                    System.out.println(radical+"irá");
                    System.out.println(radical+"iremos");
                    System.out.println(radical+"ireis");
                    System.out.println(radical+"irão");
                }
            break;
        }
        t.close();
    }
}