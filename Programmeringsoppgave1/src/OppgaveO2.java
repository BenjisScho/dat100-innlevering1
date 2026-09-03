import java.util.Scanner;

public class OppgaveO2 {

    void main(){

        Scanner in = new Scanner(System.in);

        //Lar brukeren skrive inn flere poengsummer
        for(int i = 0; i<11; i++){
            System.out.print("Poengsum:");
            int poeng = in.nextInt();

            //Sjekker om poengsummen bruker har tastet inn bryter med parameterne
            if(poeng < 0 || poeng > 100){
                System.out.print("Ugyldig poengsum! Prøv igjen:");
                poeng = in.nextInt();
            }

            BeregnKarakter(poeng);
        }

        in.close();
    }

    //Beregner hvilken karakter man får i forhold til gitt poengsum
    void BeregnKarakter(int poeng){
        String karakter = "";

        //Variabler for karakterer
        int A = 90;
        int B = 80;
        int C = 60;
        int D = 50;
        int E = 40;

        int max = 100;

        //Sjekker hvilken karakter man får
        if(poeng >= A && poeng <= 100){
            karakter = "A";

        } else if (poeng >= B && poeng <= max) {
            karakter = "B";

        } else if (poeng >= C && poeng <= max) {
            karakter = "C";

        } else if (poeng >= D && poeng <= max) {
            karakter = "D";

        } else if ( poeng >= E && poeng <= max) {
            karakter = "E";

        } else if (poeng >= 0 && poeng <= max){
            karakter = "F";

        }else{
            System.out.println("Error");
            return;

        }

        System.out.println("Karakter: " + karakter);
        System.out.println();
    }
}
