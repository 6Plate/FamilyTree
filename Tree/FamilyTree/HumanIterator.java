package Tree.FamilyTree;
import java.util.Iterator;
import java.util.List;

import ProjectFT.Human.Human;

public class  HumanIterator <E extends FamTreeItem> implements Iterator<E> {
private int index;
private List<E> tree;
    
public HumanIterator (List<E> tree){
        this.tree = tree;
    }

@Override
public boolean hasNext() {
    
    return index < tree.size();
    }
@Override
public E next() {
        return tree.get(index++);
    }
    
}
