package Tree.FamilyTree;

import java.time.LocalDate;

import ProjectFT.Human.Gender;
import ProjectFT.Human.Human;

public class HumanBuilder {
    public Human build(String name, Gender gender, LocalDate bd, LocalDate dd, Human mother, Human father){
        Human human = new Human ( name, gender, bd, dd, mother, father);
        return human;
    }
}
