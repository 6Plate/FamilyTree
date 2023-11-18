package ProjectFT.Human;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import ProjectFT.Tree.FamilyTree.FamTreeItem;

public class Human implements Serializable, Comparable<Human>, FamTreeItem <Human> {
    private long id;
   private String name;
   private Gender gender;
   private LocalDate bd;
   private LocalDate dd;
   private Human mother;
   private Human father;
   private List <Human> child;
    // private Human mother;

    public Human ( String name, Gender gender, LocalDate bd, LocalDate dd, Human mother, Human father) {
    id = -1;
    this.name = name;
    this.gender = gender;
    this.bd = bd;
    this.dd = dd;
    this.mother = mother;
    this.father = father;
    child = new ArrayList<>();
    }
    public Human (String name, Gender gender, LocalDate bd){
    this(name, gender, bd, null, null, null);
    }
    public Human ( String name, Gender gender, LocalDate bd,Human mother, Human father){
        this(name, gender, bd, null, mother, father);
    }
public long getId(){
    return this.id;
}
public void setId(Long id){
    this.id = id;
}

    public void AddChild( Human human) {
    if (!child.contains(human)){
        child.add(human);
    }
    }
    public List<Human> getChild() {
        return this.child;
    }
    public void AddParents(Human parent ){
        if(parent.getGender().equals(Gender.Female)){
            parent.setMother(parent);
        }
        else if(parent.getGender().equals(Gender.Male)){
            parent.setFather(parent);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBd() {
        return this.bd;
    }

    public void setBd(LocalDate bd) {
        this.bd = bd;
    }

    public LocalDate getDd() {
        return this.dd;
    }

    public void setDd(LocalDate dd) {
        this.dd = dd;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return getInfo();
    }

    public Human getMother() {
        return this.mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

     public Human getFather() {
        return this.father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

public int getAge(){
    if(dd == null){
        return getPeriod(bd, LocalDate.now());
    }
    else {
        return getPeriod(bd, dd);
    }
}
private int getPeriod(LocalDate bd, LocalDate dd){
Period diff = Period.between(bd, dd);
return diff.getYears();
}
public String getChildInfo(){
StringBuilder res = new StringBuilder();
if (!child.isEmpty()){
    for (int i = 0; i < child.size(); i++){
        res.append(",");
        res.append(child.get(i).getName());
    }
}
else {
    res.append("дети отсутсвуют");
}
return res.toString();
}
public String getInfo(){
    StringBuilder sb = new StringBuilder();
    sb.append("id: ");
    sb.append(id);
    sb.append("name: ");
    sb.append(name);
    sb.append("Gender: ");
    sb.append(getGender());
    sb.append("Bb: ");
    sb.append(getBd());
    sb.append("DD: ");
    sb.append(getDd());
    sb.append("Mother and Father: ");
    sb.append(getParents());
    sb.append("Child: ");
    sb.append(getChildInfo());
    return sb.toString();
}

public List <Human> getParents(){
    List <Human> parents = new ArrayList<>();
    if (father != null){
        parents.add(father);
    }
    if (mother!= null){
        parents.add(mother);
    }
    return parents;
}

public String getParentsInfo(){
StringBuilder res = new StringBuilder();
if (!getParents().isEmpty()){
    for (int i = 0; i < getParents().size(); i++){
        res.append(",");
        res.append(getParents().get(i).getName());
    }
}
else {
    res.append("родители отсутсвуют");
}
return res.toString();
}

@Override
public boolean equals(Object obj) {
    if (this == obj ){
        return true;
    }
    if (!(obj instanceof Human)){
        return false;
    }
    Human human = (Human) obj;
    return human.getId() == getId();
}

@Override
public int compareTo(Human o) {
    return this.name.compareTo(o.name);
}
}
