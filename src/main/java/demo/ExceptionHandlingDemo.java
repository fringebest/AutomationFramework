package demo;

public class ExceptionHandlingDemo {


    public static void main(String[] args) {

        try {
            demo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {

                System.out.println("This is the beggining of the class");
                int i = 1/0;
                System.out.println("This is the end of the class");

        }
        catch (Exception exp){
            System.out.println("Error message is: " + exp.getMessage());
            System.out.println("Cause is: " +exp.getCause());
            exp.getStackTrace();
        }

    }

    public static void demo() throws Exception {
        System.out.print("Hello world");
        int i = 1/0;
        System.out.println("End of world");
    }
}
