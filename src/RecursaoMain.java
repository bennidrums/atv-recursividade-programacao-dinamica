import java.util.Scanner;

public class RecursaoMain {

    public static void main(String[] args) {

        int nDegrau = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de degraus: ");
        nDegrau = sc.nextInt();

        if(nDegrau<=0) {
            System.out.print("Numero invalido!");
        }
        else{
            int resultado = Degrau.calcularDegrau(nDegrau);
            System.out.println("Resultado: " + resultado);
        }
    }
}