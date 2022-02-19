package com.addressbooksystemUC1;

public class AddressBookSystemUC1 {

	private static void AddressBook() {
		String firstName = "Divya";
		String lastName = "Chourasiya";
		String address = "Indore";
		String stateName = "Madhya Pradesh";
		String zipCode = " 455118 ";
		String contactNum = " 825577889 ";
		String emailID = "divyachourasiya99@gmail.com";

		System.out.println("Adding following details on address book like" + " " + "firstName :" + firstName
				+ " lastName :" + lastName + " address :" + address + " stateName :" + stateName + " zipCode :"
				+ zipCode + " contactNum :" + contactNum + " emailID :" + emailID);
	}

	public static void main(String[] args) {
		AddressBook();

	}
}