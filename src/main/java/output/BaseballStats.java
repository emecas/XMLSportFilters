/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package output;

import output.Stats;

/**
 *
 * @author ecastaneda1
 */
public class BaseballStats extends Stats {
    
    private String inning;
    private int outs;
    
    public BaseballStats(String type, int visitorScore, int homeScore,String inning,int outs) {
        super(type,visitorScore,homeScore);
        this.inning=inning;
        this.outs=outs;
    }
  
    
    /**
     * @param inning the inning to set
     */
    public void setInning(String inning) {
        this.inning = inning;
    }

    public void setOuts(int outs) {
        this.outs = outs;
    }
}
