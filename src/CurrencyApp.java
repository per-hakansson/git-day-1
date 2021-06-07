
import java.util.ArrayList;


public class CurrencyApp {
    private cryptoRepositary cryptoRepo = new cryptoRepositary();

    public CurrencyApp() {
        searchByName("Bitcoin");
    }

    public void searchByName(String keyword) {
        System.out.printf("Searching for books with '%s' in the title...\n", keyword);

        ArrayList<Currency> currencies = cryptoRepo.findName(keyword);

        System.out.printf("%s  were found%s\n", currencies.size(), currencies.size() > 0 ? ":" : ".");

        for (Currency currency : currencies) {
            System.out.printf("Name: %s\nValue: %f", currency.getName(), currency.getValue());
        }
        System.out.println();
    }
}
