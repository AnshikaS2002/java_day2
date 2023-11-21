public class LineComparision {
    double calculateLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    boolean areEndpointsEqual(double x1L1, double y1L1, double x2L1, double y2L1, double x1L2, double y1L2, double x2L2, double y2L2) {
        return (x1L1 == x1L2 && y1L1 == y1L2 && x2L1 == x2L2 && y2L1 == y2L2);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to line comparision problem");
    }
}
