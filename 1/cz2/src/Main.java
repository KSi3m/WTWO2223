public class Main {
    public static void main(String[] args) {

        FabrykaStrategiiPodatkowej f1 = new FabrykaStrategiiPolska();
        FabrykaStrategiiPodatkowej f2 = new FabrykaStrategiiNiemcy();
        FabrykaStrategiiPodatkowej f3 = new FabrykaStrategiiUSA();
        FabrykaStrategiiPodatkowej f4 = new FabrykaStrategiiFrancja();
        StrategiaPodatkowa s1 = f1.stworzStrategiePodatkowa();
        StrategiaPodatkowa s2 = f2.stworzStrategiePodatkowa();
        StrategiaPodatkowa s3 = f3.stworzStrategiePodatkowa();
        StrategiaPodatkowa s4 = f4.stworzStrategiePodatkowa();

        Magazyn m = new Magazyn();
        m.dodajDoSpisu(new Ksiazka(1999,2));
        m.dodajDoSpisu(new Obraz(2010));
        m.dodajDoSpisu(new Rzezba(1500,3));
        m.setS(s1);
        System.out.println("Polska");
        m.wyswietlPorownaniePodatkow();

        m.setS(s2);
        System.out.println("Niemcy");
        m.wyswietlPorownaniePodatkow();

        m.setS(s3);
        System.out.println("USA");
        m.wyswietlPorownaniePodatkow();

        m.setS(s4);
        System.out.println("Francja");
        m.wyswietlPorownaniePodatkow();


    }
}