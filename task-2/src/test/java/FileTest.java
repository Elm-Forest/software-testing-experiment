import com.ctgu.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Zhang Jinming
 * @date 3/21/2023 9:57 PM
 */
public class FileTest {
    @DisplayName(value = "一般边界值测试")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形一般边界测试用例.csv", numLinesToSkip = 1)
    void fileTest(int a, int b, int c, String expected) {
        Triangle triangle = new Triangle();
        String type = triangle.classify(a, b, c);
        assertEquals(expected, type);
    }

    @DisplayName(value = "健壮性最坏情况测试")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形健壮性最坏情况测试用例.csv", numLinesToSkip = 1)
    void fileTest1(int a, int b, int c, String expected) {
        Triangle triangle = new Triangle();
        String type = triangle.classify(a, b, c);
        assertEquals(expected, type);
    }

    @DisplayName(value = "健壮测试")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形健壮测试用例.csv", numLinesToSkip = 1)
    void fileTest2(int a, int b, int c, String expected) {
        Triangle triangle = new Triangle();
        String type = triangle.classify(a, b, c);
        assertEquals(expected, type);
    }

    @DisplayName(value = "最坏情况测试")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形最坏情况测试用例.csv", numLinesToSkip = 1)
    void fileTest4(int a, int b, int c, String expected) {
        Triangle triangle = new Triangle();
        String type = triangle.classify(a, b, c);
        assertEquals(expected, type);
    }
}
