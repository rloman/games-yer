package nl.yer.games.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Application {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        LocalDate birthDayOfRick = LocalDate.of(1995, 7, 12);

        Period period = Period.between(birthDayOfRick, now);

        System.out.println(period);

        System.out.println("Rick is: "+period.getYears()+" years young!");

        // timestamp

        System.out.println(ChronoUnit.DAYS.between(birthDayOfRick, now));

//        System.out.println(ChronoUnit.NANOS.between(birthDayOfRick, now));

        // this sucks

        Date date = new Date();
        System.out.println(date.getDay());

//        java.sql.Date sqlDate = new Date();


    }
}
