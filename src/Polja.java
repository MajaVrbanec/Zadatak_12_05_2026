import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Polja {
    public static void main(String[] args) {
        int[] brojevi = new int[5];
        brojevi[0] = 11;
        brojevi[1] = 5;
        brojevi[2] = 15;
        brojevi[3] = 4;
        brojevi[4] = 22;
    //    brojevi[5] = 5; // van okvira polja je jer je element 5 izvan zagrade, unutar je od 0 do 4

        System.out.println( "*****Ispis cijele kolekcije*****");
        for (int i : brojevi) {  // ispis elemenata kolekcije brojevi petlja for each samostalno odredi veličinu polja
            System.out.println(i);
        }

        System.out.println("******Ispis pojedinih elemenata*****");
        System.out.println(brojevi[4]);
        System.out.println(brojevi[1]);
        System.out.println("***Veličina polja***");
        System.out.println(brojevi.length);
        System.out.println("Veličina polja je: " + brojevi.length);

        //Ispiši vrijednosti ove kolekcije korištenjem petlje for
        System.out.println("*****Ispis svih elemenata korištenjem petlje for****");

        for (int i = 0; i < brojevi.length - 1; i++) {
            System.out.println(brojevi[i]);
        }
        System.out.println("****Sortiranje polja******");
        Arrays.sort(brojevi);
        for (int i : brojevi) {
            System.out.println(i);
        }

        System.out.println("*****Ispisivanje polja elemenata unatrag******"); // nešto mi ne radi, krivo sam
        for (int i = brojevi.length - 1; i >= 0; i--) { // iteracija i je dobra i--
            System.out.println(brojevi[i]);

        }

        // ili ručno ispisivanje koda za svaki element
//        System.out.println("***** Ispisivanje polja unatrag (ručno) *****");

// Ispisujemo zadnji element (indeks 4)
//        System.out.println(brojevi[4]);

// Ispisujemo četvrti element (indeks 3)
//        System.out.println(brojevi[3]);

// Ispisujemo treći element (indeks 2)
//        System.out.println(brojevi[2]);

// Ispisujemo drugi element (indeks 1)
//        System.out.println(brojevi[1]);

// Ispisujemo prvi element (indeks 0)
//        System.out.println(brojevi[0]);

        System.out.println("***** Ispisivanje polja unatrag (ručno) *****");

// Ručni ispis od zadnjeg prema prvom indeksu:
        System.out.println(brojevi[4]); // Ispisuje 22
        System.out.println(brojevi[3]); // Ispisuje 4
        System.out.println(brojevi[2]); // Ispisuje 15
        System.out.println(brojevi[1]); // Ispisuje 5
        System.out.println(brojevi[0]); // Ispisuje 11

        System.out.println("****Metoda fill******");
        Arrays.fill(brojevi, 9); // neznam jesam li dobro napisala vrijednost 9 i zašto pise Val: ispred
        for (int i : brojevi) {
            System.out.println(i);
        }

        //Ispisati elemente polja UNATRAG korištenjem petlje for --> reverse metoda
// prije fill a napraviti reverse

        //Napišite program koji traži unos 7 vrijednosti godina i nakon toga ispisuje jesu li te godine prijestupne ili ne.
        //Godina je prijestupna ako je djeljiva sa 4, nije djeljiva sa 100, osim ako je djeljiva sa 400.
        //Napišite program koji traži unos 7 vrijednosti godina, pohraniti vrijednosti u polje i nakon toga ispisuje jesu li te godine prijestupne ili ne.
        //Godina je prijestupna ako je djeljiva sa 4, nije djeljiva sa 100, osim ako je djeljiva sa 400.




    }
}
