import java.util.Objects;

// Point Class
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Line Class
class Line implements Comparable<Line> {

    Point p1, p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // UC1: Calculate Length
    public double getLength() {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    // UC2: Check Equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;

        Line other = (Line) obj;
        return Double.compare(this.getLength(), other.getLength()) == 0;
    }

    // UC3: Compare Lines
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Program");

        // Line 1
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Line line1 = new Line(p1, p2);

        // Line 2
        Point p3 = new Point(1, 1);
        Point p4 = new Point(4, 5);
        Line line2 = new Line(p3, p4);

        double length1 = line1.getLength();
        double length2 = line2.getLength();

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        // UC2: Equality check
        if (line1.equals(line2)) {
            System.out.println("Lines are Equal");
        } else {
            System.out.println("Lines are Not Equal");
        }

        // UC3: Compare
        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Both lines are equal");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}