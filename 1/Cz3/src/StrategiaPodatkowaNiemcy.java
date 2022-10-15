public class StrategiaPodatkowaNiemcy extends StrategiaPodatkowa {
    private PodatekLiniowy pl;
    private PodatekProgresywny pp;
    private String waluta;

    public StrategiaPodatkowaNiemcy(PodatekLiniowy pl, PodatekProgresywny pp) {
        super(pl,pp,"EUR","Niemcy");
    }
}
