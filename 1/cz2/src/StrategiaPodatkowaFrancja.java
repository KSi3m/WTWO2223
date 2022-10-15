public class StrategiaPodatkowaFrancja extends StrategiaPodatkowa {
    private PodatekLiniowy pl;
    private PodatekProgresywny pp;
    private String waluta;
    public StrategiaPodatkowaFrancja(PodatekLiniowy pl, PodatekProgresywny pp) {
        super(pl,pp,"EUR","Francja");
    }
}
