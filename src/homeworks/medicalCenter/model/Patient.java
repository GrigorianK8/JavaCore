package homeworks.medicalCenter.model;

public class Patient extends Person {

    private String patientId;
    private String doctor;
    private String registerDateTime;

    public Patient(String name, String surName, String email, String phoneNumber, String patientId, String doctor, String registerDateTime, Patient patientFromStorage) {
        super(name, surName, email, phoneNumber);
        this.patientId = patientId;
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Patient() {
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", doctor='" + doctor + '\'' +
                ", registerDateTime='" + registerDateTime + '\'' +
                '}';
    }
}