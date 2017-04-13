/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package output;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ecastaneda1
 */
public class Output {
    private String name;
    private int age;
    private String position;
    private BigDecimal salary;
    private List<String> skills;
    private Map <String,Object> map;
    

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    /**
     * @param skills the skills to set
     */
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    /**
     * @return the map
     */
    public Map <String,Object> getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(Map <String,Object> map) {
        this.map = map;
    }

    
  
}
