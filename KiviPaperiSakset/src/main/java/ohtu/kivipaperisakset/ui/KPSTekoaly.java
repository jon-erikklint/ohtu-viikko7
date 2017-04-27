package ohtu.kivipaperisakset.ui;

import ohtu.kivipaperisakset.tekoaly.Tekoaly;

public class KPSTekoaly extends KPS{

    private final Tekoaly tekoaly;
    
    public KPSTekoaly(Tekoaly tekoaly){
        this.tekoaly = tekoaly;
    }

    @Override
    public String toinenPelaajaToimii(String ekanSiirto) {
        String tekoalysiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tekoalysiirto);
        
        tekoaly.tallennaVastustajanSiirto(ekanSiirto);
        
        return tekoalysiirto;
    }
}