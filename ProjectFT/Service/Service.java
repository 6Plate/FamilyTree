package ProjectFT.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ProjectFT.Human.Gender;
import ProjectFT.Human.Human;
import ProjectFT.Tree.FamilyTree.FamilyTree;
import ProjectFT.Tree.FamilyTree.HumanBuilder;

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
    public void addItem2 (String name, Gender gender, LocalDate bd){
        Human human = builder.build(name, gender, bd);
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

public void addToParents(Human h){
for (Human parent:e.getParents())
parent.AddChild(e);
}
public void addToChild(Human e){
for (Human child:e.getChild())
child.AddParents(e);
}

public Human getById(long id){
for (Human e: membersTree){
if (e.getId() == id){
    return e;
}
}
return null;
}
public List<Human> getByName(String name){
List<Human> names = new ArrayList<>();
for(Human n:membersTree){
if(n.getName().equals(name)){
names.add(n);
}
}
return names;
}

@Override
public String toString() {
    return getHumanInfo();
}
}
