public class Salary extends Worker {
    private double annualSalary;

    public Salary(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, annualSalary / 52 / 40);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        System.out.println("Worker: " + getFirstName() + " " + getLastName());
        System.out.println("Weekly Salary: $" + calculatePay(hoursWorked));
        System.out.println("-------------------------");
    }

    @Override
    public String toString() {
        return "Salary{" +
                "annualSalary=" + annualSalary +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + annualSalary;
    }

    @Override
    public String toXML() {
        return super.toXML() + "<annualSalary>" + annualSalary + "</annualSalary>\n";
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}", ", \"annualSalary\": " + annualSalary + "}");
    }
}
