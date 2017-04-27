package ohtu.kivipaperisakset.tekoaly;

public class HelppoTekoaly implements Tekoaly{

    int siirto;
    private final String[] siirrot = {"k", "p", "s"};

    public HelppoTekoaly() {
        siirto = 0;
    }

    @Override
    public String annaSiirto() {
        siirto = (siirto+1) % 3;
        return siirrot[siirto];
    }

    @Override
    public void tallennaVastustajanSiirto(String ekanSiirto) {}
}
