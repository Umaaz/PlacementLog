package placementlog.Core.Types;

import java.security.InvalidParameterException;
import java.util.Date;

public class Entry {
    private String subject;
    private Date date;
    private String entry;

    public Entry(String subject, Date date, String entry) {
        this.subject = subject;
        this.date = date;
        this.entry = entry;
    }
       
    public Entry(){
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Entry(subject, date, entry);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Entry))
            throw new InvalidParameterException();
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Subject: " + this.subject + "Date: " + this.date + "Entry: " + this.entry;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.subject != null ? this.subject.hashCode() : 0);
        hash = 37 * hash + (this.date != null ? this.date.hashCode() : 0);
        hash = 37 * hash + (this.entry != null ? this.entry.hashCode() : 0);
        return hash;
    }
}
