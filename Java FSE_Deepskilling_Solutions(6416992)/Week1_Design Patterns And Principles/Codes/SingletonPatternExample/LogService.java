package SingletonPatternExample;

public class LogService {
    private static LogService logRef;

    private LogService() {
        System.out.println("LogService initialized");
    }

    public static LogService connect() {
        if (logRef == null) {
            logRef = new LogService();
        }
        return logRef;
    }

    public void record(String info) {
        System.out.println("Entry: " + info);
    }
}
