class Employee {
    private double salary;

    void setSalary(double salary) {
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(50000);
        System.out.println(e.getSalary());
    }
}
