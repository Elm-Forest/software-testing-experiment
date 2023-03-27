import com.ctgu.Triangle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {
    private final Triangle triangle = new Triangle();

    @ParameterizedTest
    @CsvSource({
            "1, 50, 50, 等腰三角形",
            "100, 50, 50, 非三角形",
            "2, 2, 3, 等腰三角形",
            "98, 50, 50, 等腰三角形"
    })
    void generalBoundaryValueTest(int a, int b, int c, String expected) {
        assertEquals(expected, triangle.classify(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 50, 50, 输入错误",
            "101, 50, 50, 输入错误",
            "1, 0, 50, 输入错误",
            "1, 101, 50, 输入错误",
            "1, 50, 0, 输入错误",
            "1, 50, 101, 输入错误"
    })
    void robustBoundaryValueTest(int a, int b, int c, String expected) {
        assertEquals(expected, triangle.classify(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 1, 等边三角形",
            "100, 100, 100, 等边三角形",
            "2, 2, 3, 等腰三角形",
            "99, 100, 100, 等腰三角形"
    })
    void worstCaseGeneralBoundaryValueTest(int a, int b, int c, String expected) {
        assertEquals(expected, triangle.classify(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1, 输入错误",
            "101, 1, 1, 输入错误",
            "1, 0, 1, 输入错误",
            "1, 101, 1, 输入错误",
            "1, 1, 0, 输入错误",
            "1, 1, 101, 输入错误"
    })
    void worstCaseRobustBoundaryValueTest(int a, int b, int c, String expected) {
        assertEquals(expected, triangle.classify(a, b, c));
    }
}
