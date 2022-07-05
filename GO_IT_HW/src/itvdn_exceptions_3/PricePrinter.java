package itvdn_exceptions_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;


public class PricePrinter {
    public static void main(String[] args) throws IOException, ParseException {
        Price[] price = new Price[2];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < price.length; i++) {
            String product;
            String shop;
            String cost;

            System.out.println("Назва продукту = ");
            product = br.readLine();
            System.out.println("Назва магазину = ");
            shop = br.readLine();
            System.out.println("Ціна продукту =");
            cost = br.readLine();

            price[i] = new Price(product, shop, cost);
        }

        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i].toString());
        }

        System.out.println("Введіть магазин в якому має відбутись пошук: ");
        String searchRequest = br.readLine();
        try {
            Price tempShop = null;
            for (Price shop : price) {
                if (shop.getShop().equals(searchRequest)) {
                    System.out.println("Такий магазин знайдений: " + shop);
                    tempShop = shop;
                }
            }
            if (tempShop == null) {
                throw new RuntimeException("Магазину з назвою - " + searchRequest + " не було знайдено, повторіть запит.");
            }
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
//        for (int i = 0; i < price.length; i++) {
//            System.out.println("Початковий список " + price[i].toString());
//        }

    }
}
