import java.util.Scanner;

public class OppgaveO1 {

    void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Inntekt:");
        int inntekt = in.nextInt();
        System.out.println();

        Trinnskatt(inntekt);

        in.close();
    }

    //Sjekker hvilket trinn som trengs for å beregne skatten
    void Trinnskatt(int inntekt){

        //Alle trinnene
        int trinn1 = 226100;
        int trinn2 = 318300;
        int trinn3 = 725050;
        int trinn4 = 980100;
        int trinn5 = 1467200;

        //Intervallet mellom hvert trinn
        int max1 = trinn2 - trinn1;
        int max2 = trinn3 - trinn2;
        int max3 = trinn4 - trinn3;
        int max4 = trinn5 - trinn4;

        double skatt = 0;

        if(inntekt < trinn1){
            return;
            
        } else if (inntekt > trinn1 && inntekt <= trinn2) {
            //Lager en midlertidig inntektverdi som er bare det som overskrider grensen til trinnet
            double midInntekt = inntekt - trinn1;
            skatt = Beregnskatt(midInntekt, 1.7);
            
        } else if (inntekt > trinn2 && inntekt <= trinn3) {
            //Plusser sammen skatten av det maksimalet intervallet mellom to trinn og det som overskrider grensen
            //til trinnet vi fokuserer på nå
            double midInntekt = inntekt - trinn2;
            skatt = Beregnskatt(max1, 1.7) + Beregnskatt(midInntekt,4.0);

        } else if (inntekt > trinn3 && inntekt <= trinn4) {
            double midInntekt = inntekt - trinn3;
            skatt = Beregnskatt(max1, 1.7) + Beregnskatt(max2, 4.0) + Beregnskatt(midInntekt, 13.7);

        } else if (inntekt > trinn4 && inntekt <= trinn5) {
            double midInntekt = inntekt - trinn4;
            skatt = Beregnskatt(max1, 1.7) + Beregnskatt(max2, 4.0) +
                    Beregnskatt(max3, 13.7) + Beregnskatt(midInntekt, 16.8);

        } else if (inntekt > trinn5) {
            double midInntekt = inntekt - trinn5;
            skatt = Beregnskatt(max1, 1.7) + Beregnskatt(max2, 4.0) +
                    Beregnskatt(max3, 13.7) + Beregnskatt(max4, 16.8) +
                    Beregnskatt(midInntekt, 17.8);
        }

        System.out.println("Skatt: " + skatt);


    }

    //Beregner hvor mye skatt må betales via input fra bruker
    public double Beregnskatt(double inntekt, double prosent){
        double skatt = inntekt * prosent/100;
        return skatt;
        
    }


}
