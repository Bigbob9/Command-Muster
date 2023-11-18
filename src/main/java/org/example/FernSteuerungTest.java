package org.example;

import org.example.HerstellerKlassen.Licht;
import org.example.befehle.LichtAnBefehl;

public class FernSteuerungTest{
    public static void main(String[] args){
        EinfacheFernsteuerung fernsteuerung = new EinfacheFernsteuerung();
        Licht licht = new Licht();
        LichtAnBefehl lichtEin = new LichtAnBefehl(licht);
        fernsteuerung.setBefehl(lichtEin);
        fernsteuerung.knopfWurdeGedrueckt();
    }
}