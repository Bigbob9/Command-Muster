package org.example.befehle;

import org.example.HerstellerKlassen.Licht;
import org.example.befehle.Befehl;

public class LichtAnBefehl implements Befehl {

    Licht licht;

    public LichtAnBefehl(Licht licht){
        this.licht = licht;
    }

    public void ausfuehren(){
        licht.ein();
    }
}
