
/**
 * Write a description of class Quad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quad implements Geometric, Comparable<Geometric>
{
    
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    //Precond: Make a Quad
    public Quad(Point a, Point b, Point c, Point d)
    {
       p1 = a;
       p2 = b;
       p3 = c;
       p4 = d;   
    }
    public double getArea()
    {
        Triangle a1 = new Triangle(p1, p2, p3);
        Triangle a2 = new Triangle(p3, p4, p1);
        return a1.getArea() + a2.getArea();
    }
    public double getPerimeter()
    {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p4) + p4.distance(p1);
    }
    public String toString()
    {
        return "Quad " + p1 + " " + p2 + " " + p3 + " " + p4;
    }
     public int compareTo(Geometric other)
    {
        return (int)( this.getArea()*100 - other.getArea()*100);
    }
    
    


    
}
