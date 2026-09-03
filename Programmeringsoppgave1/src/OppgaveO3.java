import java.util.Scanner;

public class OppgaveO3 {

    void main(){

        Scanner in = new Scanner(System.in);

        System.out.print("Velg et heltall større enn 0:");
        int n = in.nextInt();

        //Sjekker om n er faktisk større enn 0
        if(n <= 0){
            System.out.print("Ugyldig tall! Prøv igjen:");
            n = in.nextInt();
        }

        System.out.println();
        in.close();

        int j = 1;
        System.out.print(n + "!=");

        for(int i = 1; i <= n; i++){
            j = j* i;

            if(i < n){
                System.out.print(i + "*");
            }
            else{
                System.out.print(i + "=");
            }

        }

        System.out.print(j);
    }

}
