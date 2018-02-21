
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
public class sale_writer {
    public static void main(String[] args){
       String file = "sale.dat";
       
       try{
           FileOutputStream fos = new FileOutputStream(new File(file));
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           
           sale s1 = new sale(1,"Partaub","Manish","Chamouny",1,"TV",40000);
           sale s2 = new sale(2,"Buldan","Kishan","St Hubert",4,"Mobile",38000);
           sale s3 = new sale(3,"Sookrah","Akash","Terre Rouge",5,"Washing Machine",10000);
           sale s4 = new sale(4,"Chuckun","Vidharsh","Roche Noire",8,"Oven",20000);
           
           oos.writeObject(s1);
           oos.writeObject(s2);
           oos.writeObject(s3);
           oos.writeObject(s4);
           
           
           
           oos.close();
           fos.close();
           
           System.out.println("Writing Data Done !!!");
       } 
        catch (FileNotFoundException ex){
           System.out.println(ex);
        } 
       catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
