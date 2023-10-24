/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamgenerator526;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 35389
 */
public class Team {
    String name;

    public String getName() {
        return name;
    }

    public List<Person> getMembers() {
        return members;
    }
    
     
    List<Person> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addMember(Person person) {
        members.add(person);
    }}

    
    
    

