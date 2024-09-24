import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class OutputFormatting {
    public static void main(String[] args) {
        // Option 1
        double number = 3.56794444;
        DecimalFormat df = new DecimalFormat("#.##");
        df.format(number);

        System.out.println("$"+df.format(number));


        // Option 2
        Currency currency = Currency.getInstance(Locale.CANADA);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println(currencyFormatter.format(number));


        //https://docs.oracle.com/javase/tutorial/i18n/format/numberFormat.html#:~:text=You%20format%20currencies%20in%20the,and%20the%20appropriate%20currency%20sign.

    }
}
