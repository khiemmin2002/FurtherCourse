package InsuranceDemo;

import java.util.ArrayList;
import java.util.List;

public class PolicyHolder extends Customer {
    private List<Dependent> dependents;

    public PolicyHolder(String id, String name, InsuranceCard insuranceCard) {
        super(id, name, insuranceCard);
        this.dependents = new ArrayList<>();
    }

    public void addDependent(Dependent dependent) {
        dependents.add(dependent);
    }

    public List<Dependent> getDependents() {
        return dependents;
    }
}