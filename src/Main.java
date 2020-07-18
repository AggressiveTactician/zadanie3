import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Napisz program, który pobierze od użytkownika liczbę n (typu int) i obliczy sumę szeregu harmonicznego od 1 do n,
        // zgodnie ze wzorem poniżej:
        //        Hn = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int number = scanner.nextInt();
        double Hn = 0;
        for (int i = 1; i <= number; i++) {
            Hn = Hn + 1 / (double) i;
        }
        System.out.println(Hn);
    }
}