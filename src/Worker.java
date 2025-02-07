public class Worker extends Person {
    private double hourlyRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyRate = hourlyRate;
    }

    // method to calculate pay

    public double calculatePay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hourlyRate * hoursWorked;
        } else {
            double regularPay = hourlyRate * 40; // Regular pay for 40 hours
            double overtimeHours = hoursWorked - 40; // Extra hours beyond 40
            double overtimePay = overtimeHours * (hourlyRate * 1.5); // Overtime pay at 1.5x rate
            return regularPay + overtimePay;

        }
        return hourlyRate * hoursWorked;


        public void displayWeeklyPay ( double hoursWorked){
            double regularHours = Math.min(40, hoursWorked) * hourlyRate;
            double overtimeHours = Math.max(0, hoursWorked - 40) * hourlyRate * 1.5;
            double totalPay = regularHours + overtimeHours;
            System.out.println("Worker: " + getFirstName() + " " + getLastName());
            System.out.println("Regular Hours: " + hoursWorked + " @ $" + hourlyRate + "/hr = $" + (hoursWorked * hourlyRate));
            System.out.println("Overtime Hours: " + overtimeHours + " @ $" + (hourlyRate * 1.5) + "/hr = $" + (overtimeHours * hourlyRate * 1.5));
            System.out.println("Total Weekly Pay: $" + totalPay);
            System.out.println("-------------------------");

        }

    }
//override method
    @Override
    public String toString() {
        return "Worker{" +
                "hourlyRate=" + hourlyRate +
                '}';
    }

}
