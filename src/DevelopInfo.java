import java.util.Date;

public class DevelopInfo {
    private static final String dateTimeStart = "18.02.2024";
    private static String dateTimeEnd;

    public static void setDateTimeEnd() {
        Date date = new Date();
        dateTimeEnd = date.toString();
    }

    public static String toString(String developer) {
        setDateTimeEnd();
        return "Разработчик: " + developer + "\n" +
                "Начало разработки: " + dateTimeStart + "\n" +
                "Конец разработки: " + dateTimeEnd + "\n";

    }

    public static void display(String developer) {
        System.out.println(toString(developer));
    }
}
