package replit.Custom;

public class UAGStudent {

    public String name, studentID;
    public int grade;
    static String principalName = "Ms. McKoy";
    static int nextID = 100;

    public UAGStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
        studentID = name.substring(0,1).toUpperCase() + nextID;
        nextID++;
    }

    public void newPrincipal(String newPrincipalName){
        principalName = newPrincipalName;
    }

    public static void resetID(){
        nextID = 100;
    }

    public String toString(){
        return name + " " + studentID;
    }
}

class Student {

    public static void main(String[] args) {

        UAGStudent student1 = new UAGStudent("Ayse", 15);
        UAGStudent student2 = new UAGStudent("Nil", 20);
        UAGStudent student3 = new UAGStudent("Ersan", 11);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        UAGStudent.resetID();

        UAGStudent student4 = new UAGStudent("John", 9);
        System.out.println(student4);
    }
}
