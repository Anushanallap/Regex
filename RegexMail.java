package com.company.Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMail {
		
		static ArrayList<String> List = new ArrayList<String>();

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
				public static void main(String[] args) {
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

}
