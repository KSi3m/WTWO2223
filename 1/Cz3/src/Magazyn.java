import java.util.ArrayList;
import java.util.List;

public class Magazyn {



    private List<Przedmiot> l = new ArrayList<>();
    private StrategiaPodatkowa s;
    private double sum = 0;

    public Magazyn() {
    }
    public void setS(StrategiaPodatkowa s) {
        this.s = s;
    }
    public StrategiaPodatkowa getS() {
        return s;
    }

    public Magazyn(List<Przedmiot> l, StrategiaPodatkowa s) {
        this.l = l;
        int temp = 0;
        for (Przedmiot p : l) {
            temp += p.okreslWartosc();
        }
        this.sum = temp;
        this.s = s;
    }

    public double getSum() {
        return sum;
    }
    public void dodajDoSpisu(Przedmiot p)
    {
        this.l.add(p);
        this.sum += p.okreslWartosc();
    }
    public double pobierzWartoscPoOpodatkowaniu(Podatek p)
    {
        return this.sum - p.okreslWartoscPodatku(this.sum);
    }

    public void wyswietlPorownaniePodatkow()
    {
        System.out.println("Suma bez podatkow(w "+this.getS().getWaluta()+"): "+this.getSum());
        System.out.println("Dla podatku liniowego "+ pobierzWartoscPoOpodatkowaniu(s.getPl()));
        System.out.println("Dla podatku progresywnego "+ pobierzWartoscPoOpodatkowaniu(s.getPp()));

    }
}
