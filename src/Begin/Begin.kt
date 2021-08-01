package Begin

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
fun square_cube(a: Double): Double {
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
fun square(r: Int): Double {
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

fun geometric_mean(a: Int, b: Int): Double {
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
