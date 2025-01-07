package com.example.project;

public class TriangleCollection {
  // array of Triangles
  private Triangle[] collection;

  // PRECONDITION: numTriangles >= 2
  public TriangleCollection(int numTriangles, int startX, int startY) {
    collection = new Triangle[numTriangles];
    for (int i = 0; i < numTriangles; i++) {
      collection[i] = new Triangle(new Point(-startX, 0), new Point(0, startY), new Point(startX - i, 0));
    }
  }

  // Calculate and return the sum of the perimeters of
  // all Triangles in the collection
  public double totalPerimeter() {
    double perimeter = 0;
    for (Triangle t : collection) {
      perimeter += t.perimeter();
    }
    return perimeter;
  }

  // adds increment to both the x and y coordinates of each of the
  // three Points in every Triangle in the collections array
  public void shiftTriangles(int increment) {
    for (Triangle t : collection) {
      t.incrementVertices(increment);
    }
  }

  // returns a String that contains each Triangle in the
  // collection on a new line
  public String triangleCollectionInfo() {
    String str = "";
    for (Triangle t: collection) {
      str += t.triangleInfo() + "\n";
    }
    return str;
  }
}