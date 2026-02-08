package Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumTests {

    @Test
    @DisplayName("Результат суммы 1")
    public void sum1() {
        int a = 1;
        int b = 0;
        int sum;
        sum = a + b;
        Assertions.assertEquals(1, sum, "Ошибка суммы");
    }

    @Test
    @DisplayName("Результат суммы 2")
    public void sum2() {
        int a = 1;
        int b = 1;
        int sum;
        sum = a + b;
        Assertions.assertEquals(2, sum, "Ошибка суммы");
    }

    @Test
    @DisplayName("Результат суммы 3")
    public void sum3() {
        int a = 2;
        int b = 1;
        int sum;
        sum = a + b;
        Assertions.assertEquals(3, sum, "Ошибка суммы");
    }

    @Test
    @DisplayName("Результат суммы 4")
    public void sum4() {
        int a = 2;
        int b = 2;
        int sum;
        sum = a + b;
        Assertions.assertEquals(4, sum, "Ошибка суммы");
    }

    @Test
    @DisplayName("Результат суммы 5")
    public void sum5() {
        int a = 2;
        int b = 3;
        int sum;
        sum = a + b;
        Assertions.assertEquals(5, sum, "Ошибка суммы");
    }
}
