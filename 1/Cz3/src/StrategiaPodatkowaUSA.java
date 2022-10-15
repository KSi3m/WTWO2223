public class StrategiaPodatkowaUSA extends StrategiaPodatkowa {

    private PodatekLiniowy pl;
    private PodatekProgresywny pp;
    private String waluta;

    public StrategiaPodatkowaUSA(PodatekLiniowy pl, PodatekProgresywny pp) {
        super(pl,pp,"USD","USA");
    }

}
