public class Klientas {
    private String vardas;
    private String pavarde;
    private String pavadinimas;
    private int kiekis;

    public Klientas(){

    }

    public Klientas(String vardas,String pavarde,String pavadinimas,int kiekis) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pavadinimas = pavadinimas;
        this.kiekis = kiekis;
    }

    public String getVardas() { return vardas;}
    public void setVardas(String vardas){this.vardas = vardas; }
    public String getPavarde() { return pavarde;}
    public void setPavarde(String pavarde){ this.pavarde = pavarde;}
    public String getPavadinimas() { return pavadinimas;}
    public void setPavadinimas(String pavadinimas) {this.pavadinimas = pavadinimas;}
    public int getKiekis() { return kiekis;}
    public void setKiekis(int kiekis) {this.kiekis = kiekis;}





}
