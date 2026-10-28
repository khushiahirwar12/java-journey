public class ExceptionPropagationDemo {

    static void methodC() {
        int result = 50 / 0;
        System.out.println("Result: " + result);
    }

    static void methodB() {
        methodC();
    }

    static void methodA() {
        methodB();
    }

    static void stepThree() throws Exception {
        throw new NullPointerException("Root cause: raw data source is null");
    }

    static void stepTwo() throws Exception {
        try {
            stepThree();
        } catch (NullPointerException npe) {
            Exception chained = new Exception("Processing failed in stepTwo");
            chained.initCause(npe);
            throw chained;
        }
    }

    static void stepOne() throws Exception {
        stepTwo();
    }

    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Exception Propagation & Chained Exceptions Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("--------------------------------------------------");

        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Handled in main: " + e.getMessage());
            System.out.println("Top stack trace element: " + e.getStackTrace()[0]);
        }

        try {
            stepOne();
        } catch (Exception e) {
            System.out.println("High-level exception: " + e.getMessage());
            System.out.println("Actual root cause: " + e.getCause());
        }

        System.out.println("Application flow completed gracefully.");
    }
}
