package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.tekoaly.HelppoTekoaly;
import ohtu.kivipaperisakset.tekoaly.VaikeaTekoaly;
import ohtu.kivipaperisakset.ui.KPS;
import ohtu.kivipaperisakset.ui.KPSPelaajaVsPelaaja;
import ohtu.kivipaperisakset.ui.KPSTekoaly;

public class KPSFactory {
    
    public static KPS pelaajaVsPelaaja(){
        return new KPSPelaajaVsPelaaja();
    }
    
    public static KPS pelaajaVsHelppoAI(){
        return new KPSTekoaly(new HelppoTekoaly());
    }
    
    public static KPS pelaajaVsVaikeaAI(){
        return new KPSTekoaly(new VaikeaTekoaly(20));
    }
}
