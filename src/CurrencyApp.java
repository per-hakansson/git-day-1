import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CurrencyApp {

    public void viewList () {
        System.out.println("This is a list of the current crypto currencies");
        System.out.println();
        ArrayList<Currency> currencies = new cryptoRepositary.viewList();

        for(Currency currency : currencies){
            System.out.printf("Name: %s\nValue: %f", currency.getName(), currency.getValue());
        }







    }
}
