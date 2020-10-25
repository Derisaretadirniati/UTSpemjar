package listhargamobil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectDemo {
     public static String filename = "mobil.o";
     
     public static void main(String[] args) {
        // instansiasi object mobil
        Mobil m = new Mobil();
        // set nilai atribut mobil
        m.setKode("CV-R");
        m.setMerk("Honda");
        m.setNama("CRV Type R");
        m.setHarga(1200000000);
        System.err.println(m);
        try {
              simpanObject(m);
              Mobil n = bacaObject();
              System.out.println(n);
          } catch (IOException ex) {
              Logger.getLogger(ObjectDemo.class.getName()).log(Level.SEVERE,
              null, ex);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(ObjectDemo.class.getName()).log(Level.SEVERE,
              null, ex);
          }
      }
      public static void simpanObject(Mobil m) throws FileNotFoundException, IOException{
        FileOutputStream fout;
        fout = new FileOutputStream(filename);
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(m);
        System.out.println("Object berhasil disimpan.");
    }
       public static Mobil bacaObject() throws FileNotFoundException,IOException, ClassNotFoundException{
        ObjectInputStream ois;
        ois = new ObjectInputStream(new FileInputStream(filename));
        System.out.println("Object dibaca.");
        return (Mobil) ois.readObject();
    }
}
