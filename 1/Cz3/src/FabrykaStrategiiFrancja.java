public class FabrykaStrategiiFrancja implements FabrykaStrategiiPodatkowej{
    @Override
    public StrategiaPodatkowa stworzStrategiePodatkowa() {
        return new StrategiaPodatkowaFrancja(new PodatekLiniowy(0.3),new PodatekProgresywny(0.0,0.5,40000));
    }
}
