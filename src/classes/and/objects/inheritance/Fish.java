package classes.and.objects.inheritance;

    public class Fish extends Animal {
    private int gils;
    private int fins;

    public Fish(String type, String size, double weight, int gils, int fins) {
        super(type, "small", weight);
        this.gils = gils;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("muscles moving ");
    }

    private void moveBackFin(){
        System.out.println("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gils=" + gils +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
