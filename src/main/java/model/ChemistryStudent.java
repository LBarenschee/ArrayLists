package model;

public class ChemistryStudent extends Student implements Citizen {

    protected String favouriteTask;

    public ChemistryStudent(String name, int ID, String favouriteTask) {
        super(name, ID);
        this.favouriteTask = favouriteTask;
    }

    @Override
    public String toString() {
        return "ChemistryStudent{" +
                "favouriteTask='" + favouriteTask + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getID() {
        return 0;
    }

    public String getFavouriteTask() {
        return favouriteTask;
    }

    public void setFavouriteTask(String favouriteTask) {
        this.favouriteTask = favouriteTask;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ChemistryStudent that = (ChemistryStudent) o;

        return favouriteTask != null ? favouriteTask.equals(that.favouriteTask) : that.favouriteTask == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (favouriteTask != null ? favouriteTask.hashCode() : 0);
        return result;
    }

    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public String getIdentityCardNumber() {
        return null;
    }
}
