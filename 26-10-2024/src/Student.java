public class Student implements Comparable<Student> {

    private int id;
    private String name;

    Student(int id, String name){super(); this.id=id; this.name=name;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){return id + " " + name;}

    @Override
    public int compareTo(Student studentCompare) {
        return Integer.compare(this.id,studentCompare.id);
    }
}
