package lambdas.differences;

public class LambdaDifferencesClass {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImpl());
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });
        runner.run(() -> System.out.println("Hello"));
    }
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}

class ExecutableImpl implements Executable {
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

interface Executable {
    void execute();
}