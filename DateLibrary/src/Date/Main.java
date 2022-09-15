package Date;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date h = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(h);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println("A Data e Hora atual é: "+h.toString());
    }
}