package ku.shop;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderStepdefs {
    private ProductCatalog catalog;
    private Order order;

    @Before
    public void setup() {
        catalog = new ProductCatalog();
        order = new Order();
    }

    @Given("a product (.+) with price (.+) and quantity (.+) units in the inventory")
    public void a_product_with_quantity(String name , double price ,int quantity) {
        catalog.addProdWithQuan(name, price, quantity);
    }

    @When("the order (.+) is made with quantity (.+)")
    public void i_buy_with_quantity(String name, int quantity) {
        Product prod = catalog.getProduct(name);
        order.addItem(prod, quantity);
        catalog.getProduct(name).setQty(quantity);
    }

    @Then("the amount of (.+) in the inventory should be (.+)")
    public void amount_should_be(String name, int left) {
        assertEquals(left, catalog.getProduct(name).getQuantity());
    }
}
