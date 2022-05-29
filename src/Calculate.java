public class Calculate {
    private static volatile Calculate sInstance;

    private Calculate() {
    }

    public static Calculate getsInstance() {
        if (sInstance == null) {
            synchronized (Calculate.class) {
                if (sInstance == null) {
                    sInstance = new Calculate();
                }
            }
        }
        return sInstance;
    }

    public int calculate(String input) {

        return 0;
    }
}
