import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = Integer.parseInt(input.nextLine()); // konverzija Stringa(teksa) u Integer(broj)!
       System.out.println(a);

    //    int b = Integer.parseInt(input.nextLine()); // konverzija Stringa(teksa) u Integer(broj)!
        System.out.println(b);

        //Unesi 2 broja, unos većeg broja zapisati će se u varijablu c
        int c;
  //      if (a > b) {
  //          c = a;
  //      } else {
  //          c = b;
  //      }

        c = (a > b ) ? a : b;  // korištenje ternarnog operatora
        System.out.println("Vrijednost varijable c * " + c);




    }
}
