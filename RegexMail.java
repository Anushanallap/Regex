package com.company.Regex;

import java.util.ArrayList;
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
					public static void main(String args[]) {

						RegexMail obj = new RegexMail();
						obj.Firstname();
}
	}
