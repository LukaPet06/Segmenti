package Segmenti;

public class Segment {
    final private double a,b;

    public Segment(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Segment(double a) {
        this.a = a;
        this.b = a+1;
    }

    /**
     * Vraca opseg koji predstavlja presek izmedju trenutnog i poslatog segmenta
     * @param drugi segment za proveru
     * @return Null ako presek ne postoji ili Segment koji predstavlja presek izmedju this i drugi
     * Proveri da li je desna granica naseg segmenta manja od leve granice drugog ili da li je desna granica drugog manja od leve granice naseg
     * kako bi utvrdio da li postoji presek<br><br>
     * Ukoliko presek postoji izracuna vecu levu i manju desnu granicu i vraca segment od tih parametara
     */
    public Segment intersect(final Segment drugi){
        if (this.b<drugi.a || drugi.b<this.a){
            return null;
        }
        double newA = Math.max(this.a,drugi.a);
        double newB = Math.min(this.b,drugi.b);
        return new Segment(newA,newB);
    }

    /**
     * Spaja segmente u jedan veci (S1 U S2)
     * !!KORISTITI UKOLIKO LEVI I DESNI IMAJU PRESEK!!
     * @param levi Segment za spajanje
     * @param desni Segment za spajanje
     * @return Segment sa manjom levom i vecom desnom granicom gornja dva
     */
    public static Segment spojSegmente(final Segment levi, final Segment desni){
        double newA = Math.min(levi.a,desni.a);
        double newB = Math.max(levi.b,desni.b);

        return new Segment(newA,newB);
    }

    /**
     * Odredjuje da li je levi segment nize na brojevnoj pravoj od desnog
     * @param levi Segment za proveru
     * @param desni Segment za proveru
     * @return true ukoliko je levi manji segment, false ako je veci
     */
    public static boolean manjiSegment(final Segment levi, final Segment desni){
        return levi.b < desni.a;
    }
    @Override
    public String toString() {
        return "["+String.format("%.2f",a)+", "+String.format("%.2f",b)+"]";
    }
}
