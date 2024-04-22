package domain;

public class Artist extends Employee {

    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    public String[] getSkillsLSist() {
        return skiils;
    }
}
