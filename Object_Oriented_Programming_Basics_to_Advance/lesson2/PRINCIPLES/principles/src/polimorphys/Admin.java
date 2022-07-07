package polimorphys;

public class Admin extends User {

    public Admin(int id, String name, String type) {
        super(id, name, type);
    }

    @Override
    public void join(){
        System.out.println("Have all the permissions");
    }
    
}
