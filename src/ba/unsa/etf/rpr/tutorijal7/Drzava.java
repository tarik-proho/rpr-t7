package ba.unsa.etf.rpr.tutorijal7;

import java.io.Serializable;

public class Drzava implements Serializable {
    private Grad glavniGrad;
    private String naziv;
    private String jedinicaPovrsine;
    private double povrsina;
    private int brojStanovnika;

    public Drzava(String uk, int i, int i1, String km2, Grad grad) { }

    public Drzava(String naziv, Grad glavniGrad, String jedinica, int stanovnika, double povrsina) {
        this.glavniGrad= glavniGrad;
        this.naziv=naziv;
        this.brojStanovnika=stanovnika;
        this.jedinicaPovrsine=jedinica;
        this.povrsina=povrsina;

    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }
    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }
    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public double getPovrsina() {
        return povrsina;
    }
    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public String getJedinicaPovrsine() {
        return jedinicaPovrsine;
    }
    public void setJedinicaPovrsine(String jedinicaPovrsine) {
        this.jedinicaPovrsine = jedinicaPovrsine;
    }


}
