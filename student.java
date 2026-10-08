//return in an object
class student {
    String name;
    int marks;
}
class stufactory{
    student createstu () {
        student s = new student();
        s.name="xyz";
        s.marks=95;
        return s;
    }
    public class main {
        public static void main(String[] args) {
             stufactory f1 = new stufactory();
             student s1 = f1.createstu();
             System.out.println("name:"+ s1.name);
             System.out.println("marks:"+s1.marks);
        }
    }
}
