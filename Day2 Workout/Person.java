public class Person {

    private int age;   // private variable

    // Setter method with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }

    // Getter method
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Person p = new Person();

        p.setAge(-5);     // Invalid
        p.setAge(22);     // Valid

        System.out.println("Age = " + p.getAge());
    }
}
