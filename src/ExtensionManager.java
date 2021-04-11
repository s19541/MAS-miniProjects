import Persons.Person;

import java.io.*;

public class ExtensionManager {
    private static final String extentFile = "mas-extent.bin";
    public static void loadExtensions(){
        try {
            DataInputStream in2 = new DataInputStream(new BufferedInputStream(new
                    FileInputStream(extentFile)));
            Person.readExtent(in2);
            in2.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void saveExtensions(){
        try{
            DataOutputStream out2 = new DataOutputStream(new BufferedOutputStream(new
                    FileOutputStream(extentFile)));
            Person.writeExtent(out2);
            out2.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
