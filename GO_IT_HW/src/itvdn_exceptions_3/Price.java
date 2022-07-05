package itvdn_exceptions_3;

public class Price {

    String productName;
    String shop;
    String price;

    public Price (String productName, String storeName, String price) {
        this.productName = productName;
        this.shop = storeName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getShop() {
        return shop;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Найменування продукту  = " + productName + "; Назва магазину = " + shop + "; Ціна за одиницю продукту = " + price + ";";
    }
}
