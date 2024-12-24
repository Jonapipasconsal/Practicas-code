import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escriba un valor:");
        Scanner sc = new Scanner(System.in);
        int numeroEntero1 = sc.nextInt();
        System.out.println("Escriba un segundo valor:");
        int numeroEntero2 = sc.nextInt();
        int resultado = numeroEntero1 + numeroEntero2;
        String reString = "El resultado es:";
        System.out.println(reString + resultado);
    }
}