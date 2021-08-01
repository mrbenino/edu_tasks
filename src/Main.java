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

        System.out.println("Сумма: " + Begin.sum(144, 674));
        System.out.println("Сумма: " + BeginKt.sum(144, 674));

        System.out.println("Произведение: " + Begin.subtraction(144, 674));
        System.out.println("Произведение: " + BeginKt.subtraction(144, 674));

        System.out.println("Частное: " + Begin.multiplication(144, 674));
        System.out.println("Частное: " + BeginKt.multiplication(144, 674));

        System.out.println("Модулей: " + Begin.division(144, 674));
        System.out.println("Модулей: " + BeginKt.division(144, 674));

    }

}

