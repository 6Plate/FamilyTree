package ProjectFT.Tree.FamilyTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree <E extends FamTreeItem<E>> implements Iterable<E> {
    public long membersId;
    private List<E> membersTree;

public FamilyTree(){
    membersTree = new ArrayList<>();
}

public long getMembersId() {
        return this.membersId;
    }

    public void setMembersId(long membersId) {
        this.membersId = membersId;
    }
    
    public void addHuman(E e){
    if(!membersTree.contains(e)){
        membersTree.add(e);
        e.setId(membersId++);
        addToParents(e);
        addToChild(e);
    }
}


public void addToParents(E e){
for (E parent:e.getParents())
parent.AddChild(e);
}
public void addToChild(E e){
for (E child:e.getChild())
child.AddParents(e);
}

public E getById(long id){
for (E e: membersTree){
if (e.getId() == id){
    return e;
}
}
return null;
}
public List<E> getByName(String name){
List<E> names = new ArrayList<>();
for(E n:membersTree){
if(n.getName().equals(name)){
names.add(n);
}
}
return names;
}

 public String getInfoTree(){
StringBuilder sb = new StringBuilder();
sb.append("Дерево:");
for (E e: membersTree){
sb.append("\n");
sb.append(e.getInfo());
}
return sb.toString();
}
 @Override
 public String toString() {
     return getInfoTree();
}

public void sortByAge(){
membersTree.sort(new ComporatorAge<E>());

}

public void sortByName(){
 membersTree.sort(new ComporatorName<E>());
}

@Override
public Iterator<E> iterator() {
    return new HumanIterator(membersTree);
}
}




