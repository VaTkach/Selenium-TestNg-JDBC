class MyFirstProgram {
  public static void main(String[] args) {
    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь треугольника со стороной " + r.a + " и " + r.b + " = " + area(r));
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle s) {
    return s.a * s.b;
  }
}