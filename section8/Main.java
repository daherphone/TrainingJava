package section8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
    	ArrayList<Contact> arr= new ArrayList<Contact>();
    	Contact c=Contact.createContact("daher", "01401457");
    	Contact c1=Contact.createContact("dada", "014014090");
    	Contact c2=Contact.createContact("daher", "01401457");
    	arr.add(c);
    	arr.add(c1);
    	arr.add(c2);
    	if(!arr.contains(c2))arr.add(c2);
    	else System.out.println("Element "+c2.getName()+" already exists");;
    	
    	Contact [] arrc= arr.toArray(new Contact[0]);
    	for (int i = 0; i < arrc.length; i++) {
			System.out.println(arrc[i]);
		}
    	ArrayList<Contact> arr2=  new ArrayList<Contact>(Arrays.asList(arrc));
    	//arr2.add(c1);
    	System.out.println(arr.get(0).getName());
    	System.out.println(arr.indexOf(c));
    	System.out.println(arr.contains(c));
		System.out.println(arr.contains(Contact.createContact("daher", "01401457")));
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(arr.toString());
		System.out.println(arr2.toString());
	
		for (Contact contact : arr2) {
			System.out.println(contact.getName()+": "+contact.getPhoneNumber());
		}
		Contact c3=Contact.createContact("Last", "0140000");
		LinkedList<Contact> linked= new LinkedList<Contact>(arr);
		//Iterator<Contact> i=linked.iterator();
			ListIterator<Contact> ListIt=arr2.listIterator();
			ListIt.next();
			System.out.println(linked);
			ListIt.remove();
			System.out.println(linked);
			//linked.add(c3);
			System.out.println(linked);
			
			ListIt.add(c3);
			System.out.println(linked);
			
			
			
		//Iterator<Contact> i1=arr2.iterator();
		
    	// Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

//        boolean quit = false;
//        startPhone();
//        printActions();
//        while(!quit) {
//            System.out.println("\nEnter action: (6 to show available actions)");
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 0:
//                    System.out.println("\nShutting down...");
//                    quit = true;
//                    break;
//
//                case 1:
//                    mobilePhone.printContacts();
//                    break;
//
//                case 2:
//                    addNewContact();
//                    break;
//
//                case 3:
//                    updateContact();
//                    break;
//
//                case 4:
//                    removeContact();
//                    break;
//
//                case 5:
//                    queryContact();
//                    break;
//
//                case 6:
//                    printActions();
//                    break;
//            }
//
//        }
//
//    }
//
//    private static void addNewContact() {
//        System.out.println("Enter new contact name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter phone number: ");
//        String phone = scanner.nextLine();
//        Contact newContact = Contact.createContact(name, phone);
//        if(mobilePhone.addNewContact(newContact)) {
//            System.out.println("New contact added: name = " + name + ", phone = "+ phone);
//        } else {
//            System.out.println("Cannot add, " + name + " already on file");
//        }
//    }
//
//    private static void updateContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contact existingContactRecord = mobilePhone.queryContact(name);
//        if(existingContactRecord == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//
//        System.out.print("Enter new contact name: ");
//        String newName = scanner.nextLine();
//        System.out.print("Enter new contact phone number: ");
//        String newNumber = scanner.nextLine();
//        Contact newContact = Contact.createContact(newName, newNumber);
//        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
//            System.out.println("Successfully updated record");
//        } else {
//            System.out.println("Error updating record.");
//        }
//    }
//
//    private static void removeContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contact existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//
//        if(mobilePhone.removeContact(existingContactRecord)) {
//            System.out.println("Successfully deleted");
//        } else {
//            System.out.println("Error deleting contact");
//        }
//    }
//
//    private static void queryContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contact existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//
//        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
//    }
//
//    private static void startPhone() {
//        System.out.println("Starting phone...");
//    }
//
//    private static void printActions() {
//        System.out.println("\nAvailable actions:\npress");
//        System.out.println("0  - to shutdown\n" +
//                           "1  - to print contacts\n" +
//                           "2  - to add a new contact\n" +
//                           "3  - to update existing an existing contact\n" +
//                           "4  - to remove an existing contact\n" +
//                           "5  - query if an existing contact exists\n" +
//                           "6  - to print a list of available actions.");
//        System.out.println("Choose your action: ");
    }



























}
