package com.example.project;

public class Point {
  private int x;
  private int y;
 
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
 
  public int getX () {
    return x;
  }
 
  public int getY() {
    return y;
  }

  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
    double xVals = Math.pow((x - other.x), 2);
    double yVals = Math.pow((y - other.y), 2);
    double distance = Math.sqrt(xVals + yVals);
    return distance;
  }

  // Returns a string in the format: (x, y)
  public String pointInfo() {
    return "(" + x + ", " + y + ")";
  }


  public void incrementPoint(int val) {
    x += val;
    y += val;
  }
}
