package speedingfineapp;

public class SpeedingFine {

    private String registrationNumber;
    private char laneCode;
    private char areaCode;
    private char roadCode;
    private int speed;

    public SpeedingFine(String registrationNumber, char laneCode,
            char areaCode, char roadCode, int speed) {
        this.registrationNumber = registrationNumber;
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
        switch (areaCode) {
            case 'R':
                return 60;
            case 'U': {
                if (laneCode == 'S') {
                    return 60;
                }
                if (laneCode == 'D') {
                    return 80;
                }
            }
            case 'P': {
                if (laneCode == 'S' && roadCode == 'N') {
                    return 70;
                }
                if (laneCode == 'S') {
                    return 80;
                }
                if (laneCode == 'D') {
                    return 100;
                }
            }
            case 'O': {
                if (laneCode == 'S' && roadCode == 'N') {
                    return 100;
                } // or one else
                if (laneCode == 'S') {
                    return 120;
                }
                if (laneCode == 'D') {
                    return 120;
                }
            }
        }
        return 1000;
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

    public double getFine() {
        if (!isFinable()) {
            return 0.0;
        }
        double fine = 100.0;
        int speedDifference = speed - getSpeedLimit();
        int factor = 0;
        while (factor < speedDifference / 10) {
            fine = fine + (factor * 200);
            factor++;
        }
        return fine;
    }

    public String toString() {
        if (isFinable()) {
            return String.format("%-20s%4s%12d%10.2f%n", registrationNumber, areaCode, getSpeed(), getFine());
        }
        return String.format("%-20s%27s%n", registrationNumber, "No fine");
    }
}
