package tests;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {
    @Test
    public void testMinus() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex c = a.minus(b);
        assert c.equals(new Complex(-2, -2));
    }

    @Test
    public void testPlus() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        assert a.plus(b).equals(new Complex(4, 6));
    }

    @Test
    public void testMultiply() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        assert a.times(b).equals(new Complex(-5, 10));
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        assert a.div(b).equals(new Complex(1.0, 0.0));
    }
}
