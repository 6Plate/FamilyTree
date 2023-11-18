package ProjectFT.Tree.FamilyTree;

import java.util.List;

import ProjectFT.Human.Human;

public interface FamTreeItem <E> extends Comparable <E> {
int getAge();
String getName();
void setId(Long id);
long getId();
String getInfo();
List <E> getParents();
void AddParents(E e);
void AddChild (E e);
List<E> getChild();
}