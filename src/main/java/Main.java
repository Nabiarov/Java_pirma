import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int atsk;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Prideti preke 2.prekiu sarasas 3.Paieska 4.Suma 5.Kiek dienu iki termino skaiciuotuvas  6.Prideti rezervacija 7.Rezervaciju sarasas 0.Iseiti");
        atsk = scanner.nextInt();

        while(atsk != 0)
        {

            if(atsk == 1)
            {
                Sandelis.Prideti();
                atsk = 8;

            }else
            if(atsk == 2)
            {
                Sandelis.Sarasas();
                atsk = 8;

            }else
            if (atsk == 3)
            {
                Sandelis.Paieska();
                atsk = 8;

            }
            else
            if(atsk == 4)
            {
                System.out.println(Sandelis.Suma());
                atsk = 8;

            }
            else
            if(atsk == 5){
                new Terminas().liko();
                atsk = 8;
            }
            else
            if(atsk == 6){
                Rezervacija.PridetiKlienta();
                atsk = 8;
            }
            if(atsk == 7){
                Rezervacija.KlientuSarasas();
                atsk = 8;
            }
            else
            {
                System.out.println("1.Prideti preke 2.prekiu sarasas 3.Paieska 4.Suma 5.Kiek dienu iki termino skaiciuotuvas 6.Prideti rezervacija 7.Rezervaciju sarasas 0.Iseiti");
                scanner = new Scanner(System.in);
                atsk = scanner.nextInt();
            }
        }


    }


}
