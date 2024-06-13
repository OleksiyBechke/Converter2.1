package app;

public class Main {

    private static final double CONV_K = 1.609;

    public static void main(String[] args){
        System.out.println("Converter App.");
        System.out.println("App for measure converting.");
        double mls = 5;
        double kms = 12;
        double kilometers = convMilesToKms(mls);
        double miles = convKmsToMiles(kms);
        System.out.println("Result is " + kilometers + " kilometers and " + miles + " miles.");
    }

    private static double convMilesToKms(double miles) {
        return miles * CONV_K;
    }


    private static double convKmsToMiles(double kms) {
        return kms / CONV_K;
    }
}