package homeworks.medicalCenter;

import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.storage.DoctorStorage;
import homeworks.medicalCenter.storage.PatientStorage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterMain {

    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addDoctorDate();
                    break;
                case "2":
                    searchProfession();
                    break;
                case "3":
                    deleteDoctor();
                    break;
                case "4":
                    changeDoctor();
                    break;
                case "5":
                    addPatient();
                    break;
                case "6":
                    printPatientwithDoctors();
                    break;
                case "7":
                    printPatient();
                    break;
                default:
                    System.out.println("Invalid command. Try again!");
            }
        }
    }


    private static void printPatient() {
        System.out.println("-------------------------------------------------------");
        patientStorage.print();
        System.out.println("-------------------------------------------------------");
    }

    private static void printPatientwithDoctors() {
        System.out.println("Patients and Their Doctors:");
        Patient[] patients = patientStorage.getPatients();
        for (Patient patient : patients) {
            Doctor doctor = doctorStorage.getByDoctorId(patient.getDoctor());
            if (doctor != null) {
                System.out.println("Patient ID: " + patient.getPatientId());
                System.out.println("Patient Name: " + patient.getName() + " " + patient.getSurName());
                System.out.println("Doctor: " + doctor.getName() + " " + doctor.getSurName());
                System.out.println("Doctor Profession: " + doctor.getProfession());
                System.out.println("------------------------------------");
            }
        }
    }

    private static void addPatient() throws ParseException {
        Doctor doctorFromStorage;
        System.out.println("Please input new patient ID");
        String patientId = scanner.nextLine();
        Patient patientFromStorage = patientStorage.getByPatientId(patientId);
        if (patientFromStorage != null) {
            System.out.println("Doctor with " + patientId + " already exists!");
            return;
        }
        System.out.println("Please input name");
        String patientname = scanner.nextLine();
        System.out.println("Please input surname");
        String patientSurname = scanner.nextLine();
        System.out.println("Please input email");
        String patientEmail = scanner.nextLine();
        System.out.println("Please input phone number.");
        String patientPhoneNumber = scanner.nextLine();
        System.out.println("Please choose your doctor ID.");
        doctorStorage.print();
        String chooseDoctorId = scanner.nextLine();
        doctorFromStorage = doctorStorage.getByDoctorId(chooseDoctorId);
        System.out.println("Please input your register date time.");
        String dateTime = scanner.nextLine();
        Date date = sdf.parse(dateTime);
        System.out.println(dateTime);
        Patient patient = new Patient(patientname, patientSurname, patientEmail, patientPhoneNumber, patientId, chooseDoctorId, dateTime, patientFromStorage);
        patientStorage.add(patient);
        System.out.println("Patient data is created.");
    }

    private static void changeDoctor() {
        System.out.println("Please input doctor id of the doctor you want to change:");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByDoctorId(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("Doctor with ID " + doctorId + " does not exist!");
        } else {
            System.out.println("Please input new name:");
            String doctorName = scanner.nextLine();
            System.out.println("Please input new surname:");
            String doctorSurname = scanner.nextLine();
            System.out.println("Please input new email:");
            String doctorEmail = scanner.nextLine();
            System.out.println("Please input new phone number:");
            String doctorPhoneNumber = scanner.nextLine();
            System.out.println("Please input new profession:");
            String doctorProfession = scanner.nextLine();
            doctorFromStorage.setName(doctorName);
            doctorFromStorage.setSurName(doctorSurname);
            doctorFromStorage.setEmail(doctorEmail);
            doctorFromStorage.setPhoneNumber(doctorPhoneNumber);
            doctorFromStorage.setProfession(doctorProfession);
            System.out.println("Doctor data is updated.");
        }
    }

    private static void deleteDoctor() {
        System.out.println("Please choose doctor ID.");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByDoctorId(doctorId);
        doctorStorage.deleteDoctorById(doctorId);
        System.out.println("Data deleted from database.");
    }

    static void searchProfession() {
        System.out.println("Please input doctor profession.");
        String doctorProfession = scanner.nextLine();
        Doctor byProfession = doctorStorage.getByProfession(doctorProfession);
        if (byProfession == null) {
            System.out.println("Doctor does not exist!");
        } else {
            System.out.println(byProfession);
        }
    }

    private static void addDoctorDate() {
        System.out.println("Please input doctor ID.");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByDoctorId(doctorId);
        if (doctorFromStorage != null) {
            System.out.println("Doctor with " + doctorId + " already exists!");
            return;
        }
        System.out.println("Please input doctor name");
        String name = scanner.nextLine();
        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        System.out.println("Please input email");
        String email = scanner.nextLine();
        System.out.println("Please input phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        Doctor doctor = new Doctor(name, surname, email, phoneNumber, doctorId, profession);
        doctorStorage.add(doctor);
        System.out.println("Doctor data is created.");
    }

    private static void printCommands() {
        System.out.println("Please input |-0-| for EXIT");
        System.out.println("Please input |-1-| for ADD_DOCTOR");
        System.out.println("Please input |-2-| for SEARCH_DOCTOR_BY_PROFESSION");
        System.out.println("Please input |-3-| for DELETE_DOCTOR_BY_ID");
        System.out.println("Please input |-4-| for CHANGE_DOCTOR_BY_ID");
        System.out.println("Please input |-5-| for ADD_PATIENT");
        System.out.println("Please input |-6-| for PRINT_ALL_PATIENTS_BY_DOCTOR");
        System.out.println("Please input |-7-| for PRINT_ALL_PATIENTS");
    }
}