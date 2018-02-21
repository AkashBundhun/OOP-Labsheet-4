
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author corei5
 */
public class writer_employee {
    public static void main(String[] args){
        String file = "employee.dat";
        
        try{
            FileOutputStream fos = new FileOutputStream(new File(file));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            employee emp1 = new employee("Partaub Manish","Chamouny","Male",12000);
            employee emp2 = new employee("Buldan Kishan","St Hubert","Male",13000);
            employee emp3 = new employee("Sookrah Akash","Terre Rouge","Male",14000);
            employee emp4 = new employee("Chuckun Vidharsh","Roche Noire","Male",15000);
            
            
            oos.writeObject(emp1);
            oos.writeObject(emp2);
            oos.writeObject(emp3);
            oos.writeObject(emp4);
            
            System.out.println("Writing Data Done !!!");
            
            oos.close();
            fos.close();
            
            
        } catch (FileNotFoundException ex) {
           System.out.println(ex);
        } catch (IOException ex) {
           System.out.println(ex);
        }
    }
}
