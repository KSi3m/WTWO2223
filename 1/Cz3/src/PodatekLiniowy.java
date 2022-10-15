public class PodatekLiniowy implements Podatek {

    private double procent;

    public double getProcent() {
        return procent;
    }

    public PodatekLiniowy(double procent) {
        this.procent = procent;
    }

    @Override
    public double okreslWartoscPodatku(double sum) {
        return sum*this.procent;
    }
}
