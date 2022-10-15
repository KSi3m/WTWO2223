public class StrategiaPodatkowaPolska extends StrategiaPodatkowa {
    private PodatekLiniowy pl;
    private PodatekProgresywny pp;
    private String waluta;

    public StrategiaPodatkowaPolska(PodatekLiniowy pl, PodatekProgresywny pp) {
        super(pl,pp,"PLN","Polska");
    }

}
