package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point x = new Point(0, 2);
        Point y = new Point(0, 0);
        assertThat(x.distance(y)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when33to22then1Dot41() {
        double expected = 1.41;
        Point x = new Point(3, 3);
        Point y = new Point(2, 2);
        assertThat(x.distance(y)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when03to24then2Dot24() {
        double expected = 2.24;
        Point x = new Point(0, 3);
        Point y = new Point(2, 4);
        assertThat(x.distance(y)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when40to21then2Dot24() {
        double expected = 2.24;
        Point x = new Point(4, 0);
        Point y = new Point(2, 1);
        assertThat(x.distance(y)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when53to35then2Dot83() {
        double expected = 2.83;
        Point x = new Point(5, 3);
        Point y = new Point(3, 5);
        assertThat(x.distance(y)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when321to456then5Dot92() {
        double expected = 5.92;
        Point first = new Point(3, 2, 1);
        Point second = new Point(4, 5, 6);
        assertThat(second.distance3d(first)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when666to222then6Dot93() {
        double expected = 6.93;
        Point first = new Point(6, 6, 6);
        Point second = new Point(2, 2, 2);
        assertThat(second.distance3d(first)).isEqualTo(expected, withPrecision(0.01));
    }
}