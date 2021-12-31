package com.company.Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMail {
		
		static ArrayList<String> List = new ArrayList<String>();
		//uc1
				public void Firstname() {
					
					List.add("Jhon");
					
					String regex = "[A-Z]{1}[a-z]{3}";

					Pattern p = Pattern.compile(regex);

					for (int i = 0; i < List.size(); i++) {
						Matcher m = p.matcher(List.get(i));
						System.out.println("The First name is :");
						System.out.println(List.get(i) + "-" + m.matches());
					}
					}

				//UC2
				public void Lastname() {

					List.add("jhon");
					List.add("Wick");
					
					String regex = "[A-Z]{1}[a-z]{3}";
					
					Pattern p = Pattern.compile(regex);

					for (int i = 0; i < List.size(); i++) {
						Matcher matches = p.matcher(List.get(i));
						System.out.println("The Last name is :");
						
						System.out.println(List.get(i) + "-" + matches.matches());
					}
				}
				//UC3
				public static void main1(String[] args) {
				      Scanner sc = new Scanner(System.in);
				      
				      System.out.println("Enter your Email: ");
				      
				      String mailid = sc.next();
				      String regex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";

				      boolean result = mailid.matches(regex);
				      
				      if(result) {
				         System.out.println("Given email-id is valid");
				      } else {
				         System.out.println("Given email-id is not valid");
				      }
				   }
				//uc4
				public void mobilenum() {
					
					
					ArrayList<String> numbers = new ArrayList<String>();

				
				numbers.add("91 9652814314");
				numbers.add("14 8790275009");

				String regex = "(0|91 )[9][0-9]{9}";

				Pattern pattern = Pattern.compile(regex);

				for (String number : numbers) {
					Matcher matcher = pattern.matcher(number);
					System.out.println(number + " : " + matcher.matches());
				}
				}
				//uc5
				public static boolean Password(String password)
				{
					String regex = "[A-Za-z]{8,}";
					Pattern p = Pattern.compile(regex);

					if (password == null) {
						return false;
					}

					Matcher m = p.matcher(password);

					return m.matches();
				}
				//uc6
				public static boolean Rule2(String password)
				{
					String regex = "^(?=.*[a-z])(?=.*[A-Z]){8,}.*$";
					Pattern p = Pattern.compile(regex);

					if (password == null) {
						return false;
					}

					Matcher m = p.matcher(password);

					return m.matches();
				}
				//uc7
				public static boolean Rule3(String password)
				{
					String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]){8,}.*$";
					Pattern p = Pattern.compile(regex);

					if (password == null) {
						return false;
					}

					Matcher m = p.matcher(password);

					return m.matches();
				}

				public static void main(String args[]) {

					UC1 obj = new UC1();
					obj.Firstname();

				}

}
