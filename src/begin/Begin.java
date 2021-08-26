package begin;

import core.Command;

public class Begin implements Command {

    @Override
    public void execute() {
        System.out.println("Обем куба: " + Begin.volume(11.0));
        System.out.println("Обьем прямоугольного параллелепипеда: " + Begin.volume(10, 12, 15));
        System.out.println("Площадь прямоугольного параллелепипеда: " + Begin.square(10, 12, 15));
        System.out.println("Длина окружности: " + Begin.length(10));
        System.out.println("Площадь окружности: " + Begin.square(10));
        System.out.println("Среднее арифметическое: " + Begin.average(44, 45));
        System.out.println("Среднее геометрическое: " + Begin.geometric_mean(144, 674));
        System.out.println("Сумма модулей: " + Begin.sum(144, 674));
        System.out.println("Разность модулей: " + Begin.subtraction(144, 674));
        System.out.println("Произведение модулей: " + Begin.multiplication(144, 674));
        System.out.println("Частное модулей: " + Begin.division(144, 674));
        System.out.println("Сумма квадратов: " + Begin.sumSqrt(144, 674));
        System.out.println("Разность квадратов: " + Begin.subtraction_sqrt(144, 674));
        System.out.println("Произведение квадратов: " + Begin.multiplication_sqrt(144, 674));
        System.out.println("Частное квадратов: " + Begin.division_sqrt(144, 674));
        System.out.println("Гипотинуза триугольника: " + Begin.hypotenuse(144, 674));
        System.out.println("Перимитр триугольника: " + Begin.perimeter(144, 674));
        System.out.println("Площадь кольца: " + Begin.square_ring(14, 4));
        System.out.println("Радиус из длины окружности: " + Begin.radius_of_length(10));
        System.out.println("Площадь из длины окружности: " + Begin.square_of_length(10));
        System.out.println("Диаметр окружности из площади: " + Begin.diameter_of_square(1000));
        System.out.println("Длина окружности из площади: " + Begin.length_of_square(1000));
        System.out.println("Растояние между двумя точками: " + Begin.distance_between(10, 11));
    }

    /**
     * Дана длина ребра куба a. Найти объем куба V = a3 и площадь его по-
     * верхности S = 6·a2.
     *
     * @param a
     * @return
     */
    public static double volume(double a) {
        return Math.pow(a, 3);
    }

    /**
     * Дана длина ребра куба a. Найти объем куба V = a3 и площадь его по-
     * верхности S = 6·a2.
     *
     * @param a
     * @return
     */
    public static double square_cube(double a) {
        return a * a * 6;
    }

    /**
     * Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его
     * объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int square(int a, int b, int c) {
        int result = a * b;
        result += b * c;
        result += a * c;
        return result * 2;
    }

    /**
     * Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его
     * объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
     *
     */
    public static int volume(int a, int b, int c) {
        return a * b * c;
    }

    /**
     * Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R2.
     * В качестве значения π использовать 3.14.
     */
    public static double square(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R2.
     * В качестве значения π использовать 3.14.
     */
    public static double length(int r) {
        return Math.PI * 2 * r;
    }

    /**
     * Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
     *
     * @param a
     * @param b
     * @return
     */
    public static int average(int a, int b) {
        return (a + b) / 2;
    }

    /**
     * Даны два неотрицательных числа a и b. Найти их среднее геометриче-
     * ское, то есть квадратный корень из их произведения: a ⋅ b .
     *
     * @param a
     * @param b
     * @return
     */
    public static double geometric_mean(int a, int b) {
        if (a < 0.0 || b < 0.0) {
            return 0.0;
        }

        int result = a * b;

        return Math.sqrt(result);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    public static double sum(double a, double b) {
        if (a == 0.0 || b == 0.0) {
            return 0.0;
        }

        return Math.abs(a) + Math.abs(b);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    public static double subtraction(double a, double b) {
        if (a == 0.0 || b == 0.0) {
            return 0.0;
        }

        return Math.abs(a) - Math.abs(b);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    public static double multiplication(double a, double b) {
        if (a == 0.0 || b == 0.0) {
            return 0.0;
        }

        return Math.abs(a) * Math.abs(b);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    public static double division(double a, double b) {
        if (a == 0.0 || b == 0.0) {
            return 0.0;
        }

        return Math.abs(a) / Math.abs(b);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и
     * частное их квадратов.
     *
     * @param a
     * @param b
     * @return
     */
    public static double sumSqrt(double a, double b) {
        if (a == 0.0 || b == 0.0) {
            return 0.0;
        }

        return Math.pow(a, 2) + Math.pow(b, 2);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и
     * частное их квадратов.
     *
     * @param a
     * @param b
     * @return
     */
    public static double subtraction_sqrt(double a, double b) {
        if (a == 0.0 || b == 0.0) {
            return 0.0;
        }

        return Math.pow(a, 2) - Math.pow(b, 2);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и
     * частное их квадратов.
     *
     * @param a
     * @param b
     * @return
     */
    public static double multiplication_sqrt(double a, double b) {
        if (a == 0.0 || b == 0.0) {
            return 0.0;
        }

        return Math.pow(a, 2) * Math.pow(b, 2);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и
     * частное их квадратов.
     *
     * @param a
     * @param b
     * @return
     */
    public static double division_sqrt(double a, double b) {
        if (a == 0.0 || b == 0.0) {
            return 0.0;
        }

        return Math.pow(a, 2) / Math.pow(b, 2);
    }

    /**
     * Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P
     *
     * @param a
     * @param b
     * @return
     */
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    /**
     * Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P
     *
     * @param a
     * @param b
     * @return
     */
    public static double perimeter(double a, double b) {
        return a + b + hypotenuse(a, b);
    }

    /**
     * Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2). Найти площади этих кругов S1 и S2, а также площадь
     * S3 кольца, внешний радиус которого равен R1, а внутренний радиус равен R2:
     *
     * @param a
     * @param b
     * @return
     */
    public static double square_ring(double a, double b) {
        return square(a) - square(b) > 0 ? square(a) - square(b) : square(b) - square(a);
    }

    /**
     * Дана длина L окружности. Найти ее радиус R и площадь S круга, ог- раниченного этой окружностью,
     *
     * @param l
     * @return
     */
    public static double radius_of_length(double l) {
        return l / Math.PI / 2;
    }

    /**
     * Дана длина L окружности. Найти ее радиус R и площадь S круга, ог- раниченного этой окружностью,
     *
     * @param l
     * @return
     */
    public static double square_of_length(double l) {
        return square(radius_of_length(l));
    }

    /**
     * Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг, учитывая, что L = π·D,
     * S = π·D2/4. В качестве значения π использовать 3.14.
     *
     * @param s
     * @return
     */
    public static double diameter_of_square(double s) {
        return Math.sqrt(s / 4 / Math.PI);
    }

    /**
     * Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг, учитывая, что L = π·D,
     * S = π·D2/4. В качестве значения π использовать 3.14.
     *
     * @param s
     * @return
     */
    public static double length_of_square(double s) {
        return diameter_of_square(s) / Math.PI;
    }

    public static double distance_between(double x1, double x2) {
        return x2 - x1;
    }
}
