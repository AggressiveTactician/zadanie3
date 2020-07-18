import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Napisz program, który pobierze od użytkownika liczbę n (typu int) i obliczy sumę szeregu harmonicznego od 1 do n,
        // zgodnie ze wzorem poniżej:
        //        Hn = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę n: ");
//        int number = scanner.nextInt();
//        double Hn = 0;
//        for (int i = 1; i <= number; i++) {
//            Hn = Hn + 1 / (double) i;
//        }
//        System.out.println(Hn);
// =========================================================================================================

//        Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i obliczy liczbę Fibonacciego o wskazanym indeksie.
//        Przykładowo, jeśli użytkownik poda liczbę 5, Twój program  powinien  wypisać  piątą  liczbę  Fibonacciego.
//        Kolejne  liczby  Fibonacciego powstają  poprzez  zsumowanie  dwóch  poprzednich  liczb  Fibonacciego.
//        Przykładowo, kilka pierwszych liczb Fibonacciego wynosi kolejno: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...

//        System.out.println("Podaj numer ciągu, którego wynik chcesz obliczyć: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int x1 = 1;
//        int x2 = 1;
//        for (int i = 3; i <= number; i++) {
//            if (i % 2 == 0) {
//                x1 = x1 + x2;
//            } else {
//                x2 = x1 + x2;
//            }
//        }
//        if (number % 2 == 0) {
//            System.out.println(x1);
//        } else {
//            System.out.println(x2);
//        }
//=======================================================================================================

//        Napisz program realizujący prosty kalkulator.
//                Program powinien:a.pobrać pierwszą liczbę (typu float)b.pobrać jeden ze znaków: + - / *c.pobrać drugą liczbę (typu float)d.
//                zwrócić wynik pobranego działania Jeśli  użytkownik  poda  znak  inny  niż  obsługiwane,
//        program  powinien  wypisać „Błędny znak”. Jeśli wpisanego działania nie da się zrealizować (tj. jest niezgodne z zasadami matematyki),
//                to program powinien wypisać napis „Błąd”.


//        System.out.println("Podaj pierwszą liczbę: ");
//        Scanner scanner = new Scanner(System.in);
//        float number = scanner.nextFloat();
//        System.out.println("Wybierz znak: ");
//        String sign = scanner.next();
//        System.out.println("Podaj drugą liczbę: ");
//        float number1 = scanner.nextFloat();
//
//        switch (sign) {
//            case "+": {
//                System.out.println(number + number1);
//                break;
//            }
//            case "-": {
//                System.out.println(number - number1);
//                break;
//            }
//            case "*": {
//                System.out.println(number * number1);
//                break;
//            }
//            case "/": {
//                System.out.println(number1 != 0 ? (number / number1) : "Error");
//                break;
//            }
//            default: {
//                System.out.println("Unknown command");
//            }
//        }



    }
}