import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.stream.IntStream;

/**
 * @author Neil Alishev
 */
public class RtriangleProviderTest {
    private static Rtriangle rtriangle;

    @BeforeClass
    public static void createRtriangle() {
        rtriangle = RtriangleProvider.getRtriangle();
    }

    @Test
    public void rtriangleShouldBeRight() {
        // calculate squared side lengths, then apply Pythagorean theorem
        int squaredLengths[] = computeSquaredLengths();
        int maxElementIdx = getMaxElementIdx(squaredLengths);

        // hypotenuse
        int c = squaredLengths[maxElementIdx];

        squaredLengths[maxElementIdx] = 0;

        Assert.assertEquals(c, IntStream.of(squaredLengths).sum());
    }

    // compute three vectors first, then compute their squared lengths
    private int[] computeSquaredLengths() {
        int[] v1 = {rtriangle.getApexX2() - rtriangle.getApexX1(), rtriangle.getApexY2() - rtriangle.getApexY1()};
        int[] v2 = {rtriangle.getApexX3() - rtriangle.getApexX2(), rtriangle.getApexY3() - rtriangle.getApexY2()};
        int[] v3 = {rtriangle.getApexX3() - rtriangle.getApexX1(), rtriangle.getApexY3() - rtriangle.getApexY1()};

        return new int[]{
                v1[0] * v1[0] + v1[1] * v1[1],
                v2[0] * v2[0] + v2[1] * v2[1],
                v3[0] * v3[0] + v3[1] * v3[1]
        };
    }

    // return index of the max element in array
    private int getMaxElementIdx(int[] array) {
        int maxElementIdx = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[maxElementIdx] < array[i])
                maxElementIdx = i;
        }

        return maxElementIdx;
    }
}
