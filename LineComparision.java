class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class LineComparision {

    boolean areEndpointsEqual(double x1L1, double y1L1, double x2L1, double y2L1, double x1L2, double y1L2, double x2L2, double y2L2) {
        return (x1L1 == x1L2 && y1L1 == y1L2 && x2L1 == x2L2 && y2L1 == y2L2);
    }

    void compareLines() {
        Line line1 = new Line(1.0, 2.0, 3.0, 4.0);
        Line line2 = new Line(1.0, 2.0, 3.0, 4.0);

        int length = Double.compare(line1.calculateLength(), line2.calculateLength());

        if (length < 0) {
            System.out.println("Line 1 is shorter than Line 2");
        } else if (length > 0) {
            System.out.println("Line 1 is longer than Line 2");
        } else {
            System.out.println("Line 1 is equal in length to Line 2");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to line comparison problem");
    }
}
