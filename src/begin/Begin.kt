package begin

import core.Command
import core.printf
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

class BeginKt : Command {

    override fun execute() {
        println(begin5())
        println(begin7())
        println(begin8())
        println(begin9())
        println(begin10())
        println(begin11())
        println(begin12())
        println(begin13())
        println(begin14())
        println(begin15())
        println(begin16())
    }

    private fun begin5() {
        val (volume, squareCube) = volume(11.0)
        "Обьем куба: %f, площадь куба: %f%n".printf(volume, squareCube)
    }

    private fun begin7() {
        val (square, length) = square(10.0)
        "Длина окружности: %f, площадь круга: %f".printf(square, length)
    }

    private fun begin8() {
        val average = average(10.0, 24.0)
        "Cреднее арифметическое: %f".printf(average)
    }

    private fun begin9() {
        val geometricMean = geometricMean(22.0, 44.0)
        "Cреднее геометрическое: %f".printf(geometricMean)
    }

    private fun begin10() {
        val sum = sum(10.0, 20.0)
        println(sum)
    }

    private fun begin11() {
        val mySqlt = mySqlt(10.0, 20.0)
        println(mySqlt)
    }

    private fun begin12() {
        val hypotenuse = hypotenuse(10.0, 20.0)
        println(hypotenuse)
    }

    private fun begin13() {
        println(squareRing(20.0, 10.0))
    }

    private fun begin14() {
        val (radius, square) = squareOfLength(12.2)
        "Радиус круга: %f площядь круга: %f".printf(radius, square)
    }

    private fun begin15() {
        val (diameter, length) = diameterOfSquare(10.0)
        "Диаметр : %f, длина: %f".printf(diameter, length)
    }

    private fun begin16() {
        val distanceBetween = abs(20.0 - 40.0)
        println("Расстояние между двумя точками:  $distanceBetween")
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
     * Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R2.
     * В качестве значения π использовать 3.14.
     */
    private fun square(r: Double): Pair<Double, Double> {
        val square = Math.PI * (r * r)
        val length = Math.PI * (2 * r)
        return square to length
    }

    /**
     * Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
     */
    private fun average(a: Double, b: Double): Double {
        return (a + b) / 2
    }

    /**
     * Даны два неотрицательных числа a и b. Найти их среднее геометриче-
     * ское, то есть квадратный корень из их произведения:
     */
    private fun geometricMean(a: Double, b: Double): Double {
        if (a < 0 || b < 0) error("a and b should be bigger then 0")

        return sqrt(a * b)
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    private fun sum(a: Double, b: Double): String {
        if (a == 0.0 || b == 0.0) {
            error("placeholder")
        } else {
            val sum = abs(a) + abs(b)
            val subtraction = abs(a) - abs(b)
            val multiplication = abs(a) * abs(b)
            val division = abs(a) / abs(b)
            return "Сумма: $sum, разность: $subtraction, произведение: $multiplication, частность: $division"
        }
    }


    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и
     * частное их квадратов.
     */
    private fun mySqlt(a: Double, b: Double): String {
        if (a == 0.0 || b == 0.0) {
            error("placeholder")
        } else {
            val sum = a.pow(2.0) + b.pow(2.0)
            val subtraction = a.pow(2.0) - b.pow(2.0)
            val multiplication = a.pow(2.0) * b.pow(2.0)
            val division = a.pow(2.0) / b.pow(2.0)
            return "Сумма: $sum, разность: $subtraction, произведение: $multiplication, частное: $division"
        }
    }

    /**
     * Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P
     */
    private fun hypotenuse(a: Double, b: Double): Pair<Double, Double> {
        val hypotenuse = sqrt(a.pow(2.0) + b.pow(2.0))
        val perimeter = a + b + sqrt(a.pow(2.0) + b.pow(2.0))
        return hypotenuse to perimeter
    }

    /**
     * Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
     * Найти площади этих кругов S1 и S2, а также площадь S3 кольца,
     * внешний радиус которого равен R1, а внутренний радиус равен R2:
     */
    private fun squareRing(a: Double, b: Double): String {
        val r1 = Math.PI * (a * a)
        val r2 = Math.PI * (b * b)
        return "Площадь круга  R1:" + r1 +
                "Площадь круга  R2:" + r2 +
                "Площадь круга R3" + (r1 - r2)
    }

    /**
     * Дана длина L окружности. Найти ее радиус R и площадь S круга, ог- раниченного этой окружностью,
     */
    private fun squareOfLength(l: Double): Pair<Double, Double> {
        return (l / PI / 2) to (sqrt(l / PI / 2))
    }

    /**
     * Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг, учитывая,
     * что L = π·D, S = π·D2/4. В качестве значения π использовать 3.14.
     */
    private fun diameterOfSquare(s: Double): Pair<Double, Double> {
        return (sqrt(s / PI / 4)) to (sqrt(s / PI / 4) / PI)
    }
}