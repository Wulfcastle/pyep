
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCity {

    public static String degreeJobs[] = {"Doctor", "Programmer", "Architect", "Teacher", "Lawyer", "Engineer"};
    public static String diplomaJobs[] = {"Secretary", "Mechanic", "Electrician", "Beautician", "Nurse", "Plumber"};

    public static String jobCategory(String job) {
        String jobType = "Error";

        for (int i = 0; i < 6; i++) {
            if (degreeJobs[i].equals(job)) {
                jobType = "Degree";
            } else if (diplomaJobs[i].equals(job)) {
                jobType = "Diploma";
            }
        }

        return jobType;
    }

    public static int jobOpportunities = 0;

    public static City readTextFile() {
        jobOpportunities = 0;
        String content = "";
        try {
            Scanner textFileScanner = new Scanner(new FileReader("Jobs.txt")).useDelimiter(",\\s*");
            while (textFileScanner.hasNext()) {
                content = textFileScanner.next();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestCity.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] data = content.split("\r\n");
        String cityName = data[0];
        City city = new City(cityName);
        for (int i = 1; i < data.length; i = i + 2) {
            String jobName = data[i];
            double salary = Double.parseDouble(data[i + 1]);
            String category = jobCategory(jobName);
            switch (category) {
                case "Degree":
                    city.addDegJob(salary);
                    break;
                case "Diploma":
                    city.addDipJob(salary);
                    break;
            }
            jobOpportunities++;
        }
        return city;

    }

    public static void main(String args[]) throws Exception {
        City city = readTextFile();
        System.out.print(String.format("%d job opportunies processed from %s", jobOpportunities, city.getCityName()));
        BufferedReader inKb = new BufferedReader(new InputStreamReader(System.in));
        char ch = ' ';
        while (ch != 'Q') {

            System.out.println();
            System.out.println("             MENU");
            System.out.println(" ");
            System.out.println("         A - Option A");
            System.out.println("         B - Option B");
            System.out.println(" ");
            System.out.println("         Q - QUIT");
            System.out.println(" ");
            System.out.print("         Your Choice? ");

            ch = inKb.readLine().toUpperCase().charAt(0);

            switch (ch) {
                case 'A': {
                    System.out.print(city.toString());
                    break;
                }

                case 'B': {
                    System.out.print("Enter your qualification (Degree/Diploma) :");
                    String qualification = inKb.readLine();
                    System.out.print("Enter you minimum required salary : ");
                    double salary = Double.parseDouble(inKb.readLine());
                    if (city.isMatchCity(salary, qualification) == true) {
                        System.out.print(String.format("%s is a good place for you to look for a job.", city.getCityName()));
                    } else {
                        System.out.print(String.format("%s does not meet your minimum requirements.", city.getCityName()));
                    }
                    break;
                }

                case 'Q': {
                    System.exit(0);
                } // case

            } // switch

        } // while

    } // main

} // class
