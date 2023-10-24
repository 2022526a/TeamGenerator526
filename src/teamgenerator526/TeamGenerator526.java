/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamgenerator526;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author 35389
 */
public class TeamGenerator526 {
    

    /**
     * @param args the command line arguments
     */
    List<Person> people = new ArrayList<>();
    List<Team> teams = new ArrayList<>();
    Random random = new Random ();
    List<String> teamNames = new ArrayList<>();
     
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //adding csv file and reading it into memory
        try (BufferedReader reader = new BufferedReader (new FileReader("MOCK_DATA.csv"))){
        String line;
        while ((line = reader.readLine())!=null){
            String [] parts=line.split(",");
            int id = Integer.parseInt(parts[0]);
            String firstName = parts[1];
            String lastName = parts[2];
            String email = parts[3];
            Person person =new Person (id , firstName, lastName , email);
        }
        }catch (IOException e){
            System.out.println("Error reading the CSV file.");
                e.printStackTrace();
                System.exit(1);
        }
    }
       // Generate 20 teams with 5 members each
        for (int i = 0; i < 20; i++) {
            Team team = new Team("Team " + (i + 1));
            for (int j = 0; j < 5; j++) {
                if (!people.isEmpty()) {
                    Person person = people.remove(0);
                    team.addMember(person);
                }
            }
            teams.add(team);
        }}


