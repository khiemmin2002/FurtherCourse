package W1.Tutorials.Ex4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Research {
    private String name;
    private ArrayList<Lecturer> memberList;
    private Lecturer leader;
    private long budget;

    public Research() {
        this.name = "Default";
        this.memberList = new ArrayList<Lecturer>();
        this.leader = null;
        this.budget = 0;
    }

    public Research(String name, ArrayList<Lecturer> memberList, long budget) {
        this.name = name;
        this.memberList = memberList;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Lecturer> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Lecturer> memberList) {
        this.memberList = memberList;
    }

    public Lecturer getLeader() {
        return leader;
    }

    public void setLeader(Lecturer leader) {
        this.leader = leader;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public void addMember(Lecturer lecturer) {
        if (!memberList.contains(lecturer)) { // Check if lecturer is already a member
            memberList.add(lecturer);
        }
    }

    void displayMembers() {
        // Print the research project name
        System.out.println(getName());

        // Print the leader's name, handling the case where the leader might be null
        System.out.println("Leader: " + (getLeader() != null ? getLeader().getName() : "None"));

        // Print the names of the members, handling the case where there might be no members
        String membersNames = getMemberList().isEmpty() ? "None" : getMemberList().stream()
                .map(Lecturer::getName)
                .collect(Collectors.joining(", "));
        System.out.println("Members: " + membersNames);
        System.out.println();
    }

    @Override
    public String toString() {
        // Leader's name
        String leaderName = leader != null ? leader.getName() : "None";

        // Member names
        String memberNames = memberList.isEmpty() ? "None" : memberList.stream()
                .map(Lecturer::getName)
                .collect(Collectors.joining(", "));

        return String.format("Research%nName: %s%nMembers list: %s%nLeader: %s%nBudget: %d",
                name, memberNames, leaderName, budget);
    }

}
