package Placementlog.Core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import placementlog.Core.Types.Entry;

public class ApplicationLoader {
    public static ArrayList<Entry> load()
    {
        ArrayList<Entry> r1 = null;
        FileInputStream is = null;
        ObjectInputStream in = null;
        try{
            is = new FileInputStream("savefile");
            in = new ObjectInputStream(is);
            r1 = (ArrayList<Entry>) in.readObject();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return r1;
    } 
}
