import java.util.ArrayList;

public class cryptoRepositary {
    private ArrayList<Currency> currencies = new ArrayList<>();

    public cryptoRepositary() {
        currencies.add(new Currency("Bitcoin", 200000));

    }

    public ArrayList<Currency> viewList() {
        ArrayList<Currency> currenciesFound = new ArrayList<>();
        for (Currency currency : currencies) {
            currenciesFound.add(currency);
        }


        return currenciesFound;
    }


}
