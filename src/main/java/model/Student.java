package model;

public abstract class Student {

    protected String name;
    protected int ID;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract String getName();

    public void setName(String name) {

    }

    public abstract int getID();

    public void setID(int ID) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student students = (Student) o;

        if (ID != students.ID) return false;
        return name != null ? name.equals(students.name) : students.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + ID;
        return result;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
