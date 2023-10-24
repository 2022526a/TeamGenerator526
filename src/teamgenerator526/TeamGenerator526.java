/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamgenerator526;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 35389
 */
public class TeamGenerator526 {

    /**
     * @param args the command line arguments
     */
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
    }
    
    }
}
