package app;

public class Main {

    private static final double CONV_K = 1.609;

    public static void main(String[] args){
        System.out.println("Converter App.");
        System.out.println("App for measure converting.");
        double mls = 5;
        double kilometers = convMilesToKms(mls);
        System.out.println("Result is " + kilometers + " kilometers");
    }

    private static double convMilesToKms(double miles) {
        return miles * CONV_K;
    }
}