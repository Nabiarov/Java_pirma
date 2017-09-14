import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public abstract class Sandelis {
    static List<Preke> listOfObjects = new ArrayList();
    static String path = "D:\\testas\\prekes.txt";
    static File file;
    static int checkWithInt;

    public static void Prideti()
    {
        try {
            readFile();
            String produktas;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Iveskite prekes pavadinima,id,kieki ir kaina");
            produktas = scanner.nextLine();


            FileWriter fileWritter = null;
            fileWritter = new FileWriter(file.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.newLine();
            bw.write(produktas);
            bw.close();

            String[] parts = produktas.split(" ");
            Preke preke = new Preke((parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]),Integer.parseInt(parts[3]));
            listOfObjects.add(preke);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
        try {

            file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                Preke preke = new Preke((parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]),Integer.parseInt(parts[3]));
                listOfObjects.add(preke);
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Sarasas()
    {
        readFile();
        System.out.println("Sandelio sarasas : ");
        System.out.println("------------------ ");

        for (Preke preke: listOfObjects) {
            System.out.println(preke.getPavadinimas()+" "+preke.getKodas()+" "+preke.getKiekis()+" "+preke.getKaina());

        }
    }



    public static void Paieska()
    {
        readFile();
        int surastas = 1;
        Scanner scanner = new Scanner(System.in);
        String paieska;
        System.out.println("Iveskite prekes pavadinima arba ID");
        paieska = scanner.nextLine();
        if(skaicius(paieska))
        {
            checkWithInt = Integer.parseInt(paieska);
        } else checkWithInt = 0;

        try{

            for (Preke preke: listOfObjects) {

                if(preke.getPavadinimas().equals(paieska)  || preke.getKodas() == checkWithInt)
                {
                    System.out.println(preke.getPavadinimas()+" "+preke.getKodas()+" "+preke.getKiekis()+" "+preke.getKaina());
                    surastas = 1;
                    break;
                }
                else {
                    surastas = 0;
                }

            }
            if(surastas == 0)
                System.out.println("Deje,bet prekes nepavyko surasti");


        }catch(NumberFormatException e){

        }



    }

    public static int Suma()
    {
        int suma = 0;
        try {
            readFile();
            file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                suma += Integer.parseInt(parts[3]);


            }
            fileReader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return suma;
    }

    public static boolean skaicius( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }

}
