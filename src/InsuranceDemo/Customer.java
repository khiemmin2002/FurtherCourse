package InsuranceDemo;

public abstract class Customer {
    private String id;
    private String name;
    private InsuranceCard insuranceCard;

    public Customer(String id, String name, InsuranceCard insuranceCard) {
        this.id = id;
        this.name = name;
        this.insuranceCard = insuranceCard;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public InsuranceCard getInsuranceCard() {
        return insuranceCard;
    }
}
