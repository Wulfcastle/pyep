
public class City {

    private String cityName;
    private int diplomaJobs;
    private int degreeJobs;
    private double salaryTotal;

    public City() {

    }

    public City(String name) {
        this.cityName = name;
        this.diplomaJobs = 0;
        this.degreeJobs = 0;
        this.salaryTotal = 0.00;
    }

    public String getCityName() {
        return this.cityName;
    }

    public boolean isMatchCity(double salary, String jobCategory) {
        boolean equalsCategory = false;
        switch (jobCategory) {
            case "Diploma":
                if (diplomaJobs > degreeJobs) {
                    equalsCategory = true;
                }
                break;
            case "Degree":
                if (degreeJobs > diplomaJobs) {
                    equalsCategory = true;
                }
                break;
        }
        if ((averageSalary() >= salary) && (equalsCategory == true)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return String.format("City: %s\n"
                + "Diploma Jobs: %d\n"
                + "Degree Jobs: %d\n"
                + "Average Salary: R%.2f", cityName, diplomaJobs, degreeJobs, averageSalary());
    }

    public void addDipJob(double salary) {
        diplomaJobs++;
        salaryTotal += salary;
    }

    public void addDegJob(double salary) {
        degreeJobs++;
        salaryTotal += salary;
    }

    public double averageSalary() {
        double salary = Math.round(salaryTotal / (degreeJobs + diplomaJobs) * 100) / 100.0;
        return salary;
    }

}
