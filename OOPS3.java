public class OOPS3{

    public static void main(){

        Mustang v = new Mustang();
        System.out.println(v.name);
        
        // Queen q = new Queen();
        // q.moves();


        // Child c1 = new Child();
        // // c1.Happy();

        // Student s1 = new Student();
        // s1.schoolName = "KVS";
        // s1.setName("Bhim");
        // System.out.println(s1.getName());

        // Student s2 = new Student();
        // // System.out.print(s2.schoolName);
    }

}




abstract class Animal {

    Animal(){ // Animal constructor
        System.out.println("Animal constructor Called");
    }

    void eat(){
        System.out.println("Animal Eats");
    }

    abstract void walk(); // Giving idea to the sub classes that for example cow walks with 4 legs...

}

class Horse extends Animal {

    String name;
    Horse(){
        System.out.println("Horse Constrictor called");
    }

    void walk(){
        System.out.print("Horse walks with 4 legs");
    }

}

class Mustang extends Horse{
    Mustang(){
        super.name = "gabrial";
        System.out.println("Mustang constructor called");
    }
}

class Human extends Animal {

    void walk(){
        System.out.println("Human walks with 2 legs");
    }

}

interface ChessPlayer {
    void moves();  // By default public, cannot use implementation as we need to achieve abstraction!
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("left right up down diagonal");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("left right up down diagonal (By one steo)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("left right up down");
    }
}

class Bishop implements ChessPlayer {
    public void moves(){
        System.out.println("diagonal");
    }
}

class Pawn implements ChessPlayer {
    public void moves(){
        System.out.println("Moves in forward by one step ");
    }
}



//  Multi Level Inheritance

interface Mother {
    void Happy();
}

interface Father {
    void Happy();
}

class Child implements Mother, Father {
    public void Happy(){
        System.out.print("Child steps foot in new world");
    }
}


class Student {

    String name;
    int rollNo;
    
    static String schoolName;

    void setName( String newName ){  // Setter Function
        this.name = newName;
    }

    String getName(){         // Getter 
        return this.name;
    }

}