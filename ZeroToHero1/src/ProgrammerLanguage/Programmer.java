package ProgrammerLanguage;

import java.util.ArrayList;
import java.util.List;

class Programmer {
    List <String> languages = new ArrayList<>();


    //Method which will return languages
    public List getLanguages(){
        return languages;
    }

    // Method will add language.
            public void addLanguage(String language){
        languages.add(language);
        }
}

