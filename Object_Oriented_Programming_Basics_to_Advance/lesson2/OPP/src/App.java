import opp_concepts.Phone;
import opp_concepts.ProductInheritance;

public class App {
    public static void main(String[] args) throws Exception {
        productPhone();
        phonePhone();
    }
    public static void productPhone(){
        ProductInheritance product = new Phone();
        product.setName("Nokia");
        product.setPrice(2000);
        product.setId(1);
        System.out.println(product);
    }

    public static void phonePhone(){
        Phone product = new Phone();
        product.setName("Huawei");
        System.out.print(product.getName() + " ");
        product.call(); 
    }
}
