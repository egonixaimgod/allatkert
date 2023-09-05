public class Kert {
    public void inditElet() {
        Maci maci = new Maci();
        Macska mici = new Macska();
        maci.hangotad("asd");
        maci.mezgyujtes();
        mici.hangotad("213123");
        mici.dorombol();
        System.out.println(mici.nev);
        mici.BeallitNev("kumalala");
        System.out.println(mici.nev);
    }
}
