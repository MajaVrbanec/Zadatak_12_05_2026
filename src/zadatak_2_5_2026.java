import java.util.Scanner;

public class zadatak_2_5_2026 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Unesite iznos u eurima za uzvratiti: ");
        double iznos = input.nextDouble();

        int[] novcanice = {50000,20000,10000,5000,2000,1000,500};
        int[] kovanice = {200,100,50,20,10,5,2,1};

        int centi = (int)(Math.round(iznos*100));

        System.out.println("Novčanice:");
        for (int privremeniBroj : novcanice) {
            int komada = centi / privremeniBroj;
            centi = centi % privremeniBroj;

            if (komada > 0) {
                System.out.println(" - " + komada + " x " + (privremeniBroj/100) + " € ");

            }
        }

        System.out.println("Kovanice: ");
        for (int privremeniBroj : kovanice) {
            int komada = centi / privremeniBroj;
            centi = centi % privremeniBroj;

            if (komada > 0) {
                System.out.println("- " + komada + " x " + (privremeniBroj/100.0) + " € ");

            }
        }

        input.close();

    }
}
