public class KitchenWorker extends Employee {
    private String specialty;

    public KitchenWorker(String name, String surname, String gender, boolean active, String position, double payment, int experience, String department, String specialty) {
        super(name, surname, gender, active, position, payment, experience, department);
        this.specialty = specialty;
    }

    public void work() {
        System.out.println(getName() + " готовит.");
    }

    public void cook() {
        System.out.println(getName() + " готовит еду.");
    }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }
}
