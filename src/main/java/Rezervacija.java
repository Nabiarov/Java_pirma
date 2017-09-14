import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
public class Rezervacija {

    static List<Klientas> listOfObjects = new ArrayList();
    static String path = "D:\\testas\\klientai.txt";
    static File file;

    public static void KlientuSarasas()
    {
        readFile();
        System.out.println("Rezervuotas: ");
        System.out.println("------------------ ");

        for (Klientas klientas: listOfObjects) {
            System.out.println(klientas.getVardas()+" "+klientas.getPavarde()+" "+klientas.getPavadinimas()+" "+klientas.getKiekis());

        }
    }



    public static void PridetiKlienta() {
        {
            try {
                readFile();
                String atsk;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Iveskite kliento varda,pavarde,prekes pavadinima ir kieki");
                atsk = scanner.nextLine();


                FileWriter fileWritter = null;
                fileWritter = new FileWriter(file.getName(), true);
                BufferedWriter bw = new BufferedWriter(fileWritter);
                bw.newLine();
                bw.write(atsk);
                bw.close();

                String[] parts = atsk.split(" ");
                Klientas klientas = new Klientas((parts[0]), (parts[1]), (parts[2]),Integer.parseInt(parts[3]));
                listOfObjects.add(klientas);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readFile() {
        try {

            file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                Klientas klientas = new Klientas((parts[0]), (parts[1]), (parts[2]),Integer.parseInt(parts[3]));
                listOfObjects.add(klientas);
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
