package ProjectFT.Tree.FamilyTree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ProjectFT.Human.Gender;
import ProjectFT.Human.Human;

public class HumanBuilder {
    public Human build(String name, Gender gender, LocalDate bd, LocalDate dd, Human mother, Human father){
        Human human = new Human ( name, gender, bd, dd, mother, father);
        return human;
    }
    public Human build (String name, Gender gender, LocalDate bd){
    Human human = new Human(name, gender, bd);
    return human;
}
}
