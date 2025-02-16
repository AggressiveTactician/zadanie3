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
//                Program powinien:
//                a.pobrać pierwszą liczbę (typu float)
//                b.pobrać jeden ze znaków: + - / *
//                c.pobrać drugą liczbę (typu float)
//                d.zwrócić wynik pobranego działania Jeśli  użytkownik  poda  znak  inny  niż  obsługiwane,
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
//  ======================================================================================================================

//        Napisz  program,  który  pobierze  od  użytkownika  jedną  liczbę  dodatnią  (typu int)  i obliczy  sumę  cyfr  podanej  liczby.  Podpowiedź:  aby  rozpatrywać  liczbę  cyfra  po cyfrze,
//        możesz  obliczać  resztę  z  dzielenia  liczby  przez  10  (aby  uzyskać  wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby „przesuwać” się do kolejnej cyfry)

//        System.out.println("Podaj liczbę dodatnią: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int result = 0;
//        while (number != 0) {
//            result += number % 10;
//            number /= 10;
//        }
//        System.out.println(result);
//    ===========================================================================

//        Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String) tak długo,
//        aż użytkownik poda tekst „Starczy”, a następnie wypisze najdłuższy z podanych tekstów (nie biorąc pod uwagę tekstu „Starczy”)
//        Jeśli użytkownik nie poda żadnego tekstu, to wypisz „Nie podano żadnego tekstu”.

//        System.out.println("Podaj słowo: ");
//        Scanner scanner = new Scanner(System.in);
//        String napis = scanner.nextLine();
//        int dlugosc = 0;
//        String napis2 = "Nie podadno żadnego tekstu";
//        while (!napis.equals("Starczy")) {
//            if (napis.isBlank()) {
//                System.out.println("Nie podano żadnego tekstu");
//            }
//            if (dlugosc < napis.length()) {
//                dlugosc = napis.length();
//                napis2 = napis;
//            }
//            napis = scanner.nextLine();
//        }
//        System.out.println(napis2);
//===================================================================================================================================
//        Napisz program,
//        który pobierze od użytkownika tekst (zmienną typu String) i policzy jakim procentem wszystkich znaków tekstu był znak spacji,
//        ((liczba spacji / liczba wszystkich znaków) * 100%)

        System.out.println("Podaj tekst: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char spaceChar = ' ';
        int spaceSum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == spaceChar) {
                spaceSum++;
            }
        }
        int percent = (int) ((double)spaceSum / text.length() * 100);
        System.out.println(spaceSum);
        System.out.println("Procent wszystkich znaków: " + percent);
    }
}