package ba.unsa.etf.rpr.tutorijal7;

import java.io.Serializable;

public class Grad implements Serializable {
    private String naziv;
    private double[] temperature = new double[1000];
    private int brojMjerenja=0;
    private int brojStanovnika;
    public Grad() { }

    public Grad(String naziv,int brojMjerenja, double[] temperature) {

        this.naziv = naziv;
        this.brojMjerenja=brojMjerenja;
        this.brojStanovnika = 0;
        this.setTemperature(temperature,brojMjerenja);
    }
    public Grad(String naziv, double[] temperature, int brojMjerenja, int brojStanovnika){
        this.naziv=naziv;
        this.brojMjerenja=brojMjerenja;
        this.brojStanovnika=brojStanovnika;
        setTemperature(temperature,brojMjerenja);

    }

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojMjerenja() {
        return brojMjerenja;
    }
    public void setBrojMjerenja(int brojMjerenja) {
        this.brojMjerenja = brojMjerenja;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }
    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public double[] getTemperature() {
        return temperature.clone();
    }

    public void setTemperature(double[] temperature,int brojMjerenja) {
        System.arraycopy(temperature, 0, this.temperature, 0, brojMjerenja);
    }
}
