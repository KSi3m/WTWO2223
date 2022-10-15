public class FabrykaStrategiiNiemcy implements FabrykaStrategiiPodatkowej{
    @Override
    public StrategiaPodatkowa stworzStrategiePodatkowa() {
        return new StrategiaPodatkowaNiemcy(new PodatekLiniowy(0.2),new PodatekProgresywny(0.0,0.4,50000));
    }
}
