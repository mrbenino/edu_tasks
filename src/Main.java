import begin.Begin;
import begin.BeginKt;
import core.Command;

public class Main {

    public static void main(String[] args) {
        Command beginKt = new BeginKt(); // BeginKt -> Command
        beginKt.execute();
    }
}

