import inheritance.Dog;
import polimorphys.Admin;
import polimorphys.Customer;
import polimorphys.User;
import encapsulation.Encapsulation;
import inheritance.Animal;
import inheritance.Cat;

public class App {
    public static void main(String[] args) throws Exception {
        inheritanceDog();
        inheritanceCat();
        inheritanceAnimal();
        polimorphys();
        encapsulation();
    }
    
    public static void inheritanceDog(){
        Dog dog = new Dog(); //Create a dog object without attributes because we have this in the Dog class constructor
        dog.eat(); //Call a method by animal class
        dog.bark(); //Call a method by dog class
        System.out.println(dog.getName()); //Call a getter

    }
    public static void inheritanceCat(){
        Cat cat = new Cat(7, "Leonor", "Cat", "Criollo"); //Create an instance of cat but with attributes
        cat.setName("Leonor"); //Give a name to use it in the Animal methods because the constructor isn't inheritance
        cat.cry(); //Call a method by cat
        cat.eat(); //Call a method by animal
        System.out.println(cat.getName()); //Print name by the setName method used before

    }
    public static void inheritanceAnimal(){
        Animal dogA = new Dog();
        dogA.walk();

        Animal catA = new Cat(0, null, null, null);
        catA.setName("Pedro");
        catA.walk();

    }
    public static void polimorphys(){
        User customer = new Customer(0, null, null);
        customer.setName("Alberto");
        customer.setId(1);
        customer.setType("Customer");
        customer.join();

        User admin = new Admin(0, null, null);
        admin.setName("Cristian");
        admin.setId(2);
        admin.setType("Admin");
        admin.join();
    }
    public static void encapsulation(){
        Encapsulation en = new Encapsulation();
        en.setAge(21);
        en.setName("Cristian");
        en.setId("1");
        en.print();
        en.age = 5; //We can use the variable without the getter and setter
        System.out.println(en.age); //Age is shared because we defined as a public
        System.out.println(en.getName()); //Only we can call the other variables with the getter and setters
        System.out.println(en.getId()); //Only we can call the other variables with the getter and setters
    }
}
