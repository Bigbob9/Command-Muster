package org.example;
import org.example.befehle.Befehl;



public class EinfacheFernsteuerung {
    Befehl platz;

    public EinfacheFernsteuerung(){};
    public void setBefehl(Befehl befehl){
        platz = befehl;
    }
    public void knopfWurdeGedrueckt(){
        platz.ausfuehren();
    }
}
