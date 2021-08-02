import begin.Begin;
import begin.BeginKt;
import core.Command;

public class Main {

    public static void main(String[] args) {
        Command beginKt = new BeginKt(); // BeginKt -> Command
        beginKt.execute();

        //TODO: add same realization for Java variant
        System.out.println("Обем куба: " + Begin.volume(11.0));

        // TODO: move realization of each task to appropriate method
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

        System.out.println("Сумма квадратов: " + Begin.sum_sqrt(144, 674));

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
}

