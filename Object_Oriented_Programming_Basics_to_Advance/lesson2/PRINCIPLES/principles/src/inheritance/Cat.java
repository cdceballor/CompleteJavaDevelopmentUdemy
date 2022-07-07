package inheritance;

public class Cat extends Animal {
    int age;
    String name;
    String type;
    String race;

    public Cat (int age, String name, String type, String race){
        super("", "", "", 0);
        this.age= age;
        this.name=name;
        this.race=race;
        this.type= type;
    }
    public void cry(){
        System.out.println(name + " Is crying");
    }
}
