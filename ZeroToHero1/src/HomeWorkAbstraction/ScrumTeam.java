package HomeWorkAbstraction;

public abstract class ScrumTeam {
    String teamName;
    String projectName;
    public ScrumTeam(String teamName, String projectName){
        this.teamName=teamName;
        this.projectName=projectName;
    }
    public Object progress(){

        return "team "+ teamName+ " working on "+projectName+ " project";
    }
    protected void work(){
    }
    public Number sprintNumber(){
        return null;
    }
}
