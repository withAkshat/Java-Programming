public class OOPS{

    public static void main(String args[]){
        Pen p1 = new Pen();  // Created a pen object called p1...

        p1.setNewColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        Bank b1 = new Bank();
        b1.setPass("helloNewPass");
        // System.out.print(b1.password); 

        Student s1 = new Student();
        s1.password = "1233";
        s1.marks[0] = 12;
        s1.marks[1] = 92;
        s1.marks[2] = 98;
        
        
        Student s2 = new Student("Java"); // Parametrs match
        Student s3 = new Student(12); // Parametrs match
        

        Student s4 = new Student(s1);  // Copy Constructor 
        s4.password = "2213";
        // s4.marks[2] = 0;
        s1.marks[2] = 23;

        for ( int i = 0; i<3; i++){
            System.out.println(s4.marks[i]);
        }

    }

}

// class Student{

    String name;
    int rollNo;
    String password;
    int marks[]= new int[3];


    Student(){  // this is construstor
                // incase this constructor is not created 
                // so at the object creation java will create constructor itself

                // Non Paramterized constructor..!!
        // System.out.println("Constructor is called");
    }
    
    
    // Shollow copy constructor
    // Student( Student s1 ){  // Copy Constructor (taking own object as a parameter)
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;
         
    // }

    // Deep copy constructor
    Student( Student s1 ){  // Deep copy does not change reference address
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for ( int i = 0; i<marks.length; i++ ){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String newName){
        this.name = newName;
    }

    Student(int roll){
        this.rollNo = roll;
    }

    // Student( int newPass ){
    //     this.password = newPass;
    // }


}


class Bank {

    public String userName;
    private String password;

    void setPass(String newPwd){
        password = newPwd;
    }

}

class Pen {
    private String color;
    private int tip;

    String getColor(){  // getter
        return this.color;
    }

    
    void setNewColor(String newColor){  // Setter
        this.color = newColor;
    }
    
    int getTip(){   // getter
        return this.tip;
    }

    void setTip(int newTip){    // Setter
        this.tip = newTip;
    }
}