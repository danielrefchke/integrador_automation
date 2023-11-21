package base;

import org.testng.Assert;

public class AssertionProxi {
    public static void isTrue(boolean test, String errMSg) {
        Assert.assertTrue(test, errMSg);
    }

    public static void isEqual(String value1, String value2, String message) {
        Assert.assertEquals(value1, value2, message);
    }

    public static void isEqual(int value1, int value2, String message) {
        Assert.assertEquals(value1, value2, message);
    }

    public static void contains(
            String text,
            String serarched,
            String message) {
        Assert.assertTrue(
                text.contains(serarched),
                message);
    }

    public static void isEqualIgnoreCase(String value1, String value2, String message) {
        Assert.assertEquals(
                value1.toUpperCase(),
                value2.toUpperCase(),
                message);
    }

    public static void isGreater(int value1, int value2, String message) {
        Assert.assertTrue(
                value1 > value2,
                message);
    }

    public static void isLower(int value1, int value2, String message) {
        Assert.assertTrue(
                value1 < value2,
                message);
    }

    public static void isNull(Object o, String message) {
        Assert.assertNull(o, message);
    }

    public static void notIsNull(Object o, String message) {
        Assert.assertNotNull(o, message);
    }
}