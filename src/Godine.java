import java.util.Arrays;

public class Godine {
    public static void main(String[] args) {

        int [] godine = new int [7];
        godine[0] = 2000;
        godine[1] = 2001;
        godine[2] = 2002;
        godine[3] = 2003;
        godine[4] = 2004;
        godine[5] = 2005;
        godine[6] = 2006;

        //matematičko pravilo za prijestupnu godinu
        //Godina je prijestupna ako ispunjava slijedeća 2 uvjeta:
        //1. Dijeljenjem s 4 nema ostatka, a dijeljenjem sa 100 ostatak mora ostojati
        //2. ili ako je dijeljenjem s 400 ostatak točno 0 (ostatak == 0)
        //U Javi se ostatak pri dijeljenju računa pomoću znaka posto (%). Na primjer, godina % 4 == 0

        for (int i : godine) {
            if (i % 4 == 0) {
                if (i % 100 == 0) {
                    if (i % 400 == 0) {
                        System.out.println(i + " je prijestupna godina.");
                    } else {
                        System.out.println(i + " nije prijestupna godina.");
                    }
                }else  {
                    System.out.println(i + " je prijestupna godina.");
                }
            }else {
                System.out.println(i + " nije prijestupna godina.");

            }

        }


    }
}
