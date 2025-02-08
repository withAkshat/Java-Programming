public class OOPS1 {

    public static void main(String args[]) {

        // Fish Sharks = new Fish();
        // Sharks.eat();

        // Dog dobby = new Dog();
        // dobby.sleep();

        Calculator calc = new Calculator();

        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1, 2, 3));
        System.out.println(calc.sum((float)1.2, (float)2.1));


        Deer d1 = new Deer();
        d1.eat();
    }

}

// Base Class
// class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void sleep() {
        System.out.print("Sleeps");
    }

    void breaths() {
        System.out.println("Breaths");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.print("Eats grass");
    }
}

// // Derived Class
// class Fish extends Animal{

// void fins(){
// System.out.print("Swings fins");
// }

// void gills(){
// System.out.println("Gills");
// }

// }

class Mammal extends Animal {
    String skin;
}

class Human extends Mammal {
    void walk() {
        System.out.print("Can walk");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.print("can bark");
    }
}

class Birds extends Animal {

    String fly;

}

class Peacock extends Birds {
    void Feather() {
        System.out.print("Have beautiful feathers");
    }
}

class Fish extends Animal {
    String swim;
}

class Tuna extends Fish {
    void steamlined() {
        System.out.print("SteamLined");
    }
}

class Shark extends Fish {
    void smellsBlood() {
        System.out.print("Smells blood");
    }
}

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }

}