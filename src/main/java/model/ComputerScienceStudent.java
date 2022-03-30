package model;

public class ComputerScienceStudent extends Student implements Citizen {

    protected String programmingLanguage;
    protected String address;
    protected String idCardNumber;

    public ComputerScienceStudent(String name, int ID, String programmingLanguage, String address, String idCardNumber) {
        super(name, ID);
        this.programmingLanguage = programmingLanguage;
        this.address = address;
        this.idCardNumber = idCardNumber;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public int getID() {
        return super.ID;
    }

    @Override
    public String getAdress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getIdentityCardNumber() {
        return idCardNumber;
    }
    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ComputerScienceStudent that = (ComputerScienceStudent) o;

        return programmingLanguage != null ? programmingLanguage.equals(that.programmingLanguage) : that.programmingLanguage == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (programmingLanguage != null ? programmingLanguage.hashCode() : 0);
        return result;
    }



}
