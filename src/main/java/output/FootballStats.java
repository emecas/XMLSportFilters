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
    

    public FootballStats(String type, int visitorScore, int homeScore,int qtr) {
        super(type,visitorScore,homeScore);
        this.qtr=qtr;
    }
    
    
    /**
     * @param qtr the qtr to set
     */
    public void setQtr(int qtr) {
        this.qtr = qtr;
    }
}
