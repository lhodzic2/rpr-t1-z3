package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
        Sat s=new Sat(15,30,45);
        s.Ispisi();
        s.sljedeci();
        s.Ispisi();
        s.pomjeriZa(-48);
        s.Ispisi();
        s.postavi(0,0,0);
        s.Ispisi();
    }
}

