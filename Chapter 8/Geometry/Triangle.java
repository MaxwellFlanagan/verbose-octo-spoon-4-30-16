
/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle implements Geometric, Comparable<Geometric>
{   
    private Point p1;
    private Point p2;
    private Point p3;
    
    //Precond: 3 Points Actually Create A Triangle
    public Triangle(Point x, Point y, Point z)
    {
       p1 = x;
       p2 = y;
       p3 = z;
    }

   
    public double getPerimeter()
    {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }
    
    public double getArea()
    {
         double a = p1.distance(p2);
         double b = p2.distance(p3);
         double c = p3.distance(p1);
         double s = (a + b + c)/2;
         double x = ((s) * (s-a) * (s-b) * (s-c));
         double Area = Math.sqrt(x);
         return Area;
    }
    
    public String toString()
    {
        return "Triangle " + p1 + " " + p2 + " " + p3;
    }
     public int compareTo(Geometric other)
    {
        return (int)( this.getArea()*100 - other.getArea()*100);
    }
}
