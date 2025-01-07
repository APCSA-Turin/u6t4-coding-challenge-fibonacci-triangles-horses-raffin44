package com.example.project;

public class Triangle {
  // array of Point objects
  private Point[] vertices;
  private Point p1;
  private Point p2;
  private Point p3;
 
  // Constructor: initializes the vertices array
  // to contain the three Point objects
  public Triangle(Point p1, Point p2, Point p3) {
    vertices = new Point[3];
    vertices[0] = p1;
    vertices[1] = p2;
    vertices[2] = p3;
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }


  public Point[] getVertices() {
    return vertices;
  }
 
  // Returns the perimeter of the Triangle
  // HINT: use the distanceTo method that you wrote in the Point class
  public double perimeter() {
    double sideA = p1.distanceTo(p2);
    double sideB = p2.distanceTo(p3);
    double sideC = p3.distanceTo(p1);
    return sideA + sideB + sideC;
  }

  // Returns a String with the three vertices that make up the Triangle;
  // if the vertices are the points (6, 10), (11, 15), and (18, 7),
  // this method should return: "[(6, 10), (11, 15), (18, 7)]"
  public String triangleInfo() {
    return "[" + p1.pointInfo() + ", " + p2.pointInfo() + ", " + p3.pointInfo() + "]";
  }


  public void incrementVertices(int val) {
    p1 .incrementPoint(val);
    p2.incrementPoint(val);
    p3.incrementPoint(val);
  }
}
