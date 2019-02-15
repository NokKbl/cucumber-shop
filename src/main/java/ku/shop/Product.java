package ku.shop;

public class Product {
    private double price;
    private String name;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        if(quantity >= 0) this.quantity = quantity;
        else{
            this.quantity = 0;
            System.out.println("The quantity can't be negative, so, it'll set to be ZERO.");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() { return quantity; }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price must be not be negative zero");
        this.price = price;
    }

    public void setQty(int quantity) {
        int total = this.quantity - quantity;
        if(total >= 0){
            this.quantity = total;
            System.out.println("Success!!, the amount of " + name + " remains " + this.quantity);
        }
        else System.out.println("Can't made order, so, the amount of " + name + " will remains " + this.quantity);
    }
}
