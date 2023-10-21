package homeworks.medicalCenter;

import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterMain implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctorDate();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    printTodaysPatients();
                    break;
                default:
                    System.out.println("Invalid command. Try again!");
            }
        }
    }


    private static void printTodaysPatients() {
        System.out.println("-------------------------------------------------------");
        personStorage.printTodaysPatients();
        System.out.println("-------------------------------------------------------");
    }

    private static void printAllPatientsByDoctor() {
        System.out.println("Please choose doctor ID.");
        personStorage.printDoctors();
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("Doctor with " + doctorId + " does not exist");
        }
    }

    private static void addPatient() throws ParseException {
        System.out.println("Please choose doctor id.");
        personStorage.printDoctors();
        String doctorId = scanner.next();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorId != null) {
            System.out.println("Please input id, Name, Surname, Email, Phone number, Doctor, Register date time(dd-MM-yyyy HH:mm)");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date appointmentDateTime = DateUtil.stringToDate(patientData[5]);
                if (personStorage.isValidDate(doctorById, appointmentDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setsurname(patientData[2]);
                    patient.setEmail(patientData[3]);
                    patient.setPhoneNumber(patientData[4]);
                    patient.setDoctor(doctorById);
                    patient.setAppointmentDateTime(appointmentDateTime);
                    personStorage.add(patient);
                    System.out.println("Patient registered!");
                } else {
                    System.out.println("Doctor is invalid.");
                }
            } catch (ParseException e) {
                System.out.println("incorrect date time format. Please try again.");
            }
        }
    }


    private static void changeDoctorById() {
        System.out.println("Please choose doctor ID.");
        personStorage.printDoctors();
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input Name, Surname, Email, Phone number, Profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            if (doctorById == null) {
                doctorById.setName(doctorData[0]);
                doctorById.setsurname(doctorData[1]);
                doctorById.setEmail(doctorData[2]);
                doctorById.setPhoneNumber(doctorData[3]);
                doctorById.setProfession(doctorData[4]);
                System.out.println("Doctor data is changed.");
            } else {
                System.out.println("Doctor with " + doctorId + " does not exist");
            }
        }
    }

    private static void deleteDoctorById() {
        System.out.println("Please choose doctor ID.");
        personStorage.printDoctors();
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
            System.out.println("Data deleted from database.");
        } else {
            System.out.println("Doctor with " + doctorId + " does not exist");
        }
    }

    static void searchDoctorByProfession() {
        System.out.println("Please input doctor profession.");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctorDate() {
        System.out.println("Please input doctor ID, Name, Surname, Email, Phone number, Profession");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(doctorData[1]);
            doctor.setsurname(doctorData[2]);
            doctor.setEmail(doctorData[3]);
            doctor.setPhoneNumber(doctorData[4]);
            doctor.setProfession(doctorData[5]);
            personStorage.add(doctor);
            System.out.println("Doctor data is created.");
        } else {
            System.out.println("Doctor with " + doctorId + " already exist");
        }
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_DOCTOR + " for ADD_DOCTOR");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH_DOCTOR_BY_PROFESSION");
        System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for DELETE_DOCTOR_BY_ID");
        System.out.println("Please input " + CHANGE_DOCTOR_BY_ID + " for CHANGE_DOCTOR_BY_ID");
        System.out.println("Please input " + ADD_PATIENT + " for ADD_PATIENT");
        System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for PRINT_ALL_PATIENTS_BY_DOCTOR");
        System.out.println("Please input " + PRINT_TODAYS_PATIENTS + " for PRINT_ALL_PATIENTS");
    }
}