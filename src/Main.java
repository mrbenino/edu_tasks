import Begin.Begin;
import Begin.BeginKt;

public class Main {
    public static void main(String[] args) {

        System.out.println("Обем куба: " + Begin.volume(11));
        System.out.println("Обем куба: " + BeginKt.volume(11));

        System.out.println("Площадь куба: " + Begin.square_cube(10));
        System.out.println("Площадь куба: " + BeginKt.square_cube(10));

        System.out.println("Обьем прямоугольного параллелепипеда: " + Begin.volume(10, 12, 15));
        System.out.println("Обьем прямоугольного параллелепипеда: " + BeginKt.volume(10, 12, 15));

        System.out.println("Площадь прямоугольного параллелепипеда: " + Begin.square(10, 12, 15));
        System.out.println("Площадь прямоугольного параллелепипеда: " + BeginKt.square(10, 12, 15));

        System.out.println("Длина окружности: " + Begin.length(10));
        System.out.println("Длина окружности: " + BeginKt.length(10));

        System.out.println("Площадь окружности: " + Begin.square(10));
        System.out.println("Площадь окружности: " + BeginKt.square(10));

        System.out.println("Среднее арифметическое: " + Begin.average(44, 45));
        System.out.println("Среднее арифметическое: " + BeginKt.average(44, 45));

        System.out.println("Среднее геометрическое: " + Begin.geometric_mean(144, 674));
        System.out.println("Среднее геометрическое: " + BeginKt.geometric_mean(144, 674));

        System.out.println("Сумма модулей: " + Begin.sum(144, 674));
        System.out.println("Сумма модулей: " + BeginKt.sum(144, 674));

        System.out.println("Разность модулей: " + Begin.subtraction(144, 674));
        System.out.println("Разность модулей: " + BeginKt.subtraction(144, 674));

        System.out.println("Произведение модулей: " + Begin.multiplication(144, 674));
        System.out.println("Произведение модулей: " + BeginKt.multiplication(144, 674));

        System.out.println("Частное модулей: " + Begin.division(144, 674));
        System.out.println("Частное модулей: " + BeginKt.division(144, 674));

        System.out.println("Сумма квадратов: " + Begin.sum_sqrt(144, 674));
        System.out.println("Сумма квадратов: " + BeginKt.sum_sqrt(144, 674));

        System.out.println("Разность квадратов: " + Begin.subtraction_sqrt(144, 674));
        System.out.println("Разность квадратов: " + BeginKt.subtraction_sqrt(144, 674));

        System.out.println("Произведение квадратов: " + Begin.multiplication_sqrt(144, 674));
        System.out.println("Произведение квадратов: " + BeginKt.multiplication_sqrt(144, 674));

        System.out.println("Частное квадратов: " + Begin.division_sqrt(144, 674));
        System.out.println("Частное квадратов: " + BeginKt.division_sqrt(144, 674));

        System.out.println("Гипотинуза триугольника: " + Begin.hypotenuse(144, 674));
        System.out.println("Гипотинуза триугольника: " + BeginKt.hypotenuse(144, 674));

        System.out.println("Перимитр триугольника: " + Begin.perimeter(144, 674));
        System.out.println("Перимитр триугольника: " + BeginKt.perimeter(144, 674));

        System.out.println("Площадь кольца: " + Begin.square_ring(14, 4));
        System.out.println("Площадь кольца: " + BeginKt.square_ring(44, 6));

        System.out.println("Радиус из длины окружности: " + Begin.radius_of_length(10));
        System.out.println("Радиус из длины окружности: " + BeginKt.radius_of_length(40));

        System.out.println("Площадь из длины окружности: " + Begin.square_of_length(10));
        System.out.println("Площадь из длины окружности: " + BeginKt.square_of_length(44));

        System.out.println("Диаметр окружности из площади: " + Begin.diameter_of_square(1000));
        System.out.println("Диаметр окружности из площади: " + BeginKt.diameter_of_square(100));

        System.out.println("Длина окружности из площади: " + Begin.length_of_square(1000));
        System.out.println("Длина окружности из площади: " + BeginKt.length_of_square(100));

        System.out.println("Растояние между двумя точками: " + Begin.distance_between(10, 11));
        System.out.println("Растояние между двумя точками: " + BeginKt.distance_between(10, 12));
    }

}

