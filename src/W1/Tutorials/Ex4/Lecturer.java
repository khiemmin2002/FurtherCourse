package W1.Tutorials.Ex4;

import java.util.ArrayList;

public class Lecturer {
    private String id;
    private String name;
    private String rank;
    private Research leadProject;
    private ArrayList<Research> joinedProject;

    public Lecturer() {
        this.id = "Default";
        this.name = "Default name";
        this.rank = "Default rank";
        // leadProject is null by default
        this.joinedProject = new ArrayList<>();
    }

    public Lecturer(String id, String name, String rank, ArrayList<Research> joinedProject) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.joinedProject = joinedProject;
        // leadProject is null by default
    }

    public String getName() {
        return name;
    }

    public boolean leadProject(Research project) {
        if (this.leadProject == null) {
            this.leadProject = project;
            project.setLeader(this); // Set this lecturer as the leader of the project
            return true;
        } else {
            System.out.println(name + " is already leading a project.");
            return false;
        }
    }

    void joinProject(Research project) {
        if (!joinedProject.contains(project)) { // Check if project is already joined
            joinedProject.add(project);
            project.addMember(this); // Add this lecturer to the project's member list
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nRank: " + rank + "\nLead Project: " + leadProject + "\nJoined Project: " + joinedProject + "\n";
    }
}
