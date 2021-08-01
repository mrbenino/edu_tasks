import Begin.Begin;
import Begin.BeginKt;

public class Main {
    public static void main(String[] args) {

        System.out.println(Begin.volume(11));
        System.out.println(BeginKt.volume(11));

        System.out.println(Begin.square_cube(10));
        System.out.println(BeginKt.square_cube(10));

        System.out.println(Begin.volume(10, 12, 15));
        System.out.println(BeginKt.volume(10, 12, 15));

        System.out.println(Begin.square(10, 12, 15));
        System.out.println(BeginKt.square(10, 12, 15));

        System.out.println(Begin.length(10));
        System.out.println(BeginKt.length(10));

        System.out.println(Begin.square(10));
        System.out.println(BeginKt.square(10));

        System.out.println(Begin.average(44, 45));
        System.out.println(BeginKt.average(44, 45));

        System.out.println(Begin.geometric_mean(144, 674));
        System.out.println(BeginKt.geometric_mean(144, 674));

        System.out.println(Begin.sum(144, 674));
        System.out.println(BeginKt.sum(144, 674));

        System.out.println(Begin.subtraction(144, 674));
        System.out.println(BeginKt.subtraction(144, 674));

        System.out.println(Begin.multiplication(144, 674));
        System.out.println(BeginKt.multiplication(144, 674));

        System.out.println(Begin.division(144, 674));
        System.out.println(BeginKt.division(144, 674));

    }

}

