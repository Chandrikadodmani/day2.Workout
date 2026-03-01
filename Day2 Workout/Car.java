class Car {
    private int speed;

    void setSpeed(int speed) {
        if (speed >= 0)
            this.speed = speed;
        else
            System.out.println("Speed cannot be negative");
    }

    int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(-50);
        c.setSpeed(60);
        System.out.println(c.getSpeed());
    }
}
