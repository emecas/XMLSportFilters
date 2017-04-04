package program;

import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import util.ResourceUtil;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        baseballParser("/xml/sport/baseball/LUBS1726_baseball.xml" );
        
        footballParser("/xml/sport/football/libe_pre.xml");
        footballParser("/xml/sport/football/libe_1.xml");
        footballParser("/xml/sport/football/libe_2.xml");
        footballParser("/xml/sport/football/libe_3.xml");
        footballParser("/xml/sport/football/libe_4.xml");
        footballParser("/xml/sport/football/libe_5.xml");
    }

    private static void footballParser(String path) {
        System.out.println("Sport = Football :" + path);
        final String xmlStringFootball = ResourceUtil.getStringFromResource(path); 
        XML xml = new XMLDocument(xmlStringFootball);
        for (XML team : xml.nodes("//team")){
            String name = team.xpath("@name").get(0);
            String vh = team.xpath("@vh").get(0);
            System.out.println("Team "+vh+" = "+name); 
        }
        for (XML scores : xml.nodes("//scores")){
           
            for(XML score : scores.nodes("//score")){
                String hscore = score.xpath("@hscore").get(0);
                String vscore = score.xpath("@vscore").get(0);
                System.out.println("hscore = "+hscore+" vscore = "+vscore);
            }
        }
        System.out.println("");
    }

    private static void baseballParser(String path) {
        System.out.println("Sport = Baseball : "+path);
        final String xmlStringBaseball = ResourceUtil.getStringFromResource(path);
        XML xml = new XMLDocument(xmlStringBaseball);
        for (XML team : xml.nodes("//team")){
            String name = team.xpath("@name").get(0);
            String vh = team.xpath("@vh").get(0);
            System.out.println("Team "+vh+" = "+name);
            for(int i=0;i<9;i++){
                String id = team.xpath("//linescore//lineinn/@score").get(i);
                System.out.println((i+1)+" = "+id);
            }
        }
        System.out.println("");
    }
}
