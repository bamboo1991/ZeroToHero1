package HomeWorkAbstraction;

public class SDET extends ScrumTeam {
    String projectName;
    String teamName;
    int salary;

    public SDET(String teamName, String projectName) {
        super(teamName, projectName);
        this.teamName=teamName;
        this.projectName=projectName;
    }
    public SDET(String teamName, String projectName, int salary){
        this(teamName,projectName);
        this.teamName=teamName;
        this.projectName=projectName;
        this.salary=salary;
    }
    public Object  progress(){
        return super.teamName+" is working on the project "+ super.projectName;
    }
    public void work(){
        System.out.println(super.teamName+" is working ");
    }
    public Number sprintNumber(){
        System.out.println("current sprint number for "+super.teamName);
        return 3;
    }
}
