/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamgenerator526;

;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author 35389
 */
public class TeamGenerator526 {
    

    /**
     * @param args the command line arguments
     */
    
    
 public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<Team> teams = new ArrayList<>();
        Random random = new Random();
        List<String>teamNames = new ArrayList<>();
        teamNames.add("Team Dublin");teamNames.add("Team Dundalk");
        teamNames.add("Team LetterKenny");teamNames.add("Team Drogeda");
        teamNames.add("Team Galway");teamNames.add("Team Sligo");
        teamNames.add("Team Clonmel");teamNames.add("Team Swords");
        teamNames.add("Team Cork");teamNames.add("Team Carlow");
        teamNames.add("Team Wexford");teamNames.add("Team Bray");
        teamNames.add("Team Limerick");teamNames.add("Team Tralee");
        teamNames.add("Team Mulingar");teamNames.add("Team Navan");
        teamNames.add("Team Waterford");teamNames.add("Team Ennis");
        teamNames.add("Team Athlone");teamNames.add("Team Drogeda");

        // Read data from the CSV file and load it into memory
        try (BufferedReader reader = new BufferedReader(new FileReader("MOCK_DATA.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String firstName = parts[1];
                String lastName = parts[2];
                String email = parts[3];
                Person person = new Person(id, firstName, lastName, email);
                people.add(person);
            }
        } catch (IOException e) {
            System.err.println("Error reading the CSV file.");
            e.printStackTrace();
            System.exit(1);
        }

        // Shuffle the list of people
        Collections.shuffle(people);

        // Generate 20 teams with 5 members each
        for (int i = 0; i < 20; i++) {
            Team team = new Team("Team " + (i + 1) +"~"+ teamNames.get(i));
            for (int j = 0; j < 5; j++) {
                if (!people.isEmpty()) {
                    Person person = people.remove(0);
                    team.addMember(person);
                }
            }
            teams.add(team);
        }

        // Print each team and its members
        for (Team team : teams) {
            System.out.println("Team: " + team.name);
            for (Person member : team.members) {
                System.out.println("  - " + member.firstName + " " + member.lastName);
            }
            System.out.println();
        }
    }
}

