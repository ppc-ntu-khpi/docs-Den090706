package domain;
public class Editor extends Artist {

    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    public boolean getPreferences() {
        return electronicEditing;
    }

    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
