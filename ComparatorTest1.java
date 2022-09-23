package ComparatorDemo;
import java.util.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age,marks;
    String name;
    Student (int age,String name,int marks)
    {
        this.age=age;
        this.name=name;
        this.marks=marks;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
}

public class ComparatorTest1 {
    public static void main(String args[])
    {
        List<Student> al=new ArrayList<>();
        al.add(new Student(20,"BHASKAR",86));
        al.add(new Student(14,"Deepu",90));
        al.add(new Student(16,"mourya",94));
        Comparator<Student> cm=Comparator.comparing(Student::getAge);
        Collections.sort(al,cm);
        System.out.println("sorting the elements by age");
        for(Student s:al)
        {
            System.out.println(s.getAge()+" "+s.getName()+"  "+s.getMarks());
        } Comparator<Student> cm1=Comparator.comparing(Student::getName);
        Collections.sort(al,cm1);
        System.out.println("sorting the elements by name");

        for(Student s:al)
        {
            System.out.println(s.getAge()+" "+s.getName()+"  "+s.getMarks());
        }

    }
}

