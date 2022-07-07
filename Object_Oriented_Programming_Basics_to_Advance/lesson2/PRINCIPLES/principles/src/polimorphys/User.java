package polimorphys;

public class User {
    int id;
    String name;
    String type;

    public User(int id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void join(){ 
    }
    
    public void availability(int i){
        System.out.print("The resource " + name + "has " + i +" to availability");
    }
}
