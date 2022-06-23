package opp_concepts;

public class ProductInheritance {
    int id;
    int price;
    String name;

    // Without constructor because we going to use the child to created it
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
	public String toString() {
		return "Product name=" + name + ", Product id=" + id + ", Product price=" + price;
	}
}
