package papka;

public class Main {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(0,0,1,1,2,2);
        Triangle t2 = new Triangle(1,1,2,2,3,3);
        t1.printTriangleInfo();
        t2.printTriangleInfo();

    }
}
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class Triangle {

    Point p1;
    Point p2;
    Point p3;

    public Triangle() {
    }

    Triangle (int x1, int y1, int x2, int y2, int x3, int y3){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
        this.p3 = new Point(x3, y3);
    }
    public void printTriangleInfo(){
        System.out.printf("p1[%d,%d],p2[%d,%d],p3[%d,%d]\n",p1.getX(),p1.getY(),p2.getX(),p2.getY(),p3.getX(),p3.getY());
    }

}
