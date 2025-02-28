public class GuardWorker extends Employee {
    private String shift;

    public GuardWorker(String name, String surname, String gender, boolean active, String position, double payment, int experience, String department, String shift) {
        super(name, surname, gender, active, position, payment, experience, department);
        this.shift = shift;
    }

    public void work() {
        System.out.println(getName() + " охраняет.");
    }

    public void patrol() {
        System.out.println(getName() + " патрулирует " + shift + " смену.");
    }

    public String getShift() { return shift; }
    public void setShift(String shift) { this.shift = shift; }
}
