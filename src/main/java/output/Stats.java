package output;

/**
 *
 * @author ecastaneda1
 * 
 * {
 *    "type":"baseball",
 *    "inning":"2b",
 *    "visitorScore":0,
 *    "homeScore":3
 * }
 * 
 * {
 *  "type":"football",
 *  "qtr":1,
 *  "time":"12:32",
 *  "visitorScore": 0,
 *  "homeScore": 0
 * } 
 * 
 */
public class Stats {
    private String type;
    private int visitorScore;
    private int homeScore;

    public Stats(String type, int visitorScore, int homeScore) {
        this.type = type;
        this.visitorScore = visitorScore;
        this.homeScore = homeScore;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param visitorScore the visitorScore to set
     */
    public void setVisitorScore(int visitorScore) {
        this.visitorScore = visitorScore;
    }

    /**
     * @param homeScore the homeScore to set
     */
    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }
    
    
    
}
