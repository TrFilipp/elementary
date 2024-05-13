package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distant(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when32to32then1Dot41() {
        double expected = 1.41;
        int x1 = 3;
        int y1 = 3;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distant(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when02to34then2Dot24() {
        double expected = 2.24;
        int x1 = 0;
        int y1 = 3;
        int x2 = 2;
        int y2 = 4;
        double out = Point.distant(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when42to01then2Dot24() {
        double expected = 2.24;
        int x1 = 4;
        int y1 = 0;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distant(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when53to35then2Dot83() {
        double expected = 2.83;
        int x1 = 5;
        int y1 = 3;
        int x2 = 3;
        int y2 = 5;
        double out = Point.distant(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}