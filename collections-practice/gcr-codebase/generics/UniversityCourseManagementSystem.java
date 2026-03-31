import java.util.*;
abstract class CourseType{
    String name;
    int id;

    CourseType(String name, int id){
        this.name = name;
        this.id = id;
    }

    abstract void displayAll();
}

class ExamCourse extends CourseType{

    ExamCourse(String name, int id){
        super(name, id);
    }
    
    @Override
    void displayAll(){
        System.out.println("ExamCourse name is-> "+ name +" and id is :-> "+ id);
    }
}

class AssignmentCourse extends CourseType{

    AssignmentCourse(String name, int id){
        super(name, id);
    }

    @Override
    void displayAll(){
        System.out.println("AssignmentCourse name is-> "+ name +" and id is :-> "+ id);
    }
}

class ResearchCourse extends CourseType{

    ResearchCourse(String name, int id){
        super(name, id);
    }

    @Override
    void displayAll(){
        System.out.println("ResearchCourse name is-> "+ name +" and id is :-> "+ id);
    }
}

class Course<T extends CourseType>{
    List<T> items = new ArrayList<>();

    void addItems(T item){
        items.add(item);
    }

    T getItems(int index){
        return items.get(index);
    }
    List<T> getAllItem(){
        return items;
    }
}

class University{
    static void displayAllItems(List<? extends CourseType> list){
        for(CourseType item:list){
            item.displayAll();
        }
    }
}

public class UniversityCourseManagementSystem {
    public static void main(String[] args) {
        
        Course<ExamCourse> exam = new Course<>();
        exam.addItems(new ExamCourse("java", 01));

        Course<AssignmentCourse> assign = new Course<>();
        assign.addItems(new AssignmentCourse("oops", 05));

        Course<ResearchCourse> research = new Course<>();
        research.addItems(new ResearchCourse("generics", 10));
        System.out.println();
        System.out.println("ExamCourse Details are:------");
        University.displayAllItems(exam.getAllItem());

        System.out.println("AssignMent Details are: ------");
        University.displayAllItems(assign.getAllItem());

        System.out.println("ResearchCourse Details are: ------");
        University.displayAllItems(research.getAllItem());
    }
}
