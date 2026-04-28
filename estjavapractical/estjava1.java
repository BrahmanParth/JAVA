public class estjava1 {
    public static void main(String[] args) {
        checkAgeEligibility(15);
        checkAgeEligibility(25);
    }

    static void checkAgeEligibility(int age) {
        try {
            if (age < 18) {
                throw new Exception("Not eligible: Age must be 18 or above");
            }
            System.out.println("Age " + age + " is eligible");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for age " + age + "\n");
        }
    }
}
