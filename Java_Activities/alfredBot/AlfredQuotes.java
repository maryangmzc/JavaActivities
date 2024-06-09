package Java_Activities.alfredBot;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hola, encantado de verte. ¿Cómo estás?";
    }

    public String guestGreeting(String name) {
        return String.format("Hola, %s. Encantado de verte", name);
    }  

    public String dateAnnouncement() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM); // Use MEDIUM or SHORT
        return now.format(formatter);
    }

    public String respondBeforeAlexis(String conversacion) {
        if (conversacion.contains("Alexis")) {
            return ("De inmediato señor. Ciertamente no es lo suficientemente sofisticada para eso");
        } else if (conversacion.contains("Alfred")) {
            return ("A su servicio. Como desee, naturalmente.");
        } else {
            return ("Bien. Y con eso, me retiraré.");
        }
    }
}