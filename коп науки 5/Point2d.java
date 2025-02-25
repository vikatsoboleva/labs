package Lab_5;

import java.util.Objects;

public class Point2d {
    private double xCoord;
    private double yCoord;

    public Point2d(double x, double y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    public Point2d() {
        this(0, 0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public void setX(double val) {
        this.xCoord = val;
    }

    public void setY(double val) {
        this.yCoord = val;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof Point2d))
            return false;
        Point2d other = (Point2d) obj;
        return Double.compare(other.xCoord, xCoord) == 0 &&
               Double.compare(other.yCoord, yCoord) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoord, yCoord);
    }

    @Override
    public String toString() {
        return "(" + xCoord + ", " + yCoord + ")";
    }
}
