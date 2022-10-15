public class Adapter {

    private Magazyn m;


    public Adapter(Magazyn m) {
        this.m = m;
    }

    public void wyswietlWyliczenieEUR(double przelicznik){
        System.out.println("Suma bez podatkow(w EUR): "+przelicznik*m.getSum());
        System.out.println("Podatek liniowy "+ przelicznik* m.getS().getPl().okreslWartoscPodatku(m.getSum()));
        System.out.println("Podatek progresywny "+ przelicznik* m.getS().getPp().okreslWartoscPodatku(m.getSum()));
    }
    public void wyswietlWartosciWEURO(){
        System.out.println(m.getS().getKraj());
        if (m.getS().getWaluta().equals("USD"))
        {
            wyswietlWyliczenieEUR(0.78);
        } else if (m.getS().getWaluta().equals("PLN")) {
            wyswietlWyliczenieEUR(4.2);
        }
        else {
            wyswietlWyliczenieEUR(1);
        }
    }


}
