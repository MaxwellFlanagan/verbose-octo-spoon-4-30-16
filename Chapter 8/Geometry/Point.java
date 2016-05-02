
/**
 * Class To Describe a Point
 * 
 * @author Maxwell Flanagan
 * @version 2/17/15
 */
public class Point
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;

    //Constructors
    public Point()
    {
        x = 0;
        y = 0;
    }

    public Point(double xVal, double yVal)
    {
        x = xVal;
        y = yVal;
    }

    public Point(Point other)
    {
        this.x = other.x;
        this.y = other.y;
    }

    //Methods
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }
    
    public String toString()
    {
        return "( " + x + ", " + y + ")";
    }
    
    public double distance(Point p2)
    {
		double dx = x - p2.x;
		double dy = y - p2.y;
		double distance = Math.sqrt(dx*dx + dy*dy);
		return distance;
     }
     
     public double distanceFromOrigin()
     {
		Point origin = new Point(); 
		return distance(origin);
	}
	
	public static Point Midpoint(Point a, Point b)
	{
	    return new Point((a.getX() + b.getX())/2.0, (a.getY() + b.getY())/2.0);
	}
	
	public static double slope(Point a, Point b)
	{
	    return (a.y-b.y)/(a.x-b.x);
	}
}