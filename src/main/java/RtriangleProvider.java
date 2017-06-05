import util.Point;

/**
 * @author Neil Alishev
 */
public final class RtriangleProvider {
    // 3-4-5 right triangle.
    private static final Point P1 = new Point(0, 0);
    private static final Point P2 = new Point(3, 0);
    private static final Point P3 = new Point(0, 4);

    public static Rtriangle getRtriangle() {
        return new RtriangleImpl(P1, P2, P3);
    }
}
