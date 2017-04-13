package program;

import com.google.gson.Gson;
import java.awt.Color;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import output.Output;

public class GSONExample {

    public static void main(String[] args) {

        Output staff = createDummyObject();

        //1. Convert object to JSON string
        Gson gson = new Gson();
        String json = gson.toJson(staff);
        System.out.println(json);

        //2. Convert object to JSON string and save into a file directly
        try (FileWriter writer = new FileWriter("staff.json")) {

            gson.toJson(staff, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Output createDummyObject() {

        Output staff = new Output();

        staff.setName("mkyong");
        staff.setAge(35);
        staff.setPosition("Founder");
        staff.setSalary(new BigDecimal("10000"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("python");
        skills.add("shell");

        staff.setSkills(skills);

        HashMap hm = new HashMap();
        hm.put("languajes", skills);
        hm.put("age", 35);
        hm.put("color",Color.BLUE);
        
        staff.setMap(hm);
        
        return staff;

    }

}
