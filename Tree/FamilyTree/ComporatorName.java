package Tree.FamilyTree;

import java.util.Comparator;

import ProjectFT.Human.Human;

public class ComporatorName <E extends FamTreeItem> implements Comparator<E> {

    @Override
    public int compare( E o1, E o2) {
       return o1.getName().compareTo(o2.getName());
    }

    }
    
