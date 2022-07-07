package inheritance;

public class Dog extends Animal {
    
    public Dog(){
        super("", "", "", 0);
        this.name = "Miltrus";
        this.type = "Dog";
        this.race = "Criollo";
        this.age = 7;
    }

    public void bark (){
        System.out.println(name + " Is barking");
    }
}
