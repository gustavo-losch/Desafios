import java.util.Scanner;

public class Maca1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int maca1, maca2, maca3, maca4, maca5, macapura;
        
        System.out.println("Informe o valor de furos da primeira maçã");
        maca1 = teclado.nextInt();
        System.out.println("Informe o valor de furos da segunda maçã");
        maca2 = teclado.nextInt();
        System.out.println("Informe o valor de furos da terceira maçã");
        maca3 = teclado.nextInt();
        System.out.println("Informe o valor de furos da quarta maçã");
        maca4 = teclado.nextInt();
        System.out.println("Informe o valor de furos da quinta maçã");
        maca5 = teclado.nextInt();
        
        macapura = ((maca1 % 2) + (maca2 % 2) + (maca3 % 2) + (maca4 % 2) + (maca5 % 2));

        System.out.println("O número de maçãs puras é de: " + macapura);
        teclado.close();
    }
}
