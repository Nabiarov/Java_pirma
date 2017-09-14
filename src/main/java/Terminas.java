import org.joda.time.DateTime;
import org.joda.time.Interval;
import java.util.Scanner;
public class Terminas {

    public void liko() {

        int y, m, d, h, min;
        Scanner atsakymas = new Scanner(System.in);
        System.out.println("Iveskite metus : ");
        y = atsakymas.nextInt();
        System.out.println("Iveskite menesi : ");
        m = atsakymas.nextInt();
        System.out.println("Iveskite diena  : ");
        d = atsakymas.nextInt();
        System.out.println("Iveskite valanda : ");
        h = atsakymas.nextInt();
        System.out.println("Iveskite minute : ");
        min = atsakymas.nextInt();

        DateTime startDate = new DateTime();
        DateTime endDate = new DateTime(y, m, d, h, min);
        Interval laikas = new Interval(startDate, endDate);

        System.out.println("Tiek liko iki tam tikro termino");
        System.out.println("Dienu liko :  " + laikas.toDuration().getStandardDays());
        System.out.println("Valandu liko : " + laikas.toDuration().getStandardHours());
        System.out.println("Minuciu liko : " + laikas.toDuration().getStandardMinutes());

    }
}
