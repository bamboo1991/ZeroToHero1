package HomeWorkAbstraction;

public class ScrumMaster extends ScrumTeam {
    String teamName;
    String projectName;
    int salary;
    public ScrumMaster(String teamName, String projectName) {
        super(teamName, projectName);
        this.teamName=teamName;
        this.projectName=projectName;

    }
   public ScrumMaster(String teamName, String projectName, int salary) {
   this(teamName, projectName);
   this.teamName=teamName;
   this.projectName=projectName;
   this.salary=salary;
    }
    public Object progress(){
        return super.teamName+" is working on the project "+ super.projectName;
    }
    public void work(){
        System.out.println(super.teamName+" is working ");
    }
    public Number sprintNumber(){
        System.out.println("current sprint number for "+super.teamName);
        return 2;
    }
}
