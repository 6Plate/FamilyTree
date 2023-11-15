package Tree.FamilyTree;

import java.util.Comparator;

import ProjectFT.Human.Human;

public class ComporatorAge <T extends FamTreeItem> implements Comparator <T>{

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
    
}
