package InsuranceDemo;

public class Main {
    public static void main(String[] args) {
        // Sample insurance card
        InsuranceCard card = new InsuranceCard("1234567890", "Default");


        // Sample policyholder with the card
        PolicyHolder policyHolder = new PolicyHolder("PH001", "John Doe", card);

        card = new InsuranceCard(card.getCardNum(), policyHolder.getName());

        // Sample dependents sharing the policyholder's card
        Dependent dependent1 = new Dependent("D001", "Jane Doe", card, policyHolder);
        Dependent dependent2 = new Dependent("D002", "Alex Doe", card, policyHolder);

        // Adding dependents to the policyholder
        policyHolder.addDependent(dependent1);
        policyHolder.addDependent(dependent2);

        // Display the policyholder and their dependents
        displayPolicyHolder(policyHolder);
    }

    public static void displayPolicyHolder(PolicyHolder policyHolder) {
        System.out.println("Policyholder:");
        System.out.println("ID: " + policyHolder.getId());
        System.out.println("Name: " + policyHolder.getName());
        System.out.println("Card: " + policyHolder.getInsuranceCard().getCardNum());
        System.out.println("Dependents:");

        for (Dependent dependent : policyHolder.getDependents()) {
            System.out.println("\n\tDependent:");
            System.out.println("\tID: " + dependent.getId());
            System.out.println("\tName: " + dependent.getName());
            System.out.println("\tCard: " + dependent.getInsuranceCard().getCardNum());
            System.out.println("\tPolicyholder Name: " + dependent.getPolicyHolder().getName());
            // Haha
        }
    }
}