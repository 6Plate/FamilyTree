package Service;

import java.time.LocalDate;

import ProjectFT.Human.Gender;
import ProjectFT.Human.Human;
import Tree.FamilyTree.FamilyTree;
import Tree.FamilyTree.HumanBuilder;

public class Service {
    private FamilyTree <Human> tree;
    private HumanBuilder builder;
     
    public Service(){
        tree = new FamilyTree<>();
        builder = new HumanBuilder();
    }
    public void addItem(String name, Gender gender, LocalDate bd, LocalDate dd, Human mother, Human father ) {
        Human human = builder.build (name, gender, bd, dd, mother, father);
        tree.addHuman(human);
    }

    public String getHumanInfo(){
    StringBuilder sb = new StringBuilder();
    sb.append("Дерево:");
    for (Human human: tree){
    sb.append("\n");
    sb.append(human);
        }
    return sb.toString();
    }
   
public void sortByAge(){ tree.sortByAge(); }

public void sortByName(){tree.sortByName();} 

@Override
public String toString() {
    return getHumanInfo();
}
}
