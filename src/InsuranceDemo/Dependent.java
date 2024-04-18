package InsuranceDemo;

public class Dependent extends Customer {
    private PolicyHolder policyHolder;

    public Dependent(String id, String name, InsuranceCard insuranceCard, PolicyHolder policyHolder) {
        super(id, name, insuranceCard);
        this.policyHolder = policyHolder;
    }

    // Getters and Setters

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }
}