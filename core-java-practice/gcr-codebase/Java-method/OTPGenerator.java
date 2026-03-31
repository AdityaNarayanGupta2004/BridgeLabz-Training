import java.util.Arrays;
public class OTPGenerator {
    public static void main(String[] args) {
        int[] otp = new int[10];
        for (int i = 0; i < 10; i++) {
            otp[i] = generateOtp();
        }
        System.out.println("Generated OTPs are: " + Arrays.toString(otp));
        if (UniqueOPT(otp)) {
            System.out.println("All the OTPs are unique");
        } else {
            System.out.println("Duplicate OTPs found");
        }
    }
    public static int generateOtp() {
        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean UniqueOPT(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
