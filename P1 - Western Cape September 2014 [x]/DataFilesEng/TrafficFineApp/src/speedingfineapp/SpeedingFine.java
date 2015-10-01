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
    public int getSpeedLimit() {
        String limitCodes = Character.toString(laneCode) + Character.toString(areaCode) + Character.toString(roadCode) + "";
        int speedLimit = 1000;

        /*switch (limitCodes) {
         case "SU":
         speedLimit = 60;
         break;
         case "SP":
         speedLimit = 80;
         break;
         case "SO":
         speedLimit = 120;
         break;
         case "SON":
         speedLimit = 100;
         break;
         case "SPN":
         speedLimit = 70;
         break;
         }

         if (limitCodes.contains("R")) {
         return 60;
         } else if (limitCodes.contains("DP")) {
         return 100;
         } else if (limitCodes.contains("DO")) {
         return 120;
         }*/
        if ((laneCode != 'D') && laneCode != 'S') {
            return 1000;
        } else if (areaCode != 'U' && areaCode != 'P' && areaCode != 'R' && areaCode != 'O') {
            return 1000;
        }
        
        if (limitCodes.equals("SON")) {
            return 100;
        }
        if (limitCodes.equals("SPN")) {
            return 70;
        }
        if (limitCodes.contains("R")) {
            return 60;
        }
        if (limitCodes.contains("SP")) {
            return 80;
        }
        if (limitCodes.contains("SU")) {
            return 60;            
        }
        if (limitCodes.contains("SO")) {
            return 120;            
        }
        if (limitCodes.contains("DU")) {
            return 80;            
        }
        if (limitCodes.contains("DP")) {
            return 100;            
        }
        if (limitCodes.contains("DO")) {
            return 120;            
        }

        return speedLimit;
    }

    public double getFine() {
        int fine = 0;
        if (this.isFinable() == true) {
            fine = 100;
            double difference = this.speed - this.getSpeedLimit();
            int factor = 0;
            while (factor < (int)(difference / 10)) {
                fine += (factor * 200);
                factor++;
            }
        } else {
            fine = 0;
        }
        return fine;
    }

    public String toString() {
        String output = "";
        if (this.isFinable() == true) {
            output = String.format("%-25s%-10s%-10s%-15.2f", this.registrationNumber, this.areaCode, this.speed, this.getFine());

        } else {
            output = String.format("%-25s%25s", this.registrationNumber, "No fine");
        }
        return output;
    }

    public boolean isFinable() {
        boolean finable;
        if (speed - getSpeedLimit() < 10) {
            finable = false;
        } else {
            finable = true;
        }
        return finable;
    }

}
