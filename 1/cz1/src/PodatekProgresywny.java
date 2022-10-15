public class PodatekProgresywny implements Podatek {
    @Override
    public double okreslWartoscPodatku(double sum) {
        if (sum <= 10000.00) return sum*0.18;
        else return sum*0.32;
    }
}
