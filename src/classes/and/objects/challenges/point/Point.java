package classes.and.objects.challenges.point;

public class Point {

    // The class needs two fields (instance variables) with name x and y of type int.
    private int x;
    private int y;

    // The class needs to have two constructors:
    // - The first constructor does not have any parameters (no-arg constructor).
    public Point() {

    }

    // - The second constructor has parameters x and y of type int and it needs to initialize the fields.
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Write the following methods (instance methods):
    // - Method named getX without any parameters, it needs to return the value of x field.
    public int getX() {
        return x;
    }

    // - Method named getY without any parameters, it needs to return the value of y field.
    public int getY() {
        return y;
    }

    // - Method named setX with one parameter of type int, it needs to set the value of the x field.
    public void setX(int x) {
        this.x = x;
    }

    // - Method named setY with one parameter of type int, it needs to set the value of the y field.
    public void setY(int y) {
        this.y = y;
    }

    /*
    - Method named distance without any parameters, it needs to
    return the distance between this Point and Point 0,0 as double.
     */

    /*
    To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
        d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
     */
    public double distance() {
        // Point A (xA = x , yA = y)
        // Point B (xB = 0 , yB = 0)
        // d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        return Math.sqrt((0 - getX()) * (0 - getX()) + (0 - getY()) * (0 - getY()));
    }

    //    - Method named distance with two parameters x, y both of type int, it needs to return the distance between
    //      this Point and Point x,y as double.
    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }

    //    - Method named distance with parameter another of type Point, it needs to return the distance between
    //      this Point and another Point as double.
    public double distance(Point obj) {
        return Math.sqrt((x - obj.getX()) * (x - obj.getX()) + (y - obj.getY()) * (y - obj.getY()));
    }
}
