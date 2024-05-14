package Peaksoft;

public class Circle {
        private final double PI = 3.14;
        private final int radius = 3; //



        public double getPI(){
            return PI;
        }
        public int getRadius(){
            return radius;
        }


        public static void area(double PI,int radius){
            System.out.println("Area: " + PI * (radius * radius));
        }
        public static void circumference(double PI,int radius){
            System.out.println("Circumference: " + PI * 2 * radius);
        }
}
