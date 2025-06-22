package SingletonPatternExample;

public class AppLauncher {
    public static void main(String[] args) {
        LogService logA = LogService.connect();
        logA.record("Session start");

        LogService logB = LogService.connect();
        logB.record("User activity recorded");

        if (logA == logB) {
            System.out.println("Same logger is reused");
        } else {
            System.out.println("Multiple logger instances found");
        }
    }
}

