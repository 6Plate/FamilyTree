package ProjectFT.Tree.FamilyTree;

import java.util.Comparator;


public class ComporatorAge <T extends FamTreeItem> implements Comparator <T>{

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
    
}
