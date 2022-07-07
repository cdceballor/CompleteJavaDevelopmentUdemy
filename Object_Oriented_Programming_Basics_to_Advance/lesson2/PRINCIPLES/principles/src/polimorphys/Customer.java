package polimorphys;

public class Customer extends User {

    public Customer(int id, String name, String type) {
        super(id, name, type);
    }

    public void join(){
        System.out.println("Have no permissions");
    }
}
