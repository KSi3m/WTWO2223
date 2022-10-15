public class FabrykaStrategiiUSA implements FabrykaStrategiiPodatkowej{
    @Override
    public StrategiaPodatkowa stworzStrategiePodatkowa() {
        return new StrategiaPodatkowaUSA(new PodatekLiniowy(0.1),new PodatekProgresywny(0.1,0.1,0));
    }
}
