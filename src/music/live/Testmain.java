package music.live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

class Testmain{
    public static void main(String []args){
        Veena veena = new Veena();
        veena.play();
        Saxophone saxo = new Saxophone();
        saxo.play();

        Playable ven = (Playable) veena;
        Playable sax = saxo;
        ven.play();
        sax.play();

    }

}
