public class PodatekLiniowy implements Podatek {
    @Override
    public double okreslWartoscPodatku(double sum) {
        return sum*0.19;
    }
}
