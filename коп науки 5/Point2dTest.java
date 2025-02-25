package Lab_5;

public class Point2dTest {
    public static void main(String[] args) {
        Point2d myPoint = new Point2d();
        Point2d myOtherPoint = new Point2d(5, 3);
        Point2d aThirdPoint = new Point2d();

        System.out.println("Сравнение ссылок:");
        System.out.println("myPoint == aThirdPoint: " + (myPoint == aThirdPoint));

        System.out.println("\nСравнение содержимого:");
        System.out.println("myPoint.equals(aThirdPoint): " + myPoint.equals(aThirdPoint));

        System.out.println("\nДополнительные примеры:");
        System.out.println("myPoint: " + myPoint);
        System.out.println("myOtherPoint: " + myOtherPoint);
        System.out.println("aThirdPoint: " + aThirdPoint);
    }
}

// компиляция: javac Lab_5/Point2d.java Lab_5/Point2dTest.java
// запуск: java Lab_5.Point2dTest
