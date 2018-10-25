/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_assignment_2;

import Business.Product;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author owner
 */
public class Homework_Assignment_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Product p = new Product();
        p.Create(p);
        p.Display(p);
        //p.Update(p);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to update the data? (yes/no)");
        String a = input.next();
        if (a.equals("yes")) {
            p.Update(p);
        } else if (a.equals("no")) {
            p.Display(p);
        } else {
            System.out.println("Enter a valid input (yes/no)" + a);
        }


    }
}
