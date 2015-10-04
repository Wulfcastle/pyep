package speedingfineapp;

public class SpeedingFine {

    private String registrationNumber;
    private char laneCode;
    private char areaCode;
    private char roadCode;
    private int speed;

    public SpeedingFine(String regNumber, char laneCode, char areaCode, char roadCode, int speed) {
        this.registrationNumber = regNumber;
        this.laneCode = laneCode;
        this.areaCode = areaCode;
        this.roadCode = roadCode;
        this.speed = speed;
    }

    public int getSpeedLimit() {
        char[] laneCodes = {'D', 'S'};
        char[] areaCodes = {'U', 'P', 'R', 'O'};
        char[] roadCodes = {'N', '\u0000'}; //\u0000 is the null character as stated in the Java Language Specification
        // Checking laneCode :
        boolean laneCodeValid = false;
        for (char character : laneCodes) {
            if (laneCode == character) {
                laneCodeValid = true;
            }
        }
        // Checking areaCode :
        boolean areaCodeValid = false;
        for (char character : areaCodes) {
            if (areaCode == character) {
                areaCodeValid = true;
            }
        }
        int speedLimit = 0;
        if (areaCodeValid == true && laneCodeValid == true) {
            String code = new StringBuilder().append(laneCode).append(areaCode).append(roadCode).toString();
            if (code.contains("R") || code.substring(0,2).equals("SU")) {
                speedLimit = 60;
            } else if ((code.substring(0,2).equals("SP") && !"SPN".equals(code)) || code.contains("DU")) {
                speedLimit = 80;
            } else if ((code.substring(0,2).equals("SO") && !"SON".equals(code)) || code.contains("DO")) {
                speedLimit = 120;
            } else if (code.contains("DP") || code.equals("SON")) {
                speedLimit = 100;
            } else if (code.equals("SPN")) {
                speedLimit = 70;
            }
        } else {
            speedLimit = 1000;
        }
        return speedLimit;
    }
    
    public double getFine() {
       double fine = 0.00;
       if (this.isFinable() == true) {
           fine = 100;
           int difference = this.speed - this.getSpeedLimit();
           int factor = 0;
           while (factor < (difference/10)) {
               fine += factor * 200;
               factor++;
           }
       } else {
           fine = 0;
       }
       return fine;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public char getLaneCodes() {
        return laneCode;
    }

    public char getAreaCodes() {
        return areaCode;
    }

    public char getRoadCode() {
        return roadCode;
    }

    /**
     * The lane codes are: D = double lane, S = single lane
     *
     * The area codes are: U = urban, P = peri-urban, R = residential, O = open
     * or out-of-town,
     *
     * Road code (optional): N = narrow and winding, no clear views ahead
     *
     * Limits are: R = always 60, SU = 60, SP = 80, SO = 120, DU = always 80, DP
     * = always 100, DO = always 120, SON = 100, SPN = 70
     */




    public boolean isFinable() {
        boolean finable;
        if (speed - getSpeedLimit() < 10) {
            finable = false;
        } else {
            finable = true;
        }
        return finable;
    }


    public String toString() {
        String output = "";
        if (isFinable() == true) {
                output = String.format("%-25s%-10s%-15s%-15.2f\n", this.registrationNumber, this.areaCode, this.speed, this.getFine());
        } else {
            output = String.format("%-20s%40s%-30s\n", this.registrationNumber,"", "No Fine");
        }
        return output;
    }
}
