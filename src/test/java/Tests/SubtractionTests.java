package Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static interfaces.INameTags.*;

@Tag(REGRESS)
@Tag(SUBTRACTION)
public class SubtractionTests {

    @Test
    @Tag(SMOKE)
    @DisplayName("Результат вычитания 1")
    public void subtraction1() {
        int a = 2;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(1, subtraction, "Ошибка вычитания");
        System.out.println("Результат = " + subtraction);
    }

    @Test
    @DisplayName("Результат вычитания 2")
    public void subtraction2() {
        int a = 3;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(2, subtraction, "Ошибка вычитания");
        System.out.println("Результат = " + subtraction);
    }

    @Test
    @DisplayName("Результат вычитания 3")
    public void subtraction3() {
        int a = 4;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(3, subtraction, "Ошибка вычитания");
        System.out.println("Результат = " + subtraction);
    }

    @Test
    @DisplayName("Результат вычитания 4")
    public void subtraction4() {
        int a = 5;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(4, subtraction, "Ошибка вычитания");
        System.out.println("Результат = " + subtraction);
    }

    @Test
    @DisplayName("Результат вычитания 5")
    public void subtraction5() {
        int a = 6;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(5, subtraction, "Ошибка вычитания");
        System.out.println("Результат = " + subtraction);
    }
}