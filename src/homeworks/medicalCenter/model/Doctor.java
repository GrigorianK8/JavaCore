package homeworks.medicalCenter.model;

import homeworks.medicalCenter.model.Person;

public class Doctor extends Person {

    private String doctorId;
    private String profession;

    public Doctor(String name, String surName, String email, String phoneNumber, String doctorId, String profession) {
        super(name, surName, email, phoneNumber);
        this.doctorId = doctorId;
        this.profession = profession;
    }

    public Doctor() {
    }


    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
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
                "doctorId='" + doctorId + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}