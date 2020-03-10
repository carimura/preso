package com.example.demos;

public class Records {

  public static void main(String[] args) {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(3, 4);
    Point p3 = new Point(1, 2);

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
  }

}

//final class Point {
//  public final int x;
//  public final int y;
//
//  public Point(int x, int y) {
//    this.x = x;
//    this.y = y;
//  }
//
//  public int getX() {
//    return this.x;
//  }
//
//  public int getY() {
//    return this.y;
//  }
//
//  public boolean equals(Point p) {
//    if ((this.x == p.x) && (this.y == p.y)) {
//      return true;
//    }
//    return false;
//  }
//
//  public String toString() {
//    return "x = " + this.x + ", y = " + this.y;
//  }
//}



record Point(int x, int y) {
  public Point {
    if (x == 3) {
      this.x = 4;
    } else {
      this.x = x;
    }
  }

  @Override
  public String toString() {
    return "overridden toString: x = " + this.x + ", y = " + this.y;
  }
}


//  public Point {
//    if (x == 3) {
//      this.x = 4;
//    } else {
//      this.x = x;
//    }
//  }
//
//  @Override
//  public String toString() {
//    return "overridden toString: x = " + this.x + ", y = " + this.y;
//  }