
import java.util.ArrayList;

public class cryptoRepositary {
    private ArrayList<Currency> currencies = new ArrayList<>();

    public cryptoRepositary() {
        currencies.add(new Currency("Bitcoin", 200000));

    }
    public ArrayList<Currency> viewList() {
        ArrayList<Currency> cryptoFound = new ArrayList<>();
        for (Currency currency : currencies) {
            cryptoFound.add(currency);
        }
        return cryptoFound;
    }

    public ArrayList<Currency> findName(String keyword) {
        ArrayList<Currency> cryptoFound = new ArrayList<>();
        for (Currency currency : currencies) {
            if (currency.getName().toLowerCase().contains(keyword.toLowerCase())) {
                cryptoFound.add(currency);
            }
        }
        return cryptoFound;
    }


}
