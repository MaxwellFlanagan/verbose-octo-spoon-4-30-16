
/**
 * Write a description of class GeoTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeoTest
{
   public static void main(String[] args)
   {
       Point a = new Point(4, 0);
       Point b = new Point(0, 3);
       Point c = new Point(0, 0); 
       Circle c1 = new Circle(a, b);
       Circle c2 = new Circle(b, c);
       Circle c3 = new Circle(a, c);
       Triangle abc = new Triangle(a , b, c);
       System.out.println(abc);
       System.out.println("P = " + abc.getPerimeter());
       System.out.println("A = " + abc.getArea());
       
       Point x = new Point(0, 0);
       Point y = new Point(3, 2);
       Point z = new Point(4, 4); 
       Triangle xyz = new Triangle(x, y, z);
       System.out.println(xyz);
       System.out.println("P = " + xyz.getPerimeter());
       System.out.println("A = " + xyz.getArea());
   }
   
       public static void maxPerimeter(Geometric[] shapes)
       {
       double max = shapes[0].getPerimeter();
       for(int i = 0; i < shapes.length; i++)
       {
        if(shapes[i].getPerimeter() > max)
         max = shapes[i].getPerimeter();
       }
    }
}
