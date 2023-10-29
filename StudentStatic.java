public class StudentStatic {
    int rollno;
    String name, addr;
    StudentStatic(){
        rollno = 1001;
        name = "Jayash Bhandary";
        addr = "Thane";
    }
    StudentStatic(int r, String n, String a){
        rollno = r;
        name = n;
        addr = a;
    }

    void display(){
        System.out.println("rollno \t name \t\t addr");
        System.out.println(name + "\t\t " + addr);
    }

    public static void main(String args[]){
        StudentStatic obj1 = new StudentStatic();
        StudentStatic obj2 = new StudentStatic(1002, "mohan", "thane");
        obj1.display();
        obj2.display();
    }

}
