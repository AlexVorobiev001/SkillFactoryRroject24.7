public class MainClass {
    public static void main(String[] args) {
        Student Ivan = new Student("Ivan", "Univer", 4, 5 );
        University Univer = new University("First", "Ставропольский Машиностроительный Университет", "SMU", 1947, StudyProfile.PHYSICS);
        System.out.println(Ivan.toString());
        System.out.println(Univer.toString());
    }
}
