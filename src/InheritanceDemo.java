import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Step 1: Create Workers
        Worker worker1 = new Worker("John", "Doe", "W123", "Mr.", 1985, 20.0);
        Worker worker2 = new Worker("Jane", "Smith", "W124", "Ms.", 1990, 22.5);
        Worker worker3 = new Worker("Bob", "Brown", "W125", "Mr.", 1987, 18.0);

        // Step 2: Create SalaryWorkers
        Salary salaryWorker1 = new Salary("Titus", "Augusta", "S100", "Dr.", 1982, 52000);
        Salary salaryWorker2 = new Salary("Marneus", "Calgar", "S101", "Mr.", 1975, 60000);
        Salary salaryWorker3 = new Salary("Emily", "Davis", "S102", "Mrs.", 1988, 48000);

        // Step 3: Add to ArrayList
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        // Step 4: Simulate Weekly Pay Periods
        int[] weeklyHours = {40, 50, 40}; // Array of hours for each week
        for (int week = 1; week <= 3; week++) {
            System.out.println("===== Week " + week + " =====");
            for (Worker worker : workers) {
                worker.displayWeeklyPay(weeklyHours[week - 1]);
            }
            System.out.println();
        }
    }
}
