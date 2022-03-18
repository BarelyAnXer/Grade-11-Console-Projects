import java.util.*;
import java.io.*;

public class HospitalMangementSystem {
    static ArrayList<String> acc = new ArrayList<String>(Arrays.asList("admin", "clerk", "cashier"));
    static ArrayList<String> pass = new ArrayList<String>(Arrays.asList("admin", "clerk", "cashier"));
    static ArrayList<String> pat = new ArrayList<String>();
    static ArrayList<Double> bill = new ArrayList<Double>(Arrays.asList(0.0));
    static ArrayList<String> doc = new ArrayList<String>();
    static BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        pat.add("pat-01");
        pat.add("zye");
        pat.add("in");
        pat.add("M");
        pat.add("9/28/2004");
        pat.add("09361374885");
        pat.add("Calumpit Bulacan");
        pat.add("Dr Samaniego"); // i test if nag eexist yung doctor  sa array list ng doc
        pat.add("Cancer");
        pat.add("Chemoteraphy");
        pat.add("room-01");

        doc.add("doc-01");
        doc.add("dr Rizal");
        doc.add("09367318845");
        doc.add("Malolos Bulacan");
        login();

    }

    public static void login() throws IOException {
        String username;
        String password;
        int pos1;
        int pos2;

        //do{
        System.out.println("Login");
        do {
            System.out.print("Enter Username: ");
            username = input1.readLine();
            if (username.length() == 0) {
                System.out.println("Input is Required");
            }
        } while (username.length() == 0);

        do {
            System.out.print("Enter Password: ");
            password = input1.readLine();
            if (password.length() == 0) {
                System.out.println("Input is Required");
            }
        } while (password.length() == 0);

        pos1 = acc.indexOf(username);
        pos2 = pass.indexOf(password);
        if (acc.contains(username) && pass.contains(password)) {
            if (pos1 == pos2) {
                if (pos1 == 0) {
                    adminMenu();
                } else if (pos1 == 1) {
                    clerkMenu();
                } else if (pos1 == 2) {
                    cashierMenu();
                }
            } else {
                System.out.println("Access Denied");
                login();
            }
        } else {
            System.out.println("Access Denied");
            login();
        }

        //  }while();


    }

    public static void changePassword() throws IOException {
        String current;
        String newpass;
        String secnewpass;
        int pos;
        do {
            System.out.print("Current : ");
            current = input1.readLine();
            if (current.length() == 0) {
                System.out.println("Input is Required");
                changePassword();
            }
            if (!pass.contains(current)) {
                System.out.println("Password Does not Match");
                changePassword();
            }
        } while (current.length() == 0);

        pos = pass.indexOf(current);
        do {
            System.out.print("New : ");
            newpass = input1.readLine();
            if (newpass.length() == 0) {
                System.out.println("Input is Required");

            }

            if (newpass.length() <= 4) {
                System.out.println("Password is too Short");
            }

        } while (newpass.length() <= 4 || newpass.length() == 0);

        do {
            System.out.print("Re-Type New : ");
            secnewpass = input1.readLine();
            if (secnewpass.length() <= 4) {
                System.out.println("Password is too Short");
            }
        } while (secnewpass.length() <= 4);
        if (newpass.equals(secnewpass)) {
            pass.set(pos, newpass);
            System.out.println("Password has been Changed");
        } else {
            System.out.println("Password Does not Match");
            changePassword();
        }


        login();
    }


    public static void adminMenu() throws IOException {
        String choice;
        do {
            System.out.println("Admin Menu\n");
            System.out.println("[1]Patients");
            System.out.println("[2]Docotors");
            System.out.println("[3]Change Password");
            System.out.println("[4]Logout");
            System.out.println("[0]Exit");

            do {
                System.out.print("Select: ");
                choice = input1.readLine();
                if (choice.length() == 0) {
                    System.out.println("Input is Required");
                }
            } while (choice.length() == 0);


            if (choice.equals("1")) {
                patient();
            } else if (choice.equals("2")) {
                doctor();
            } else if (choice.equals("3")) {
                changePassword();
            } else if (choice.equals("4")) {
                login();
            } else if (choice.equals("0")) {
                System.exit(0);
            } else {
                adminMenu();
            }

        } while (choice.matches("(.*)1(.*)2(.*)3"));
    }

    public static void patient() throws IOException {
        String choice;
        do {
            System.out.println("\nPatients Menu");
            System.out.println("\n[1] Add Patient");
            System.out.println("[2] Edit Patient");
            System.out.println("[3] Delete Patient");
            System.out.println("[4] Display Patient");
            System.out.println("[5] Display In and Out Patients");
            System.out.println("[6] Back");
            System.out.println("[0] Exit");
            do {
                System.out.print("Select: ");
                choice = input1.readLine();
                if (choice.length() == 0) {
                    System.out.println("Input is Required");
                }
            } while (choice.length() == 0);


            if (choice.equals("1")) {
                addPatient();
            } else if (choice.equals("2")) {
                editPatient();
            } else if (choice.equals("3")) {
                deletePatient();
            } else if (choice.equals("4")) {
                displayAllPatient();
            } else if (choice.equals("5")) {
                displayInAndOut();
            } else if (choice.equals("6")) {
                adminMenu();
            } else if (choice.equals("0")) {
                System.exit(0);
            }
        } while (!choice.equals("0"));
    }

    public static void doctor() throws IOException {
        String choice;
        do {
            System.out.println("\nPatients Menu");
            System.out.println("\n[1] Add Doctor");
            System.out.println("[2] Edit Doctor");
            System.out.println("[3] Delete Doctor");
            System.out.println("[4] Display Doctor");
            System.out.println("[5] Back");
            System.out.println("[0] Exit");
            do {
                System.out.print("Select: ");
                choice = input1.readLine();
                if (choice.length() == 0) {
                    System.out.println("Input is Required");
                }
            } while (choice.length() == 0);

            if (choice.equals("1")) {
                addDoctor();
            } else if (choice.equals("2")) {
                editDoctor();
            } else if (choice.equals("3")) {
                deleteDoctor();
            } else if (choice.equals("4")) {
                displayAllDoctor();
            } else if (choice.equals("5")) {
                adminMenu();
            } else if (choice.equals("0")) {
                System.exit(0);
            }
        } while (!choice.equals("0"));
    }

    public static void clerkMenu() throws IOException {
        String choice;

        do {
            System.out.println("Clerk Menu\n");
            System.out.println("[1]Search Patient");
            System.out.println("[2]Change Password");
            System.out.println("[3]Logout");
            System.out.println("[0]Exit");
            System.out.print("Select: ");
            choice = input1.readLine();
            if (choice.equals("1")) {
                searchPatient();
            } else if (choice.equals("2")) {
                changePassword();
            } else if (choice.equals("3")) {
                login();
            } else if (choice.equals("0")) {
                System.exit(0);
            } else {
                adminMenu();
            }
        } while (!choice.equals("0"));

    }

    public static void cashierMenu() throws IOException {
        String choice;
        do {
            System.out.println("Cashier Menu\n");
            System.out.println("[1]Add Bill");
            System.out.println("[2]Add Payment");
            System.out.println("[3]Change Password");
            System.out.println("[4]Logout");
            System.out.println("[0]Exit");
            System.out.print("Select: ");
            choice = input1.readLine();
            if (choice.equals("1")) {
                addBill();
            } else if (choice.equals("2")) {
                addPayment();
            } else if (choice.equals("3")) {
                changePassword();
            } else if (choice.equals("4")) {
                login();
            } else if (choice.equals("0")) {
                System.exit(0);
            } else {

            }
        } while (!choice.equals("0"));

    }

    public static void addPatient() throws IOException {
        String id;
        String name;
        String type;
        String gender;
        String date;
        String mobile;
        String address;
        String doctor;
        String disease;
        String medication;
        String room;

        System.out.print("ID: ");
        id = input1.readLine();
        if (pat.contains(id)) {
            System.out.println("Id Already Exist");
            addPatient();
        }


        System.out.print("Name: ");
        name = input1.readLine();
        System.out.print("Type: ");
        type = input1.readLine();
        System.out.print("Gender: ");
        gender = input1.readLine();
        System.out.print("Date: ");
        date = input1.readLine();
        System.out.print("Mobile#: ");
        mobile = input1.readLine();
        System.out.print("Address: ");
        address = input1.readLine();
        System.out.print("Doctor: ");
        doctor = input1.readLine();
        System.out.print("Disease: ");
        disease = input1.readLine();
        System.out.print("Medication: ");
        medication = input1.readLine();


        pat.add(id);
        pat.add(name);
        pat.add(type);
        pat.add(gender);
        pat.add(date);
        pat.add(mobile);
        pat.add(address);
        pat.add(doctor);
        pat.add(disease);
        pat.add(medication);
        if (type.equals("in")) {
            System.out.print("Room: ");
            room = input1.readLine();
            pat.add(room);
        } else {
            pat.add("out patient");
        }

        bill.add(0.0);


        System.out.println("Patient Saved");
    }

    public static void deletePatient() throws IOException {
        System.out.print("Enter Id of the Patient you want to Delete:  ");
        String c5 = input1.readLine();
        int pos1 = pat.indexOf(c5);
        int pos2 = pos1 + 11;
        if (pat.contains(c5)) {
            for (int initial = pos1; initial < pos2; initial++) {
                pat.remove(pos1);
            }
            System.out.println("Patient Deleted");
        } else {
            System.out.println("Patient does not Exist");
        }
    }

    public static void displayAllPatient() throws IOException {
        System.out.println("ID\t\t\t NAME\t\t\t TYPE\t\t\t GENDER\t\t\t DATE\t\t\t MOBILE#\t\t\t ADDRESS \t\t\tDOCTOR\t\t\tDISEASE\t\t\tMEDICATION \t\t\t ROOM");
        for (int i = 0; i < pat.size(); i++) {
            for (int j = 0; j < pat.size(); j += 11) {
                if (i == j) {
                    System.out.println("");
                    break;
                }
            }
            System.out.print(pat.get(i) + "\t\t\t");
        }
    }

    public static void editPatient() throws IOException {
        String id;
        String name;
        String type;
        String gender;
        String date;
        String mobile;
        String address;
        String doctor;
        String disease;
        String medication;
        String room;


        System.out.print("Enter Id of the Patient you want to Edit:  ");
        String c3 = input1.readLine();
        int pos1 = pat.indexOf(c3);
        int pos2 = pos1 + 1;
        int pos3 = pos1 + 2;
        int pos4 = pos1 + 3;
        int pos5 = pos1 + 4;
        int pos6 = pos1 + 5;
        int pos7 = pos1 + 6;
        int pos8 = pos1 + 7;
        int pos9 = pos1 + 8;
        int pos10 = pos1 + 9;
        int pos11 = pos1 + 10;
        for (int initial = pos1; initial < pat.size(); initial++) {
            if (pat.contains(c3)) {
                System.out.print("Name: ");
                name = input1.readLine();
                System.out.print("Type: ");
                type = input1.readLine();
                System.out.print("Gender: ");
                gender = input1.readLine();
                System.out.print("Date: ");
                date = input1.readLine();
                System.out.print("Mobile#: ");
                mobile = input1.readLine();
                System.out.print("Address: ");
                address = input1.readLine();
                System.out.print("Doctor: ");
                doctor = input1.readLine();
                System.out.print("Disease: ");
                disease = input1.readLine();
                System.out.print("Medication: ");
                medication = input1.readLine();
                System.out.print("Room: ");
                room = input1.readLine();


                pat.set(pos2, name);
                pat.set(pos3, type);
                pat.set(pos4, gender);
                pat.set(pos5, date);
                pat.set(pos6, mobile);
                pat.set(pos7, address);
                pat.set(pos8, doctor);
                pat.set(pos9, disease);
                pat.set(pos10, medication);
                pat.set(pos11, room);
                break;
            }
        }
    }

    public static void searchPatient() throws IOException {
        System.out.print("Enter the Id of the Patient you Want to Find: ");
        String ch = input1.readLine();
        int pos1 = pat.indexOf(ch);
        int pos2 = pos1 + 1;
        int pos3 = pos1 + 2;
        int pos4 = pos1 + 3;
        int pos5 = pos1 + 4;
        int pos6 = pos1 + 5;
        int pos7 = pos1 + 6;
        int pos8 = pos1 + 7;
        int pos9 = pos1 + 8;
        int pos10 = pos1 + 9;
        int pos11 = pos1 + 10;
        String tempchoice = ch;
        if (pat.contains(ch)) {
            System.out.println("Id: " + pat.get(pos1));
            System.out.println("Name: " + pat.get(pos2));
            System.out.println("Type: " + pat.get(pos3));
            System.out.println("Gender: " + pat.get(pos4));
            System.out.println("Date: " + pat.get(pos5));
            System.out.println("Mobile: " + pat.get(pos6));
            System.out.println("Address: " + pat.get(pos7));
            System.out.println("Doctor: " + pat.get(pos8));
            System.out.println("Diesease: " + pat.get(pos9));
            System.out.println("Medication: " + pat.get(pos10));
            System.out.println("Room: " + pat.get(pos11));

            if (tempchoice.equals("pat-01")) {
                pos1 = pat.indexOf(tempchoice);
            } else {
                pos1 = pat.indexOf(tempchoice);
                pos1 = pos1 - change(10, pat.indexOf(tempchoice));
            }

            System.out.println("Total Bill: " + bill.get(pos1));


        } else {
            System.out.println("Patient Not Found");
            clerkMenu();
        }
    }

    public static void addBill() throws IOException {
        String choice;
        double temp;
        String tempchoice;

        int pos1;


        System.out.print("Enter the Id of the Patient: ");
        tempchoice = input1.readLine();
        if (pat.contains(tempchoice)) {
            System.out.println("Choose Bill to Add");
            System.out.println("[1]Pre-Natal Service	75.00");
            System.out.println("[2]General Consulation	75.00");
            System.out.println("[3]Follow-up Check-up	75.00");
            System.out.println("[4]Immunization			50.00");
            System.out.println("[5]Tuli					450.00");
            System.out.println("[6]Non-Stress Test		200.00");
            System.out.println("[7]Electocardiography	300.00");
            System.out.println("[8]Papsmear				300.00");
            System.out.println("[9]Back");
            System.out.println("[0]Exit");
            System.out.print("Select: ");
            choice = input1.readLine();
            if (choice.equals("1")) {
                if (tempchoice.equals("pat-01")) {
                    pos1 = pat.indexOf(tempchoice);
                    temp = bill.get(pos1) + 75.0;
                    bill.set(0, temp);
                } else {
                    pos1 = pat.indexOf(tempchoice);
                    pos1 = pos1 - change(10, pat.indexOf(tempchoice));
                    temp = bill.get(pos1) + 75.0;
                    bill.set(pos1, temp);
                }
            } else if (choice.equals("2")) {
                if (tempchoice.equals("pat-01")) {
                    pos1 = pat.indexOf(tempchoice);
                    temp = bill.get(pos1) + 75.0;
                    bill.set(0, temp);
                } else {
                    pos1 = pat.indexOf(tempchoice);
                    pos1 = pos1 - change(10, pat.indexOf(tempchoice));
                    temp = bill.get(pos1) + 75.0;
                    bill.set(pos1, temp);
                }
            } else if (choice.equals("3")) {
                if (tempchoice.equals("pat-01")) {
                    pos1 = pat.indexOf(tempchoice);
                    temp = bill.get(pos1) + 75.0;
                    bill.set(0, temp);
                } else {
                    pos1 = pat.indexOf(tempchoice);
                    pos1 = pos1 - change(10, pat.indexOf(tempchoice));
                    temp = bill.get(pos1) + 75.0;
                    bill.set(pos1, temp);
                }
            } else if (choice.equals("4")) {
                if (tempchoice.equals("pat-01")) {
                    pos1 = pat.indexOf(tempchoice);
                    temp = bill.get(pos1) + 50.0;
                    bill.set(0, temp);
                } else {
                    pos1 = pat.indexOf(tempchoice);
                    pos1 = pos1 - change(10, pat.indexOf(tempchoice));
                    temp = bill.get(pos1) + 50.0;
                    bill.set(pos1, temp);
                }
            } else if (choice.equals("5")) {
                if (tempchoice.equals("pat-01")) {
                    pos1 = pat.indexOf(tempchoice);
                    temp = bill.get(pos1) + 450.0;
                    bill.set(0, temp);
                } else {
                    pos1 = pat.indexOf(tempchoice);
                    pos1 = pos1 - change(10, pat.indexOf(tempchoice));
                    temp = bill.get(pos1) + 450.0;
                    bill.set(pos1, temp);
                }
            } else if (choice.equals("6")) {
                if (tempchoice.equals("pat-01")) {
                    pos1 = pat.indexOf(tempchoice);
                    temp = bill.get(pos1) + 200.0;
                    bill.set(0, temp);
                } else {
                    pos1 = pat.indexOf(tempchoice);
                    pos1 = pos1 - change(10, pat.indexOf(tempchoice));
                    temp = bill.get(pos1) + 200.0;
                    bill.set(pos1, temp);
                }
            } else if (choice.equals("7")) {
                if (tempchoice.equals("pat-01")) {
                    pos1 = pat.indexOf(tempchoice);
                    temp = bill.get(pos1) + 300.0;
                    bill.set(0, temp);
                } else {
                    pos1 = pat.indexOf(tempchoice);
                    pos1 = pos1 - change(10, pat.indexOf(tempchoice));
                    temp = bill.get(pos1) + 300.0;
                    bill.set(pos1, temp);
                }
            } else if (choice.equals("8")) {
                if (tempchoice.equals("pat-01")) {
                    pos1 = pat.indexOf(tempchoice);
                    temp = bill.get(pos1) + 300.0;
                    bill.set(0, temp);
                } else {
                    pos1 = pat.indexOf(tempchoice);
                    pos1 = pos1 - change(10, pat.indexOf(tempchoice));
                    temp = bill.get(pos1) + 300.0;
                    bill.set(pos1, temp);
                }
            } else if (choice.equals("9")) {
                addBill();
            } else if (choice.equals("0")) {
                System.exit(0);
            } else {
                System.out.println("Invalid Input");
            }

        } else {
            System.out.println("Patient does not Exist");
        }


        if (tempchoice.equals("pat-01")) {
            pos1 = pat.indexOf(tempchoice);
        } else {
            pos1 = pat.indexOf(tempchoice);
            pos1 = pos1 - change(10, pat.indexOf(tempchoice));
        }

        System.out.println("Total Bill: " + bill.get(pos1));

    }

    public static void addPayment() throws IOException {
        String tempchoice;
        double temp;
        double payment;
        int pos1;

        System.out.print("Enter the Id of the Patient: ");
        tempchoice = input1.readLine();
        if (pat.contains(tempchoice)) {
            System.out.print("Enter Payment: ");
            payment = Double.valueOf(input1.readLine());

            if (tempchoice.equals("pat-01")) {
                pos1 = pat.indexOf(tempchoice);
                temp = bill.get(pos1) - payment;
                bill.set(0, temp);
            } else {
                pos1 = pat.indexOf(tempchoice);
                pos1 = pos1 - change(10, pat.indexOf(tempchoice));
                temp = bill.get(pos1) - payment;
                bill.set(pos1, temp);
            }
        } else {
            System.out.println("Patient does not Exist");
        }


        if (tempchoice.equals("pat-01")) {
            pos1 = pat.indexOf(tempchoice);
        } else {
            pos1 = pat.indexOf(tempchoice);
            pos1 = pos1 - change(10, pat.indexOf(tempchoice));
        }
        if (bill.get(pos1) < 0) {
            System.out.println("Change: " + Math.abs(bill.get(pos1)));
        } else {
            System.out.println("Payment has been Added");
            System.out.println("Bill : " + bill.get(pos1));
        }


    }

    public static void displayInAndOut() throws IOException {
        ArrayList<String> in = new ArrayList<String>();
        ArrayList<String> out = new ArrayList<String>();
        String temp;
        for (int i = 0; i < pat.size(); i++) {
            temp = pat.get(i);
            if (temp.equals("in")) {
                in.add("Id : " + pat.get(i - 2));
                in.add("Name : " + pat.get(i - 1));
            } else if (temp.equals("out")) {
                out.add("Id : " + pat.get(i - 2));
                out.add("Name : " + pat.get(i - 1));
            }
        }
        System.out.println("In Patients\n");
        for (int i = 0; i < in.size(); i++) {
            System.out.println(in.get(i));
        }
        System.out.println("");
        System.out.println("Out Patients\n");
        for (int i = 0; i < out.size(); i++) {
            System.out.println(out.get(i));
        }
    }


    public static int change(int a, int b) {
        b = b % 10;
        a = b * 10;
        return a;
    }

    public static void addDoctor() throws IOException {
        String id;
        String name;
        String mobile;
        String address;


        System.out.print("ID: ");
        id = input1.readLine();
        if (doc.contains(id)) {
            System.out.println("Id Already Exist");
            addDoctor();
        }


        System.out.print("Name: ");
        name = input1.readLine();
        System.out.print("Mobile#: ");
        mobile = input1.readLine();
        System.out.print("Address: ");
        address = input1.readLine();


        doc.add(id);
        doc.add(name);
        doc.add(mobile);
        doc.add(address);

        System.out.println("Doctor Saved");
    }

    public static void deleteDoctor() throws IOException {
        System.out.print("Enter Id of the Doctor you want to Delete:  ");
        String c5 = input1.readLine();
        int pos1 = doc.indexOf(c5);
        int pos2 = pos1 + 4;
        if (doc.contains(c5)) {
            for (int initial = pos1; initial < pos2; initial++) {
                doc.remove(pos1);
            }
            System.out.println("Docotr Deleted");
        } else {
            System.out.println("Doctor does not Exist");
        }
    }

    public static void displayAllDoctor() throws IOException {
        System.out.println("ID\t\t\t NAME\t\t\t MOBILE#\t\t\t ADDRESS");
        for (int i = 0; i < doc.size(); i++) {
            for (int j = 0; j < doc.size(); j += 4) {
                if (i == j) {
                    System.out.println("");
                    break;
                }
            }
            System.out.print(doc.get(i) + "\t\t\t");
        }
    }

    public static void editDoctor() throws IOException {
        String name;
        String type;
        String mobile;
        String address;

        System.out.print("Enter Id of the Doctor you want to Edit:  ");
        String c3 = input1.readLine();
        int pos1 = pat.indexOf(c3);
        int pos2 = pos1 + 2;
        int pos3 = pos1 + 3;
        int pos4 = pos1 + 4;

        for (int initial = pos1; initial < doc.size(); initial++) {
            if (doc.contains(c3)) {
                System.out.print("Name: ");
                name = input1.readLine();
                System.out.print("Mobile#: ");
                mobile = input1.readLine();
                System.out.print("Address: ");
                address = input1.readLine();


                doc.set(pos2, name);
                doc.set(pos3, mobile);
                doc.set(pos4, address);

                break;
            }
        }
    }

}







