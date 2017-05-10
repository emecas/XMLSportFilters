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
public class FootballStats extends Stats {
    
    private int qtr;
    private String clock;
    private String hasball;
    

    public FootballStats(String type, int visitorScore, int homeScore,int qtr,String clock, String hasball) {
        super(type,visitorScore,homeScore);
        this.qtr=qtr;
        this.clock=clock;
        this.hasball=hasball;
        
    }
    
    
    /**
     * @param qtr the qtr to set
     */
    public void setQtr(int qtr) {
        this.qtr = qtr;
    }
    
    
    /**
     * @param clock the clock to set
     */
    public void setClock(String clock) {
        this.clock = clock;
    }
    
    /**
     * @param hasball the hasball to set
     */
    public void setHasball(String hasball) {
        this.clock = hasball;
    }
    
    
}
