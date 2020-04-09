package week11fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        File in_file = new File("files", "employees1.txt");

        try{
            Scanner in = new Scanner(in_file);

            while (in.hasNextLine()){
                String surname = in.nextLine();
                String first_name = in.nextLine();
                int age = Integer.parseInt(in.nextLine());
                Employee emp = new Employee(surname, first_name, age);
                System.out.println(emp.toString());
            }

        } catch (FileNotFoundException fnf){
            System.out.println("File not found exception" + fnf.getMessage());
        }
    }
}
