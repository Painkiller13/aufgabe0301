package aufgabe0301;

public class Kreis {

    int radius;
    static int anzahl;



    public Kreis(int radius){
        this.radius = radius;
        anzahl++;
    }

    public static int anzahl(){
        return anzahl;
    }

    public double flaeche(){
       return Math.PI*radius*radius;
    }

    public double umfang() {
        return Math.PI * 2 * radius;
    }

    public double addiereUmfang(Kreis k2){

        return this.umfang()+k2.umfang();
    }
}
