
/**
 * Line
 * 
 * @author Maxwell Flanagan
 * @version 3/07/14
 */
public class Line
{
    private Point a;
    private Point b;

  
    public Line(Point p1, Point p2)
    {
          a = p1;
          b = p2;
    }
    
    public Line()
    {
        a = new Point(0,0);
        b = new Point(1,1);
    }

    public String toString()
    {
        return a + " " + b;
    }
    
    public double distance(Line seg)
   {
       return Math.sqrt(Math.pow(seg.a.getY()-seg.b.getY(),2)+Math.pow(seg.a.getX()- seg.b.getY(), 2));
   }
   
   public static Point midPoint(Line seg)
   {
       return new Point((seg.a.getX()+seg.b.getX())/2.0, (seg.a.getY()+seg.b.getY())/2.0);
   }
}
