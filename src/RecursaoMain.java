import java.util.Scanner;

public class Recursao {

    public static void main(String[] args) {

        int nDegrau = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de degraus: ");
        nDegrau = sc.nextInt();

        int resultado = Degrau.calcularDegrau(nDegrau);

        System.out.println("Resultado: " +resultado);
    }
}