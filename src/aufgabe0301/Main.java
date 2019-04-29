package aufgabe0301;

public class Main {

    public static void main(String[] args) {


        Kreis k1 = new Kreis(10);
        Kreis k2 = new Kreis(100);
        System.out.printf("Es existieren aktuell %d Kreise. \n", Kreis.anzahl());
        System.out.printf("Fläche k1: %s qm %s", k1.flaeche(), System.lineSeparator());
        System.out.printf("Umfang k1: %s m %s", k1.umfang(), System.lineSeparator());
        Rechteck r1 = new Rechteck(4,5);
        Rechteck r2 = new Rechteck(30,20);
        System.out.printf("Fläche r1: %s qm %s", r1.flaeche(), System.lineSeparator());
        System.out.printf("Umfang r1: %s m %s", r1.umfang(), System.lineSeparator());
        double summeKreisUmfang = k1.addiereUmfang(k2);
       double summeRechteckFlaeche = r1.addiereFlaeche(r2);
        System.out.printf("Der Gesamtumfang von k1 und k2 beträgt %s m. %s",
                summeKreisUmfang ,
                System.lineSeparator());
        System.out.printf("Die Gesamtfläche von r1 und r2 beträgt %s qm. %s",
                summeRechteckFlaeche,
                System.lineSeparator());


    }
}
