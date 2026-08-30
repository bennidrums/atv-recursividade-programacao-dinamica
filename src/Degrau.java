public class Degrau {

    public static int calcularDegrau(int nDegrau) {

        if(nDegrau==1 || nDegrau==2) {
            return nDegrau;
        }

        return calcularDegrau(nDegrau-1)+ calcularDegrau(nDegrau-2);
    }
}