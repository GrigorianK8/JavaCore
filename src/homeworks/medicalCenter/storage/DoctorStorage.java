package homeworks.medicalCenter.storage;

import homeworks.medicalCenter.model.Doctor;

public class DoctorStorage {

    private Doctor[] doctors = new Doctor[10];
    private int size;

    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

    public Doctor getByProfession(String doctorProfession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(doctorProfession)) {
                return doctors[i];
            }
        }
        return null;
    }

    public Doctor getByDoctorId(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getDoctorId().equals(doctorId)) {
                return doctors[i];
            }
        }
        return null;
    }

    public void deleteDoctorById(String doctorId) {
        int indexById = getIndexByDoctorId(doctorId);
        for (int i = indexById + 1; i < size - 1; i++) {
            doctors[i] = doctors[i + 1];
        }
        doctors[size - 1] = null;
        size--;
    }

    private int getIndexByDoctorId(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getDoctorId().equals(doctorId)) {
                return i;
            }
        }
        return -1;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }
}