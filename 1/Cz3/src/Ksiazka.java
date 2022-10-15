public class Ksiazka extends Przedmiot {

    private int rokWydania;
    private int numerWydania;

    public Ksiazka(int rokWydania, int numerWydania) {
        this.rokWydania = rokWydania;
        this.numerWydania = numerWydania;
    }

    @Override
    public double okreslWartosc() {
        return (double) (2050-this.rokWydania)/this.numerWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public int getNumerWydania() {
        return numerWydania;
    }
    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public void setNumerWydania(int numerWydania) {
        this.numerWydania = numerWydania;
    }

}
