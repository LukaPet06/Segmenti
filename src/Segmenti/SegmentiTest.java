package Segmenti;

public class SegmentiTest {

    public static void main(String[] args) {
        Segmenti segPocetakBezPreseka = new Segmenti();
        Segmenti segPocetakSaPresekom = new Segmenti();
        Segmenti segKrajBezPreseka = new Segmenti();
        Segmenti segKrajSaPresekom = new Segmenti();
        Segmenti segSredinaBezPreseka = new Segmenti();
        Segmenti segSredinaSaPresekom = new Segmenti();
        Segmenti segObgrljen = new Segmenti();

        for (int i = 0; i < 8; i+=2) {
            segPocetakBezPreseka.dodajSegment(new Segment(i+1,i+2));
            segPocetakSaPresekom.dodajSegment(new Segment(i+1,i+2));
            segKrajBezPreseka.dodajSegment(new Segment(i+1,i+2));
            segKrajSaPresekom.dodajSegment(new Segment(i+1,i+2));
            segSredinaBezPreseka.dodajSegment(new Segment(i+1,i+2));
            segSredinaSaPresekom.dodajSegment(new Segment(i+1,i+2));
            segObgrljen.dodajSegment(new Segment(i+1,i+2));
        }
        {
            System.out.println("U svakoj od sledecih kolekcija se nalaze isti elementi a to su");
            segPocetakBezPreseka.ispisiSegmente();
            System.out.println("--------------------------------------------------------------");
        }

        /*Dodavanje novog segmenta na pocetak kolekcije bez da ima presek sa nekim od elemenata*/
        {
            Segment test = new Segment(0,0.9);
            segPocetakBezPreseka.dodajSegment(test);
            System.out.println("Dodavanje novog segmenta na pocetak kolekcije bez da ima presek sa nekim od elemenata");
            segPocetakBezPreseka.ispisiSegmente();
            System.out.println("-------------------------------------------------------------------------------------");
        }

        /*Dodavanje novog segmenta na pocetak kolekcije tako da ima presek sa prvim elementom*/
        {
            Segment test = new Segment(0,1.5);
            segPocetakSaPresekom.dodajSegment(test);
            System.out.println("Dodavanje novog segmenta na pocetak kolekcije tako da ima presek sa prvim elementom");
            segPocetakSaPresekom.ispisiSegmente();
            System.out.println("-----------------------------------------------------------------------------------");
        }

        /*Dodavanje novog segmenta na kraj kolekcije bez da ima presek sa nekim od elemenata*/
        {
            Segment test = new Segment(9,10);
            segKrajBezPreseka.dodajSegment(test);
            System.out.println("Dodavanje novog segmenta na kraj kolekcije bez da ima presek sa nekim od elemenata");
            segKrajBezPreseka.ispisiSegmente();
            System.out.println("----------------------------------------------------------------------------------");
        }

        /*Dodavanje novog segmenta na kraj kolekcije tako da ima presek sa poslednjim elementom*/
        {
            Segment test = new Segment(7.9,9);
            segKrajSaPresekom.dodajSegment(test);
            System.out.println("Dodavanje novog segmenta na kraj kolekcije tako da ima presek sa poslednjim elementom");
            segKrajSaPresekom.ispisiSegmente();
            System.out.println("-------------------------------------------------------------------------------------");
        }

        /*Dodavanje novog segmenta na sredinu kolekcije bez da ima presek sa nekim od elemenata*/
        {
            Segment test = new Segment(2.1,2.9);
            segSredinaBezPreseka.dodajSegment(test);
            System.out.println("Dodavanje novog segmenta na sredinu kolekcije bez da ima presek sa nekim od elemenata");
            segSredinaBezPreseka.ispisiSegmente();
            System.out.println("-------------------------------------------------------------------------------------");
        }

        /*Dodavanje novog segmenta na sredinu kolekcije tako da ima presek sa nekim od elemenata*/
        {
            Segment test = new Segment(2.9,6.5);
            segSredinaSaPresekom.dodajSegment(test);
            System.out.println("Dodavanje novog segmenta na sredinu kolekcije tako da ima presek sa nekim od elemenata");
            segSredinaSaPresekom.ispisiSegmente();
            System.out.println("--------------------------------------------------------------------------------------");
        }

        //Dodavanje novog segmenta tako da "obgrli" sve ostale elemente
        {
            Segment test = new Segment(0.5,8.5);
            segSredinaSaPresekom.dodajSegment(test);
            System.out.println("Dodavanje novog segmenta tako da \"obgrli\" sve ostale elemente");
            segSredinaSaPresekom.ispisiSegmente();
            System.out.println("---------------------------------------------------------------");
        }
    }

}
