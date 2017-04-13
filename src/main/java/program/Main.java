package program;

import output.FootballStats;
import com.google.gson.Gson;
import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import output.BaseballStats;
import output.Stats;
import util.ResourceUtil;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        baseballParser("/xml/sport/baseball/LUBS1726_baseball.xml" );

        System.out.println("");
        
        footballParser("/xml/sport/football/libe_pre.xml");
        footballParser("/xml/sport/football/libe_1.xml");
        footballParser("/xml/sport/football/libe_2.xml");
        footballParser("/xml/sport/football/libe_3.xml");
        footballParser("/xml/sport/football/libe_4.xml");
        footballParser("/xml/sport/football/libe_5.xml");
    }

    private static String footballParser(String path) {
        int total_vscore = 0;
        int total_hscore = 0;
        System.out.println("Sport = Football :" + path);
        final String xmlStringFootball = ResourceUtil.getStringFromResource(path); 
        XML xml = new XMLDocument(xmlStringFootball);
        for (XML team : xml.nodes("//team")){
            String name = team.xpath("@name").get(0);
            String vh = team.xpath("@vh").get(0);
            ////System.out.println("Team "+vh+" = "+name); 
        }
        for (XML scores : xml.nodes("//scores")){
           
            for(XML score : scores.nodes("//score")){
                String hscore = score.xpath("@hscore").get(0);
                String vscore = score.xpath("@vscore").get(0);
                if(ResourceUtil.isNumeric(vscore)) 
                    //total_vscore = total_vscore + Integer.parseInt(vscore);
                    total_vscore = Integer.parseInt(vscore);
                if(ResourceUtil.isNumeric(vscore)) 
                    //total_hscore = total_hscore + Integer.parseInt(hscore);
                    total_hscore =  Integer.parseInt(hscore);
                ////System.out.println("hscore = "+hscore+" vscore = "+vscore);
            }
        }
        
        //TODO Determinate qtr
        String qtr;
        qtr=(xml.xpath("//plays//downtogo/@qtr").isEmpty())?"0":xml.xpath("//plays//downtogo/@qtr").get(0);
        String clock = (xml.xpath("//plays//downtogo/@clock").isEmpty())?"":xml.xpath("//plays//downtogo/@clock").get(0);
        
        Stats stats = new FootballStats("football",total_vscore,total_hscore,Integer.parseInt(qtr));
        Gson gson = new Gson();
        String json = gson.toJson(stats);
        System.out.println(json);
        return json;
    }

    private static String baseballParser(String path) {
        int total_vscore = 0;
        int total_hscore = 0;
        System.out.println("Sport = Baseball : "+path);
        final String xmlStringBaseball = ResourceUtil.getStringFromResource(path);
        XML xml = new XMLDocument(xmlStringBaseball);
        for (XML team : xml.nodes("//team")){
            String name = team.xpath("@name").get(0);
            String vh = team.xpath("@vh").get(0);
            ////System.out.println("Team "+vh+" = "+name);
            for(int i=0;i<9;i++){
                String id = team.xpath("//linescore//lineinn/@score").get(i);
                ////System.out.println((i+1)+" = "+id);
                if(ResourceUtil.isNumeric(id))
                    if(vh.toLowerCase().compareTo("v")==0) 
                        total_vscore = total_vscore + Integer.parseInt(id);
                    else
                        total_hscore = total_hscore + Integer.parseInt(id);
            }
        }
      
        //TODO Determinate  inning
        String inning = "?";
        
        Stats stats = new BaseballStats("baseball",total_vscore,total_hscore,inning);
        Gson gson = new Gson();
        String json = gson.toJson(stats);
        System.out.println(json);
        return json;
    }
}
