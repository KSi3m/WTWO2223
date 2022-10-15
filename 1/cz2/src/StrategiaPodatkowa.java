public abstract class StrategiaPodatkowa {
    private PodatekLiniowy pl;
    private PodatekProgresywny pp;
    private String waluta;

    private String kraj;
    public PodatekLiniowy getPl() {
        return pl;
    }

    public PodatekProgresywny getPp() {
        return pp;
    }

    public StrategiaPodatkowa(PodatekLiniowy pl, PodatekProgresywny pp, String waluta, String kraj) {
        this.pl = pl;
        this.pp = pp;
        this.waluta = waluta;
        this.kraj = kraj;
    }

    public StrategiaPodatkowa(PodatekLiniowy pl, PodatekProgresywny pp) {
        this.pl = pl;
        this.pp = pp;
    }

    public String getWaluta() {
        return waluta;
    }
    public String getKraj() {
        return kraj;
    }
}
