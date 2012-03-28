package placementlog.Core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import placementlog.Core.Types.Entry;

public class ApplicationSaver {
    public static void save(ArrayList<Entry> entries)
    {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos = new FileOutputStream("savefile");
            out = new ObjectOutputStream(fos);
            out.writeObject(entries);
            out.close();
            
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
