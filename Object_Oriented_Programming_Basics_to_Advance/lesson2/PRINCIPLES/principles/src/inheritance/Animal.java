package inheritance;

public class Animal {
    String name;
    String race;
    String type;
    int age;

    public Animal(String name, String race, String type, int age){
        this.name = name;
        this.race = race;
        this.type = type;
        this.age= age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " Is eating");
    }
    public void walk(){
        System.out.println(this.name + " Is walking");
    }
    public void sleep(){
        System.out.println(this.name + " Is sleeping");
    }
}
