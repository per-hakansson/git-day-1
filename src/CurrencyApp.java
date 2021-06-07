
import java.util.ArrayList;


public class CurrencyApp {
    private cryptoRepositary cryptoRepo = new cryptoRepositary();

    public void viewList() {

        ArrayList<Currency> currencies = cryptoRepo.viewList();
        System.out.printf("%s  were found%s\n", currencies.size(), currencies.size() > 0 ? ":" : ".");

        for (Currency currency : currencies) {
            System.out.printf("Name: %s\nValue: %.2f\n\n   ", currency.getName(), currency.getValue());
        }
        System.out.println();
    }


    public void searchByName(String keyword) {
        System.out.printf("Searching for books with '%s' in the title...\n", keyword);
        ArrayList<Currency> currencies = cryptoRepo.findName(keyword);
        System.out.printf("%s  were found%s\n", currencies.size(), currencies.size() > 0 ? ":" : ".");

        for (Currency currency : currencies) {
            System.out.printf("Name: %s\nValue: %.2f", currency.getName(), currency.getValue());
        }
        System.out.println();
    }
}
