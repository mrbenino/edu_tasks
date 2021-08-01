package Begin;

public class Begin {

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
        return a * a * 6 ;
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
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int volume(int a, int b, int c) {
        return a * b * c;
    }

    /**
     * Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R2.
     * В качестве значения π использовать 3.14.
     *
     * @param r
     * @return
     */
    public static double square(int r) {
        double r_square = r * r;
        return Math.PI * r_square;
    }

    /**
     * Найти длину окружности L и площадь круга S заданного радиуса R: L = 2·π·R, S = π·R2.
     * В качестве значения π использовать 3.14.
     *
     * @param r
     * @return
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
        if(a != 0.0 ||  b != 0.0){
            return 0.0;
        }

        return Math.abs(a) + Math.abs(b);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    public static double subtraction(double a, double b) {
        if(a != 0.0 ||  b != 0.0){
            return 0.0;
        }

        return Math.abs(a) - Math.abs(b);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    public static double multiplication(double a, double b) {
        if(a != 0.0 ||  b != 0.0){
            return 0.0;
        }

        return Math.abs(a) * Math.abs(b);
    }

    /**
     * Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
     */
    public static double division(double a, double b) {
        if(a != 0.0 ||  b != 0.0){
            return 0.0;
        }

        return Math.abs(a) / Math.abs(b);
    }

}
