package homeworks.medicalCenter;

import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.model.Person;
import homeworks.medicalCenter.util.DateUtil;

import java.util.Calendar;
import java.util.Date;

public class PersonStorage {

    private Person[] people = new Person[10];
    private int size;

    public void add(Person person) {
        if (people.length == size) {
            extend();
        }
        people[size++] = person;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Doctor) {
                System.out.println(person);
            }
        }
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person.getId().equals(id)
                    && person instanceof Doctor) {
                deleteByIndex(i);
            }
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person.getId().equals(id)
                    && person instanceof Doctor) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void printTodaysPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                Patient patient = (Patient) people[i];
                if (DateUtil.isSameDay(today, patient.getRegisterDateTime())) {
                    System.out.println(patient);
                }
            }
        }
    }

    public boolean isValidDate(Doctor doctor, Date appointmentDateTime) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient patient) {
                if (patient.getDoctor().getId().equals(doctor.getId())) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(appointmentDateTime);
                    calendar.add(Calendar.MINUTE, 29);
                    Date appointmentDatePlus30 = calendar.getTime();
                    if (appointmentDateTime.before(appointmentDatePlus30)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void deleteByIndex(int i) {
        for (int j = i; j < size; j++) {
            people[j] = people[j + 1];
        }
        size--;
    }

    private void extend() {
        Person[] tmp = new Person[people.length + 10];
        System.arraycopy(people, 0, tmp, 0, people.length);
        people = tmp;
    }
}