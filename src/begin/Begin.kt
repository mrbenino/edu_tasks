package begin

import core.Command
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

class BeginKt : Command {

    override fun execute() {
        println("Обьем прямоугольного параллелепипеда: " + volume(10, 12, 15))
        println("Площадь прямоугольного параллелепипеда: " + square(10, 12, 15))
        println("Длина окружности: " + length(10))
        println("Площадь окружности: " + square(10.0))
        println("Среднее арифметическое: " + average(44, 45))
        println("Среднее геометрическое: " + geometricMean(144, 674))
        println("Сумма модулей: " + sum(144.0, 674.0))
        println("Разность модулей: " + subtraction(144.0, 674.0))
        println("Произведение модулей: " + multiplication(144.0, 674.0))
        println("Частное модулей: " + division(144.0, 674.0))
        println("Сумма квадратов: " + sumSqrt(144.0, 674.0))
        println("Разность квадратов: " + subtractionSqrt(144.0, 674.0))
        println("Произведение квадратов: " + multiplicationSqrt(144.0, 674.0))
        println("Частное квадратов: " + divisionSqrt(144.0, 674.0))
        println("Гипотинуза триугольника: " + hypotenuse(144.0, 674.0))
        println("Перимитр триугольника: " + perimeter(144.0, 674.0))
        println("Площадь кольца: " + squareRing(44.0, 6.0))
        println("Радиус из длины окружности: " + radiusOfLength(40.0))
        println("Площадь из длины окружности: " + squareOfLength(44.0))
        println("Диаметр окружности из площади: " + diameterOfSquare(100.0))
        println("Длина окружности из площади: " + lengthOfSquare(100.0))
        println("Растояние между двумя точками: " + distanceBetween(10.0, 12.0))
    }

    fun begin5() {
        val (volume, squareCube) = volume(11.0)
        System.out.printf("Обьем куба: %f, площадь куба: %f%n", volume, squareCube)
    }

    /**
     * Дана длина ребра куба a. Найти объем куба V = a3 и площадь его по-
     * верхности S = 6·a2.
     */
    private fun volume(a: Double): Pair<Double, Double> {
        val volume = a.pow(3.0)
        val squareCube = 6 * a.pow(2)
        return volume to squareCube
    }

    /**
     * Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его
     * объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
     */
    private fun volume(a: Int, b: Int, c: Int): Int {
        return a * b * c
    }

    /**
     * Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его
     * объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
     */
    private fun square(a: Int, b: Int, c: Int): Int {
        var result = a * b
        result += b * c
        result += a * c
        return result * 2
    }

    /**
     * Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R2.
     * В качестве значения π использовать 3.14.
     */
    private fun square(r: Double): Double {
        return Math.PI * (r * r)
    }

    /**
     * Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R2.
     * В качестве значения π использовать 3.14.
     */
    private fun length(r: Int): Double {
        return Math.PI * (2 * r)
    }

    /**
     * Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
     */
    private fun average(a: Int, b: Int): Int {
        return (a + b) / 2
    }

    private fun geometricMean(a: Int, b: Int): Double {
        //TODO: add reason
        if (a < 0 || b < 0) error("placeholder")

        val result = a * b
        return sqrt(result.toDouble())
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    private fun sum(a: Double, b: Double): Double {
        return if (a == 0.0 || b == 0.0) {
            0.0
        } else abs(a) + abs(b)
    };

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    private fun subtraction(a: Double, b: Double): Double {
        return if (a == 0.0 || b == 0.0) {
            0.0
        } else abs(a) - abs(b)
    };

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    private fun multiplication(a: Double, b: Double): Double =
        if (a == 0.0 || b == 0.0) {
            0.0
        } else {
            abs(a) * abs(b)
        }


    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    private fun division(a: Double, b: Double): Double {
        return if (a == 0.0 || b == 0.0) {
            0.0
        } else {
            abs(a) / abs(b)
        }
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и
     * частное их квадратов.
     */
    private fun sumSqrt(a: Double, b: Double): Double {
        return if (a == 0.0 || b == 0.0) {
            0.0
        } else {
            a.pow(2.0) + b.pow(2.0)
        }
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и
     * частное их квадратов.
     */
    private fun subtractionSqrt(a: Double, b: Double): Double {
        return if (a == 0.0 || b == 0.0) {
            0.0
        } else {
            a.pow(2.0) + b.pow(2.0)
        }
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и
     * частное их квадратов.
     */
    private fun multiplicationSqrt(a: Double, b: Double): Double {
        return if (a == 0.0 || b == 0.0) {
            0.0
        } else {
            a.pow(2.0) + b.pow(2.0)
        }
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и
     * частное их квадратов.
     */
    private fun divisionSqrt(a: Double, b: Double): Double {
        return if (a == 0.0 || b == 0.0) {
            0.0
        } else {
            a.pow(2.0) + b.pow(2.0)
        }
    }

    /**
     *Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P
     */
    private fun hypotenuse(a: Double, b: Double): Double {
        return sqrt(a.pow(2.0) + b.pow(2.0))
    }

    /**
     *Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P
     */
    private fun perimeter(a: Double, b: Double): Double {
        return a + b + hypotenuse(a, b)
    }

    /**
     * Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
     * Найти площади этих кругов S1 и S2, а также площадь S3 кольца,
     * внешний радиус которого равен R1, а внутренний радиус равен R2:
     */
    private fun squareRing(a: Double, b: Double): Double {
        return if (square(a) - square(b) > 0) {
            square(a) - square(b)
        } else {
            square(b) - square(a)
        }
    }

    /**
     * Дана длина L окружности. Найти ее радиус R и площадь S круга, ог- раниченного этой окружностью,
     */
    private fun radiusOfLength(l: Double): Double {
        return l / PI / 2;
    }

    /**
     * Дана длина L окружности. Найти ее радиус R и площадь S круга, ог- раниченного этой окружностью,
     */
    private fun squareOfLength(l: Double): Double {
        return square(radiusOfLength(l))
    }

    /**
     * Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг, учитывая,
     * что L = π·D, S = π·D2/4. В качестве значения π использовать 3.14.
     */
    private fun diameterOfSquare(s: Double): Double = sqrt(s / PI / 4)


    /**
     * Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг,
     * учитывая, что L = π·D, S = π·D2/4. В качестве значения π использовать 3.14.
     */
    private fun lengthOfSquare(s: Double): Double = diameterOfSquare(s) / PI


    private fun distanceBetween(x1: Double, x2: Double): Double = x2 - x1

}