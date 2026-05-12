public class KlasaString {
    public static void main(String[] args) {

        String test = "Ovo je niz znakova";
        String test1 = "\tDanas je utorak\n";
        String test2 = "\u0044anas je utorak";

        System.out.println(test + test1 + test2);

        System.out.println("test" + "test1" + "test2"); // string koji je spojen bez razmaka
        System.out.println("Veličina: " + test.length()); // veličina, tj koliko znakova ima u Stringu
        System.out.println("Znak na indeksu: " + test.charAt(0));
        System.out.println("Gdje se nalazi znak: " + test.indexOf('n'));
        System.out.println("Ends with-1: " + test.endsWith("va"));
        System.out.println("Ends with-2: " + test.endsWith("iz"));
        System.out.println("Starts with: " + test.startsWith("Ovo"));
        System.out.println("Velika slova: " + test.toUpperCase());
        System.out.println("Mala slova: " + test.toLowerCase());

        System.out.println(test1.equals(test2)); //
        System.out.println(test1 == test2); // promatra vrijednosti koje su zapisane u samom stringu
        System.out.println("Usporedba identične riječi");
        String rijec = "Marija"; // ovo je samo tekst , nije isti tip podatka kao i new string marija
        String rijec1 = new String("Marija"); // novi tip podatka - nova klasa
        System.out.println(rijec == rijec1);
        System.out.println(rijec1);
        System.out.println(rijec.equals(rijec1));





    }
}
