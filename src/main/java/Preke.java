public class Preke {
    private String pavadinimas;
    private int kodas;
    private int kiekis;
    private int kaina;

    public Preke() {

    }

    public Preke(String pavadinimas,int kodas, int kiekis, int kaina) {
        this.pavadinimas = pavadinimas;
        this.kodas = kodas;
        this.kiekis = kiekis;
        this.kaina = kaina;
    }

    public int getKodas() {
        return kodas;
    }

    public void setKodas(int kodas) {
        this.kodas = kodas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public int getKaina() {
        return kaina;
    }

    public void setKaina(int kaina) {
        this.kaina = kaina;
    }
}
