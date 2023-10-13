import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer texto: ");
        String texto1 = scanner.nextLine();

        System.out.println("Ingrese el segundo texto: ");
        String texto2 = scanner.nextLine();

        boolean sonDistintas = cadenasDeTextoDistintas(texto1, texto2);

        if (!sonDistintas) {
            System.out.println("Las cadenas de texto son distintas.");
        } else {
            System.out.println("Las cadenas de texto coinciden.");
        }
    }

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        return unTextoA.equals(unTextoB);
    }
}
