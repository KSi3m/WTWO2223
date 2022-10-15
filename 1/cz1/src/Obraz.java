public class Obraz extends Przedmiot{

    private int rokNamalowania;
    @Override
    public double okreslWartosc() {
        return (2100-this.rokNamalowania)*10;
    }
    public void setRokNamalowania(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }

    public int getRokNamalowania() {
        return rokNamalowania;
    }

    public Obraz(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }
}
