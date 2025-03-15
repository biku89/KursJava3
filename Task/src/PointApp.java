public class PointApp {
    public static void main(String[] args) {
        Point point = new Point(5, 7);
        point.showPoint();

        System.out.println("Przesunięcie");
        movePoint(point, 2 , 4);
        point.showPoint();

    }

    public static void movePoint(Point p, int dx, int dy){
        p.x += dx;
        p.y += dy;

    }

}

