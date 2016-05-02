
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle implements Geometric, Comparable<Geometric>
{
    private Point center;
    private Point p1;
    public Circle(Point cent, Point Bord)
    {
        center = cent;
        p1 = Bord;
    }
    public double getRadius()
    {
        return center.distance(p1);
    }
    public double getArea()
    {
        return center.distance(p1) * center.distance(p1) * Math.PI;
    }
    public double getPerimeter()
    {
        return 2 * center.distance(p1) * Math.PI;
    }
    public String toString()
    {
        return "Circle " + center + " " + p1;
    }
    public int compareTo(Geometric other)
    {
        return (int)( this.getArea()*100 - other.getArea()*100);
    }
}
