package javase.Ten;
//10.6
    public class Circle implements Comparable<Circle> {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public int compareTo(Circle other) {
            double areaDiff = this.getArea() - other.getArea();
            if (areaDiff > 0) {
                return 1;
            } else if (areaDiff < 0) {
                return -1;
            } else {
                return 0;
            }
        }

        public static void main(String[] args) {
            Circle c1 = new Circle(5.0);
            Circle c2 = new Circle(3.0);

            int result = c1.compareTo(c2);
            System.out.println("面积差: " + result);
        }
    }
