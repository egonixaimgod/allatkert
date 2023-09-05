public class App {
    public static void main(String[] args) throws Exception {
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
