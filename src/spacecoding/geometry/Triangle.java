package spacecoding.geometry;

public class Triangle {
    Point[] points=new Point[3];
    public Triangle(Point p1,Point p2, Point p3){
        points[0]=p1;
        points[1]=p2;
        points[2]=p3;
    }
    public Triangle(Point[] points){
        this.points=points;
    }
}
