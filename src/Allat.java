public class Allat {
    String nev = "";

    public void BeallitNev (String nev) {
        this.nev = nev;
        if(nev.isEmpty()) {
            System.out.println("Hiba hulye vagy");
            System.exit(1); 
        } 
    }

    public void hangotad(String hang) {
        System.out.println(hang);
    }

    
}
