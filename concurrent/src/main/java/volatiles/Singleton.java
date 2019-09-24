package volatiles;

/**
 * @author tzy
 * @create 2019-09-24 11:17
 */
public class Singleton {

        private volatile static Singleton instance;

        private Singleton() {
            new AssertionError("don't support reflect.");
        }

        public static Singleton getInstance() {
            if (instance == null) { // Single Checked
                synchronized (Singleton.class) {
                    if (instance == null) { // Double checked
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }

}
