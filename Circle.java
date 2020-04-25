// ITP 120 - Lab 6 - Gaddis Chapter 8
//
// Circle: Represents a circle.  Contains implementation of
// copy constructor, toString, and equals methods
//

public class Circle
{
    private double radius;

    // Constructor
    // Constructs a new circle with radius r
    public Circle(double r)
    {
        radius = r;
    }

    // Copy Constructor
    // Constructs a new circle as a copy of another circle
    public Circle(Circle source)
    {
        radius = source.radius;
    }

    // getArea
    // Computes and returns the area of the circle
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    // equals
    // Determines if the circle is equal to another Circle
    public boolean equals(Circle source)
    {
        return radius == source.radius;
    }

    // toString
    // Provides a String representation of the Circle
    public String toString()
    {
        return "Circle radius: "+radius;
    }
}