class Robot {
    String name;
    String color;
    int weight;

Robot(String n, String color, int w) {
    this.name = n;
    this.color = c;
    this.weight = w;
    Robot lookingAt;
}

void introduceSelf() {
    System.out.printIn(
        "My name is" + this.name);
}

}

Robot r1 = new Robot("Tom", "red", 30);
Robot r2 = new Robot("Jerry", "blue", 40); 

r1.introduceSelf();
r2.introduceSelf(); 

r1.lookingAt = r2;
r2.lookingAt = r1;

class Person {
    String name;
    String personality;
    boolean isSitting;
    Robot robotOwned;

    Person (String n, String c, boolean i) {
        this.name = n;
        this.personality = p;
        this.isSitting = i;
    }

    void sitDown() {
        this.isSitting = true;
    }

    void standUp() {
        this.isSitting = false;
    }
}

Person p1 = new Person("Alice", "agressive", false);
Person p2 = new Person("Becky", "talkative", true);

p1.robotOwned = r2;
p2.robotOwned = r1;

p1.robotOwned.introduceSelf();
p2.robotOwned.introduceSelf();
