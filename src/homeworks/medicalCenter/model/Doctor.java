package homeworks.medicalCenter.model;

import homeworks.medicalCenter.model.Person;

public class Doctor extends Person {

    private String profession;

    public Doctor(String id, String name, String surname, String email, String phoneNumber, String profession) {
        super(id, name, surname, email, phoneNumber);
        this.profession = profession;
    }

    public Doctor() {
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                ", profession='" + profession + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}