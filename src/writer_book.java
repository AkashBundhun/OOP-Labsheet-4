
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author corei5
 */
public class writer_book {
    public static void main(String[] args){
    String file = "book.dat";
        
        try{
            FileOutputStream fos = new FileOutputStream(new File(file));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            book bk1 = new book("One Piece, Vol. 1: Romance Dawn","Eiichiro Oda",1997,"123456",230);
            book bk2 = new book("One Piece, Volume 2: Buggy The Clown","Eiichiro Oda",1997,"123457",300);
            book bk3 = new book("One Piece, Vol. 3: Don't Get Fooled Again","Eiichiro Oda",1998,"123458",350);
            book bk4 = new book("One Piece 4","Eiichiro Oda",1998,"123459",500);
            
            
            
            oos.writeObject(bk1);
            oos.writeObject(bk2);
            oos.writeObject(bk3);
            oos.writeObject(bk4);
            
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
