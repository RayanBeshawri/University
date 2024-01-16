/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ds;

import java.util.*;

/**
 *
 * @author rayan
 */
public class DS {

    static Node head;
//-----------------------------------------------------------------------------

    static boolean CheckRecord(int id) {
        Node current = head;
        while (current != null) {
            if (current.ID == id) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
//------------------------------------------------------------------------------

    static void AddEmployee(String NameofEmployee, int ID, String Firstdayofwork,
            String Phonenumberoftheemployee, String Addressoftheemployee,
            int Workhours, double Salary) {
        Node append = new Node();
        append.NameofEmployee = NameofEmployee;
        append.ID = ID;
        append.Firstdayofwork = Firstdayofwork;
        append.Phonenumberoftheemployee = Phonenumberoftheemployee;
        append.Addressoftheemployee = Addressoftheemployee;
        append.Workhours = Workhours;
        append.Salary = Salary;
        if (!CheckRecord(ID)) {
            if (head == null || head.ID >= append.ID) {
                append.next = head;
                head = append;
                return;
            }

            Node current = head;
            while (current.next != null && current.next.ID < append.ID) {
                current = current.next;
            }

            append.next = current.next;
            current.next = append;
        } else {
            System.out.println("record already exist");
        }
    }

//-----------------------------------------------------------------------------
    static void SearchRecord(int id) {
        Node current = head;
        while (current != null) {
            if (current.ID == id) {
                System.out.println("Name: " + current.NameofEmployee
                        + "\nID: " + current.ID
                        + "\nFirst day of work: " + current.Firstdayofwork
                        + "\nPhone Number: " + current.Phonenumberoftheemployee
                        + "\nAddress: " + current.Addressoftheemployee
                        + "\nWork hours: " + current.Workhours
                        + "\nSalary: " + current.Salary + "\n\n");
                current = current.next;
            } else {
                current = current.next;
            }
        }
        System.out.println("if nothing happen the employee doesn't exist\n");
    }
//------------------------------------------------------------------------------

    static void DeleteEmployee(int id) //    {
    //        Node tmpNode = head;
    //
    //        while (tmpNode != null) {
    //            if (tmpNode.ID == id) {
    //                if (tmpNode.next != null) // not last node
    //                {
    //                    // this works
    //                    Node delNode = tmpNode.next;
    //                    tmpNode.ID = tmpNode.next.ID;
    //                    tmpNode.next = tmpNode.next.next;
    //                } else // last node
    //                {
    //                    // this does not work
    //                    tmpNode = null;
    //                }
    //                System.out.println("deleted item \n");
    //                return;
    //            }
    //            tmpNode = tmpNode.next;
    //        }
    //        System.out.println("delete failed: item " + id + " not found\n");
    //    }
    {
        Node q = head;
        Node p = q;
        if (head != null) {
            if(q.ID != id){
            while (q.ID != id) {
                p = q;
                q = q.next;
            }
            p.next = q.next;}
            else{
                head = null;
            }
        }
    }
//------------------------------------------------------------------------------

    static void ShowRecord() {
        Node p = head;
        if (head != null) {
            while (p != null) {
                System.out.println("\n\nName: " + p.NameofEmployee
                        + "\nID: " + p.ID
                        + "\nFirst day of work: " + p.Firstdayofwork
                        + "\nPhone Number: " + p.Phonenumberoftheemployee
                        + "\nAddress: " + p.Addressoftheemployee
                        + "\nWork hours: " + p.Workhours
                        + "\nSalary: " + p.Salary + "\nNext Employee--------------------");
                p = p.next;
            }
            System.out.println("That's All Of Them\n\n\n");
        } else {
            System.out.println("Empty List");
        }
    }
//------------------------------------------------------------------------------

    static void UpdateSalary(int id) {
        if (CheckRecord(id)) {
            Node current = head;
            while (current != null) {
                if (current.ID == id) {
                    int hours = current.Workhours - 32;
                    current.Salary = current.Salary + ((current.Salary * 0.02) * hours);
                    current = current.next;
                } else {
                    current = current.next;
                }
            }
        }
    }
//------------------------------------------------------------------------------

    static void UpdateEmployee(String NameofEmployee, int ID, String Firstdayofwork,
            String Phonenumberoftheemployee, String Addressoftheemployee,
            int Workhours, double Salary) {
        if (CheckRecord(ID)) {
            Node current = head;
            while (current != null) {
                if (current.ID == ID) {
                    current.NameofEmployee = NameofEmployee;
                    current.Firstdayofwork = Firstdayofwork;
                    current.Phonenumberoftheemployee = Phonenumberoftheemployee;
                    current.Addressoftheemployee = Addressoftheemployee;
                    current.Workhours = Workhours;
                    current.Salary = Salary;
                } else {
                    current = current.next;
                }
            }
        }
    }

    public static void main(String[] args) {

        int status = 0;
        Scanner input = new Scanner(System.in);
        while (status == 0) {
            System.out.println("\n\nChoose 1 to Add a New Emplyee");
            System.out.println("Choose 2 to Delete an Existing Emplyee");
            System.out.println("Choose 3 to Update Emplyee Record");
            System.out.println("Choose 4 to Show All Emplyee Records");
            System.out.println("Choose 5 to Search for an Emplyee");
            System.out.println("Choose 6 to Update Emplyee Salary");
            System.out.println("Choose 7 to Exit");
            System.out.print("Enter your number: ");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter the Employee Name: ");
                    String NameofEmployee = input.next();
                    System.out.println("\nEnter the Employee ID Number: ");
                    int ID = input.nextInt();
                    System.out.println("\nEnter the Employee First Day of Work by this format DD-MM-YYYY: ");
                    String Firstdayofwork = input.next();
                    System.out.println("\nEnter the Employee Phone Number by this format +9665XXXXXXXX : ");
                    String Phonenumberoftheemployee = input.next();
                    System.out.println("\nEnter the Employee Address: ");
                    String Addressoftheemployee = input.next();
                    System.out.println("\nEnter the Employee Working Hours per Week: ");
                    int Workhours = input.nextInt();
                    System.out.println("\nEnter the Employee Salary: ");
                    double Salary = input.nextDouble();
                    AddEmployee(NameofEmployee, ID, Firstdayofwork, Phonenumberoftheemployee,
                            Addressoftheemployee, Workhours, Salary);
                    break;
                case 2:
                    System.out.println("Enter the Employee ID Number: ");
                    ID = input.nextInt();
                    DeleteEmployee(ID);
                    break;
                case 3:
                    System.out.println("Enter the Employee ID Number to Update his Record: : ");
                    ID = input.nextInt();
                    System.out.println("Enter the Employee Name: ");
                    NameofEmployee = input.next();
                    System.out.println("Enter the Employee First Day of Work by this format DD-MM-YYYY: ");
                    Firstdayofwork = input.next();
                    System.out.println("Enter the Employee Phone Number by this format +9665XXXXXXXX : ");
                    Phonenumberoftheemployee = input.next();
                    System.out.println("Enter the Employee Address: ");
                    Addressoftheemployee = input.next();
                    System.out.println("Enter the Employee Working Hours per Week: ");
                    Workhours = input.nextInt();
                    System.out.println("Enter the Employee Salary: ");
                    Salary = input.nextDouble();
                    UpdateEmployee(NameofEmployee, ID, Firstdayofwork,
                            Phonenumberoftheemployee, Addressoftheemployee,
                            Workhours, Salary);
                    break;
                case 4:
                    ShowRecord();
                    break;
                case 5:
                    System.out.println("Enter the Employee ID Number: ");
                    ID = input.nextInt();
                    SearchRecord(ID);
                    break;
                case 6:
                    System.out.println("Enter the Employee ID Number: ");
                    ID = input.nextInt();
                    UpdateSalary(ID);
                    break;
                case 7:
                    status = -1;
                    break;
                default:
                    System.out.println("Choose a correct number");

            }

        }
    }
}
