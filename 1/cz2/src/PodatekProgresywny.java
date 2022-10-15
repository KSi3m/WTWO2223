public class PodatekProgresywny implements Podatek {
    private double procentNizszegoProgu;
    private double procentWyzszegProgu;
    private double prog;

    public PodatekProgresywny(double procentNizszegoProgu, double procentWyzszegProgu, double prog) {
        this.procentNizszegoProgu = procentNizszegoProgu;
        this.procentWyzszegProgu = procentWyzszegProgu;
        this.prog = prog;
    }

    public double getProcentNizszegoProgu() {
        return procentNizszegoProgu;
    }

    public double getProcentWyzszegProgu() {
        return procentWyzszegProgu;
    }

    public double getProg() {
        return prog;
    }

    @Override
    public double okreslWartoscPodatku(double sum) {
        if (sum <= this.prog) return sum*this.procentNizszegoProgu;
        else return sum*this.procentWyzszegProgu;
    }
}
