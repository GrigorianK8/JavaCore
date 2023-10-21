//package homeworks.medicalCenter.storage;
//
//import homeworks.medicalCenter.model.Doctor;
//import homeworks.medicalCenter.model.Patient;
//
//public class PatientStorage {
//
//    private Patient[] patients = new Patient[10];
//    private int size;
//
//    public void add(Patient patient) {
//        if (size == patients.length) {
//            extend();
//        }
//        patients[size++] = patient;
//    }
//
//    public void print() {
//        for (int i = 0; i < size; i++) {
//            System.out.println(patients[i].getSurName() + " " + patients[i].getSurName() + " || " + patients[i].getEmail() +
//                    " - " + patients[i].getPhoneNumber() + " - ID " + patients[i].getPatientId() + " || " + patients[i].getRegisterDateTime());
//        }
//    }
//
//    public Patient[] getPatients() {
//        Patient[] existingPatients = new Patient[size];
//        for (int i = 0; i < size; i++) {
//            existingPatients[i] = patients[i];
//        }
//        return existingPatients;
//    }
//
//    public Patient getByPatientId(String patientId) {
//        for (int i = 0; i < size; i++) {
//            if (patients[i].getPatientId().equals(patientId)) {
//                return patients[i];
//            }
//        }
//        return null;
//    }
//
//    private void extend() {
//        Patient[] tmp = new Patient[patients.length + 10];
//        System.arraycopy(patients, 0, tmp, 0, patients.length);
//        patients = tmp;
//    }
//  }