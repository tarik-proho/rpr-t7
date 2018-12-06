package ba.unsa.etf.rpr.tutorijal7;

import java.io.Serializable;
import java.util.ArrayList;

public class UN implements Serializable {
    private ArrayList<Drzava> drzave=new ArrayList<>();

    public UN() {
    }

    public ArrayList<Drzava> getDrzave() {
        return drzave;
    }

}
