public class Rzezba extends Przedmiot{

    private int rokWykonania;
    private double rozmiarWm3;

    public Rzezba(int rokWykonania, double rozmiarWm3) {
        this.rokWykonania = rokWykonania;
        this.rozmiarWm3 = rozmiarWm3;
    }

    @Override
    public double okreslWartosc() {
        return (2020-this.rokWykonania)*this.rozmiarWm3*2;
    }

    public int getRokWykonania() {
        return rokWykonania;
    }

    public double getRozmiarWm3() {
        return rozmiarWm3;
    }

    public void setRokWykonania(int rokWykonania) {
        this.rokWykonania = rokWykonania;
    }

    public void setRozmiarWm3(double rozmiarWm3) {
        this.rozmiarWm3 = rozmiarWm3;
    }
}
