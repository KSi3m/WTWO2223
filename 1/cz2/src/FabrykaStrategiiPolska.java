public class FabrykaStrategiiPolska implements FabrykaStrategiiPodatkowej{
    @Override
    public StrategiaPodatkowa stworzStrategiePodatkowa() {
        return new StrategiaPodatkowaPolska(new PodatekLiniowy(0.19),new PodatekProgresywny(0.18,0.32,10000));
    }
}
