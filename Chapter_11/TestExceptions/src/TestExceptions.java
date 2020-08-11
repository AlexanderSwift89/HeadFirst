public class TestExceptions {

    public static void main(String[] args) {

        String test = "No";
        try {
            System.out.println("Begin of try");
            doRisky(test);
            System.out.println("End of try");
        } catch (TestExceptions te) {
            System.out.println("Hard exception!!!");
        } finally {
            System.out.println("finally");
        }
        System.out.println("End of main");
    }

    static void doRisky(String test) throws TestExceptions{
        System.out.println("Begin of dangerous method");
        if ("yes".equals(test)) {
            throw new TestExceptions();
        }
        System.out.println("End of dangerous method");
        return;
    }
}
