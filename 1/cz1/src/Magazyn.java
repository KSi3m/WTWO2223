import java.util.ArrayList;
import java.util.List;

public class Magazyn {



    private List<Przedmiot> l = new ArrayList<>();



    private double sum = 0;

    public Magazyn() {
    }

    public Magazyn(List<Przedmiot> l) {
        this.l = l;
        int s = 0;
        for (Przedmiot p : l) {
            s += p.okreslWartosc();
        }
        this.sum = s;
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
}
