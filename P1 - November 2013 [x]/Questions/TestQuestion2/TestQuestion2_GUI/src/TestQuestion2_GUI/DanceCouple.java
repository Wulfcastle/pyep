package TestQuestion2_GUI;

// Type your examination number here...
public class DanceCouple {

    private String dance_p1;
    private String dance_p2;
    private char professional;

    /*
    
     A - Both dance partners are professional dancers.
     B - The first dance partner is a professional dancer.
     C - The second dance partner is a pressional dancer.
     D - Neither of the dance partners are professional dancers.
    
     */
    public DanceCouple(String partner1, String partner2, char type) {
        this.dance_p1 = partner1;
        this.dance_p2 = partner2;
        professional = type;
    }

    public int getWeighting() {
        int weighting = 0;
        switch (professional) {
            case 'A':
                weighting = 1;
                break;
            case 'B':
            case 'C':
                weighting = 2;
                break;
            case 'D':
                weighting = 3;
        }
        return weighting;
    }

    public double calculateScore(double[] judgeScores) {
        int weighting = this.getWeighting();
        judgeScores[0] = judgeScores[0] * weighting;
        judgeScores[2] = judgeScores[2] * weighting;
        double totalScore = 0.0;
        for (double score : judgeScores) {
            totalScore = totalScore + score;
        }
        return totalScore;
    }

    public String toString() {
        String output = "Dance Couple: " + dance_p1 + " & " + dance_p2 + "\n"
                + "Professional Dance Status: " + professional;
        return output;
    }

    public String getDancePartner1() {
        return dance_p1;
    }

    public String getDancePartner2() {
        return dance_p2;
    }

    public char getProfessional() {
        return professional;
    }

}
