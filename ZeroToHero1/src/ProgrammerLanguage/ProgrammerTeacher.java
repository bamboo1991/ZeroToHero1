package ProgrammerLanguage;

import java.util.ArrayList;
import java.util.List;

class ProgrammerTeacher  extends Programmer {
    List<String> teacher = new ArrayList<>();

    public boolean teach(Programmer programmer, String language) {
        if (!programmer.getLanguages().contains(language)&& teacher.contains(language)){
            programmer.addLanguage(language);
            return true;
        }

        return false;
    }
    public List getLanguages () {
        return teacher;
    }
    public void addLanguage(String language){
        teacher.add(language);
    }

}






