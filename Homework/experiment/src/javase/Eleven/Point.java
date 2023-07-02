package javase.Eleven;

public class Point<T> {
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public void translate(T newX, T newY) {
        this.x = newX;
        this.y = newY;
    }

    public static void main(String[] args) {
        Point<Integer> intPoint = new Point<>(10, 20);
        Point<Double> doublePoint = new Point<>(3.5, 5.5);

        System.out.println("Integer Point: (" + intPoint.getX() + ", " + intPoint.getY() + ")");
        System.out.println("Double Point: (" + doublePoint.getX() + ", " + doublePoint.getY() + ")");

        intPoint.translate(30, 40);
        doublePoint.translate(1.5, 2.5);

        System.out.println("Translated Integer Point: (" + intPoint.getX() + ", " + intPoint.getY() + ")");
        System.out.println("Translated Double Point: (" + doublePoint.getX() + ", " + doublePoint.getY() + ")");
    }
}

