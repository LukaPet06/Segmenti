package Segmenti;

import java.util.ArrayList;

public class Segmenti {

    private final ArrayList<Segment> listaSegmenata = new ArrayList<Segment>();

    /**
     * Dodaje Segment u kolekciju
     * @param zaDodavanje Segment koji treba dodati u kolekciju
     * @author Luka Petrović
     * Prvo proverava da li je kolekcija prazna, i ako jeste doda taj element.
     * </br></br>
     *
     * U suprotnom izvrsava algoritam za dodavanje u istu.
     *</br>
     * Algoritam prolazi kroz kolekciju i prvo proverava da li segment zaDodavanje nema preseka sa trenutnim segmentom iz kolekcije i ukoliko nema
     * proverava da li je on manji od tog segmenta. Ukoliko jeste manji dodaje se na njegovom mestu, a taj se pomera na sledece.
     *</br></br>
     * Ukoliko trenutni i segment zaDodavanje imaju presek pomocu petlje se odredjuje do kog najdaljeg segmenta se ti preseci nastavljaju.
     * Na kraju se u kolekciju dodaje Segment sa manjom levom granicom izmedju trenutnog i segmenta za dodavanje i
     * vecom desnom granicom izmedju segmenta za dodavanja i poslednjeg sa kim je on imao presek.
     * Posle tog dodavanja se iz lista brise j-i elemenata gde je i indeks trenutnog, a j indeks poslednjeg preseka.
     *</br></br>
     * Ukoliko ni ovaj uslov nije bio ispunjen tj. segment zaDodavanje se ubacuje na kraj kolekcije, dodaje se regularno.
     *
     */
    public void dodajSegment(final Segment zaDodavanje){
        if(this.listaSegmenata.isEmpty()){
            this.listaSegmenata.add(zaDodavanje);
            return;
        }
        int n = listaSegmenata.size();
        for (int i = 0; i < n; i++) {
            Segment trenutniSegment = listaSegmenata.get(i);
            if (trenutniSegment.intersect(zaDodavanje)==null && Segment.manjiSegment(zaDodavanje,trenutniSegment)){
                listaSegmenata.add(i,zaDodavanje);
                return;
            }
            if (trenutniSegment.intersect(zaDodavanje)!=null){
                int j = i+1;
                while(j<n && listaSegmenata.get(j).intersect(zaDodavanje) !=null ){
                    j++;
                }
                Segment noviSegment = Segment.spojSegmente(Segment.spojSegmente(zaDodavanje,trenutniSegment),Segment.spojSegmente(zaDodavanje,listaSegmenata.get(j-1)));
                listaSegmenata.add(i,noviSegment);
                for (int k = i; k < j; k++) {
                    listaSegmenata.remove(i+1);
                }
                return;
            }
        }
        listaSegmenata.add(n,zaDodavanje);
    }

    /**
     * Ispisuje sve Segmente is kolekcije
     */
    public void ispisiSegmente(){
        if(this.listaSegmenata.isEmpty()){
            return;
        }
        for (Segment s:listaSegmenata){
            System.out.println(s);
        }
    }


}
