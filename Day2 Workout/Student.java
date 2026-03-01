public class Student {
    String name;
    int rollno;
    int marks;
    void display(){
        System.out.println(name+" "+rollno+" "+marks);
    }
    public static void main(String[]args){
        Student s=new Student();
        s.name="Chandrika";
        s.rollno=15;
        s.marks=95;
        s.display();
    }
    
}
