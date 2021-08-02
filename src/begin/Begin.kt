package begin

import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Дана длина ребра куба a. Найти объем куба V = a3 и площадь его по-
 * верхности S = 6·a2.
 */
fun volume(a: Double): Double {
    return a.pow(3.0)
}

/**
 * Дана длина ребра куба a. Найти объем куба V = a3 и площадь его по-
 * верхности S = 6·a2.
 */
fun squareCube(a: Double): Double {
    return a * a * 6
}

/**
 * Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его
 * объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
 */
fun volume(a: Int, b: Int, c: Int): Int {
    return a * b * c
}

/**
 * Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его
 * объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
 */
fun square(a: Int, b: Int, c: Int): Int {
    var result = a * b
    result += b * c
    result += a * c
    return result * 2
}

/**
 * Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R2.
 * В качестве значения π использовать 3.14.
 */
fun square(r: Double): Double {
    return Math.PI * (r * r)
}

/**
 * Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R2.
 * В качестве значения π использовать 3.14.
 */
fun length(r: Int): Double {
    return Math.PI * (2 * r)
}

/**
 * Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
 */
fun average(a: Int, b: Int): Int {
    return (a + b) / 2
}

fun geometricMean(a: Int, b: Int): Double {
    if (a < 0 || b < 0) {
        return 0.0
    }

    val result = a * b
    return Math.sqrt(result.toDouble())
}

/**
 * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
 */
fun sum(a: Double, b: Double): Double {
    return if (a == 0.0 || b == 0.0) {
        0.0
    } else abs(a) + abs(b)
};

/**
 * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
 */
fun subtraction(a: Double, b: Double): Double {
    return if (a == 0.0 || b == 0.0) {
        0.0
    } else abs(a) - abs(b)
};

/**
 * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
 */
fun multiplication(a: Double, b: Double): Double {
    return if (a == 0.0 || b == 0.0) {
        0.0
    } else abs(a) * abs(b)
};

/**
 * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
 */
fun division(a: Double, b: Double): Double {
    return if (a == 0.0 || b == 0.0) {
        0.0
    } else abs(a) / abs(b)
};

/**
 * Даны два ненулевых числа. Найти сумму, разность, произведение и
 * частное их квадратов.
 */
fun sumSqrt(a: Double, b: Double): Double {
    return if (a == 0.0 || b == 0.0) {
        0.0
    } else a.pow(2.0) + b.pow(2.0)
}

/**
 * Даны два ненулевых числа. Найти сумму, разность, произведение и
 * частное их квадратов.
 */
fun subtractionSqrt(a: Double, b: Double): Double {
    return if (a == 0.0 || b == 0.0) {
        0.0
    } else a.pow(2.0) + b.pow(2.0)
}

/**
 * Даны два ненулевых числа. Найти сумму, разность, произведение и
 * частное их квадратов.
 */
fun multiplicationSqrt(a: Double, b: Double): Double {
    return if (a == 0.0 || b == 0.0) {
        0.0
    } else a.pow(2.0) + b.pow(2.0)
}

/**
 * Даны два ненулевых числа. Найти сумму, разность, произведение и
 * частное их квадратов.
 */
fun divisionSqrt(a: Double, b: Double): Double {
    return if (a == 0.0 || b == 0.0) {
        0.0
    } else a.pow(2.0) + b.pow(2.0)
}

/**
 *Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P
 */
fun hypotenuse(a: Double, b: Double): Double {
    return sqrt(a.pow(2.0) + b.pow(2.0))
}

/**
 *Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P
 */
fun perimeter(a: Double, b: Double): Double {
    return a + b + hypotenuse(a, b)
}

/**
 * Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
 * Найти площади этих кругов S1 и S2, а также площадь S3 кольца,
 * внешний радиус которого равен R1, а внутренний радиус равен R2:
 */
fun squareRing(a: Double, b: Double): Double {
    return if (square(a) - square(b) > 0) square(a) - square(b) else square(b) - square(a)
}

/**
 * Дана длина L окружности. Найти ее радиус R и площадь S круга, ог- раниченного этой окружностью,
 */
fun radiusOfLength(l: Double): Double {
    return l / PI / 2;
}

/**
 * Дана длина L окружности. Найти ее радиус R и площадь S круга, ог- раниченного этой окружностью,
 */
fun squareOfLength(l: Double): Double {
    return square(radiusOfLength(l))
}

/**
 * Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг, учитывая,
 * что L = π·D, S = π·D2/4. В качестве значения π использовать 3.14.
 */
fun diameterOfSquare(s: Double): Double {
    return sqrt(s / PI / 4)
}

/**
 * Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг,
 * учитывая, что L = π·D, S = π·D2/4. В качестве значения π использовать 3.14.
 */
fun lengthOfSquare(s: Double): Double {
    return diameterOfSquare(s) / PI
}

fun distanceBetween(x1: Double, x2: Double):Double {
    return x2 - x1
}