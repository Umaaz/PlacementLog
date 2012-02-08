package placementlog.Core.Types;

import java.security.InvalidParameterException;
import java.util.Comparator;

public class EntryComparatorDate implements Comparator {

    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Entry))
            throw new InvalidParameterException();
        if(!(o2 instanceof Entry))
            throw new InvalidParameterException();
        Entry e1 = (Entry)o1;
        Entry e2 = (Entry)o2;
        
        return e1.getDate().compareTo(e2.getDate());
    }
    
}
