public class OfficeWorker extends Employee {
    private String project;

    public OfficeWorker(String name, String surname, String gender, boolean active, String position, double payment, int experience, String department, String project) {
        super(name, surname, gender, active, position, payment, experience, department);
        this.project = project;
    }

    public void work() {
        System.out.println(getName() + " работает " + project + ".");
    }

    public void attendMeeting() {
        System.out.println(getName() + " участвует.");
    }

    public String getProject() { return project; }
    public void setProject(String project) { this.project = project; }
}
