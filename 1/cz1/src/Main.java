public class Main {
    public static void main(String[] args) {

        Magazyn m = new Magazyn();
        m.dodajDoSpisu(new Ksiazka(1999,2));
        m.dodajDoSpisu(new Obraz(2010));
        m.dodajDoSpisu(new Rzezba(1500,3));
        System.out.println(m.getSum());
        System.out.println(m.pobierzWartoscPoOpodatkowaniu(new PodatekLiniowy()));
        System.out.println(m.pobierzWartoscPoOpodatkowaniu(new PodatekProgresywny()));
    }
}