package Question3;

public class Point {
    private double x; 
    private double y; 


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point target) {
        return Math.sqrt(Math.pow(this.x - target.x, 2) + Math.pow(this.y - target.y, 2));
    }


    public static void main(String[] args) {
        Point x =new Point(5, 5); 
        Point y =new Point(7, 5); 
    
        System.out.println(x.distance(y)); 


        Point a =new Point(3, 3);
        Point b =new Point(4, 6);
        System.out.println(a.distance(b)); 

        Point c = new Point(-2, 5.4);
        Point d = new Point(3, -5);
        System.out.println(c.distance(d));
    }
}
