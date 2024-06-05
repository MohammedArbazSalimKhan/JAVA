package labpack;

public class AgeVage {

	public static void main(String[] args) {
		int age = 25; // The person's age
        int votingAge = 18; // The minimum voting age
        
        // Compare age and votingAge
        if (age >= votingAge) {
            // Output if the person is old enough to vote
            System.out.println("Old enough to vote!");
        } else {
            // Output if the person is not old enough to vote
            System.out.println("Not old enough to vote.");
        }
	}

}
