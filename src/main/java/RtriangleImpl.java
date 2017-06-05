import util.Point;

/**
 * @author Neil Alishev
 *         Triangle is built upon 3 points.
 */
public class RtriangleImpl implements Rtriangle {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    public RtriangleImpl(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public int getApexX1() {
        return p1.getX();
    }

    @Override
    public int getApexY1() {
        return p1.getY();
    }

    @Override
    public int getApexX2() {
        return p2.getX();
    }

    @Override
    public int getApexY2() {
        return p2.getY();
    }

    @Override
    public int getApexX3() {
        return p3.getX();
    }

    @Override
    public int getApexY3() {
        return p3.getY();
    }
}
