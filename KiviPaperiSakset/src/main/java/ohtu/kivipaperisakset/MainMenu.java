package ohtu.kivipaperisakset;

import java.util.Scanner;
import ohtu.kivipaperisakset.ui.KPS;

public class MainMenu {
    
    private final Scanner lukija = new Scanner(System.in);
    
    public void toimi(){
        while (true) {
            tulostaAlkuteksti();
            
            KPS peli = valitseKPS(lukija.nextLine());
            
            if(peli == null) break;
            
            peli.pelaa();
        }
    }
    
    private KPS valitseKPS(String vastaus){
        switch(vastaus){
            case("a"): 
                return KPSFactory.pelaajaVsPelaaja();
            case ("b"):
                return KPSFactory.pelaajaVsHelppoAI();
            case ("c"):
                return KPSFactory.pelaajaVsVaikeaAI();
        }
        
        return null;
    }
    
    private void tulostaAlkuteksti(){
        System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
    }
}
