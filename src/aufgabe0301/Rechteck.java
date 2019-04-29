package aufgabe0301;

public class Rechteck {

    float seitea;
    float seiteb;


    public Rechteck(float seitea, float seiteb){
        this.seitea = seitea;
        this.seiteb = seiteb;
    }

    public double flaeche(){
        return seitea * seiteb;
    }

    public  double umfang(){
        return seitea*2+seiteb*2;
    }
    public double addiereFlaeche (Rechteck r2) {

        return this.flaeche() + r2.flaeche();
    }
}
