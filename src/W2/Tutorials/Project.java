package W2.Tutorials;

public class Project {
    private String name;
    private double budget;
    private Lecturers leader;
    private Object[] members;
    private final int MAX_MEMBERS = 10;
    private int memberCount = 0;

    public Project() {
        this.name = "Default";
        this.budget = 0;
        members = new Object[MAX_MEMBERS];
    }
    public Project(String name, double budget) {
        this.name = name;
        this.budget = budget;
        members = new Object[MAX_MEMBERS];
    }

    /**
     * get the current leader of this project
     * @return the Lecturer who is the leader,
     * or null if there is no leader for this project
     */
    public Lecturers getLeader() {
        return leader;
    }

    /**
     * assign a new leader for this project
     * <p>
     * Assign the given Lecturer as the new leader for this project.
     * It's the job of the Lecturer class to ensure this assignment
     * is valid. This class just does the assignment
     * </p>
     * @param leader the new leader for this project
     */
    public void assignLeader(Lecturers leader) {
        this.leader = leader;
    }

    /**
     * add a new member to this project
     * <p>
     * Add a new member to this project. At this point, there
     * is no checking at all
     * </p>
     * @param newMember a Lecturer who want to join this project
     */
    public boolean addMember(Object newMember) {
        // Proceed only if there is space to add a new member
        if (!isNotFull()) {
            return false; // Project is full, cannot add more members
        }

        // Now the logic to add a member proceeds
        if (!(newMember instanceof PartTimeStudents)) {
            members[memberCount++] = newMember; // Increment memberCount after adding

            // Your existing logic to handle FullTimeStudents and Lecturers
            // Add project back to the researchers
            if (newMember instanceof FullTimeStudents) {
                ((FullTimeStudents) newMember).setProject(this);
            } else if (newMember instanceof Lecturers) {
                ((Lecturers) newMember).getJoinedProjects()[((Lecturers) newMember).getProjectCount()] = this;
                ((Lecturers) newMember).setProjectCount(((Lecturers) newMember).getProjectCount() + 1);
            }
            return true; // Member added successfully
        }

        // If newMember is a PartTimeStudent, this line is reached and false is returned.
        return false;
    }



    /**
     * display all members in this project (including leader and regular member)
     */
    public void displayMembers() {
        // display leader (if no leader, display "No leader")
        System.out.println("Leader: " + (leader == null ? "No leader" : leader));

        // display regular members
        for(int i = 0; i < memberCount; i++) {
            System.out.printf("Member #%d: " + members[i] + "\n", i + 1);
        }
    }

    public String getName() {
        return name;
    }

    public boolean isNotFull() {
        return memberCount < MAX_MEMBERS;
    }

    @Override
    public String toString() {
        // Assuming the Lecturers class has a meaningful toString method,
        // or you could simply use the leader's name if it's a string property.
        // If the leader can be null, handle it to avoid NullPointerException.
        return String.format("%s, Budget: %.2f", name, budget);
    }

}
