public class Program {
    public static void main(String[] args) {
        Person alex = new Person("Alexandru", 20, 175, 10);

Student andrei = new Student ("Andrei", 25, 180,100, "A");
andrei.grow (10);

if (andrei instanceof Student) {
    System.out.println(andrei.getName() + "este student");
}

        System.out.println(andrei.getHeight());
        System.out.println(andrei.toString());

        System.out.println(alex.name + " are energia " + alex.age + " de ani");

        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.name + " are energia" + alex.stamina);
        alex.sleep();
        System.out.println(alex.name + " are energia" + alex.stamina);

        if (alex.isMajor()){
            System.out.println(alex.name + "reinnk bear");
        }

        Dog lessie = new Dog();
        lessie.size = 20;
        lessie.bark();
    }



    }
