import Peaksoft.Circle;

public class Main {
    public static void main(String[] args) {
        /**Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
         жана circumference деген статик методдору болсун.
         areaны табуу учун: PI * (radius * radius)
         circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат**/

        Circle circle = new Circle();

        Circle.area(circle.getPI(),circle.getRadius());
        Circle.circumference(circle.getPI(),circle.getRadius());
        System.out.println("Hello");
    }
}