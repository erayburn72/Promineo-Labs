//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// a. Instantiate a new StringBuilder
		// b. Append the characters 0 through 9 to it separated by dashes
		// Note: make sure no dash appears at the end of the StringBuilder

		// Would want to use as you are able to edit the data within, without it
		// pointing to a different location in memory and much more versatile.
		StringBuilder sb = new StringBuilder();
		sb.append("1-");
		sb.append("2-");
		sb.append("3-");
		sb.append("4-");
		sb.append("5-");
		sb.append("6-");
		sb.append("7-");
		sb.append("8-");
		sb.append("9");
		System.out.println(sb.toString());

		// 2. List of String:
		// a. Create a list of Strings
		// b. Add 5 Strings to it, each with a different length
		List<String> listStrings = new ArrayList<>();
		listStrings.add("Rebecca");
		listStrings.add("Erik");
		listStrings.add("Jeremiah");
		listStrings.add("Alexander");
		listStrings.add("Family");
		System.out.println(listStrings);

		// 3. Write and test a method that takes a list of strings
		// and returns the shortest string
		getShortList(listStrings);

		// 4. Write and test a method that takes a list of strings
		// and returns the list with the first and last element switched
		getReversedStartEndElements(listStrings);
		System.out.println(listStrings);

		// 5. Write and test a method that takes a list of strings
		// and returns a string with all the list elements concatenated to each other,
		// separated by a comma
		System.out.println(getConcatenatedString(listStrings));

		try (// 6. Write and test a method that takes a list of strings and a string
				// and returns a new list with all strings from the original list
				// containing the second string parameter (i.e. like a search method)
				Scanner search = new Scanner(System.in)) {
			System.out.println("Enter a Search String");
			String searchString = search.nextLine();
			System.out.println(getFindString(listStrings, searchString));
		}
		// 7. Write and test a method that takes a list of integers
		// and returns a List<List<Integer>> with the following conditions specified
		// for the return value:
		// a. The first List in the returned value contains any number from the input
		// list
		// that is divisible by 2
		// b. The second List contains values from the input list that are divisible by
		// 3
		// c. The third containing values divisible by 5, and
		// d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		try (Scanner numberInList = new Scanner(System.in)) {
			System.out.println("Enter Number of Integers in List"); // Better code would be to build a menu, using this
																	// instead to expedite the entry process.
			int x = numberInList.nextInt();

			try (Scanner listInput = new Scanner(System.in)) {
				System.out.println("Enter " + x + " integers.");

				List<Integer> listOfIntegers = new ArrayList<>();
				for (int i = 0; i < x; i++) {
					listOfIntegers.add(listInput.nextInt());

					System.out.println(getMapResults(listOfIntegers));
				}
			}
		}
		// 8. Write and test a method that takes a list of strings
		// and returns a list of integers that contains the length of each string
		System.out.println("Length of Strings are: " + getStringLength(listStrings));

		// 9. Create a set of strings and add 5 values
		Set<String> setStrings = new HashSet<String>();
		setStrings.add("Dog");
		setStrings.add("Cat");
		setStrings.add("Bird");
		setStrings.add("Donkey");
		setStrings.add("Canary");
		System.out.println(setStrings);
		// 10. Write and test a method that takes a set of strings and a character
		// and returns a set of strings consisting of all the strings in the
		// input set that start with the character parameter.
		CharSequence c = "d";
		System.out.println(getSetStrings(setStrings, c)); // This needs to change to a CHAR and not a CHARSEQUENCE?

		// 11. Write and test a method that takes a set of strings
		// and returns a list of the same strings
		System.out.println(getListStrings(setStrings));

		// 12. Write and test a method that takes a set of integers
		// and returns a new set of integers containing only even numbers
		// from the original set
		Set<Integer> setInteger = new HashSet<Integer>();
		setInteger.add(1);
		setInteger.add(2);
		setInteger.add(3);
		setInteger.add(4);
		setInteger.add(5);
		setInteger.add(6);
		System.out.println(getEvenIntegers(setInteger));

		// 13. Create a map of string and string and add 3 items to it where the key of
		// each
		// is a word and the value is the definition of the word
		Map<String, String> mapStrings = new HashMap<>();
		mapStrings.put("Word",
				"a unit of language, consisting of one or more spoken sounds or their written representation, that functions as a principal carrier of meaning. Words are composed of one or more morphemes and are either the smallest units susceptible of independent use or consist of two or three such units combined under certain linking conditions, as with the loss of primary accent that distinguishes the one-word blackbird (primary stress on “black”, and secondary stress on “bird”) from black bird (primary stress on both words). Words are usually separated by spaces in writing, and are distinguished phonologically, as by accent, in many languages.");
		mapStrings.put("Sentence",
				"Grammar. a grammatical unit of one or more words that expresses an independent statement, question, request, command, exclamation, etc., and that typically has a subject as well as a predicate, as in John is here. or Is John here? In print or writing, a sentence typically begins with a capital letter and ends with appropriate punctuation; in speech it displays recognizable, communicative intonation patterns and is often marked by preceding and following pauses.");
		mapStrings.put("Paragraph",
				"a distinct portion of written or printed matter dealing with a particular idea, usually beginning with an indentation on a new line.");

		// 14. Write and test a method that takes a Map<String, String> and a string
		// and returns the value for a key in the map that matches the
		// string parameter (i.e. like a language dictionary lookup)
		String searchTerm = "Word";
		System.out.println(getDefinition(mapStrings, searchTerm));

		// 15. Write and test a method that takes a List<String>
		// and returns a Map<Character, Integer> containing a count of
		// all the strings that start with a given character
		char letter = 'R';
		System.out.println(getCharactersCount(listStrings, letter));

	}

	// Method 15:
	public static Map<Character, Integer> getCharactersCount(List<String> listStrings, char letter) {
		Map<Character, Integer> getCharactersCount = new HashMap<>();
		int count = 0;
		for (String str : listStrings) {
			if (str.indexOf(letter) == 0) {
				count += count + 1;
				getCharactersCount.put(letter, count);
			}
		}
		return getCharactersCount;
	}

	// Method 14:
	public static String getDefinition(Map<String, String> mapStrings, String searchTerm) {

		return mapStrings.get(searchTerm);
	}

	// Method 12:
	public static Set<Integer> getEvenIntegers(Set<Integer> setInteger) {
		Set<Integer> getEvenIntegers = new HashSet<Integer>();
		for (int n : setInteger) {
			if (n % 2 == 0) {
				getEvenIntegers.add(n);
			}
		}
		return getEvenIntegers;
	}

	// Method 11:
	public static List<String> getListStrings(Set<String> setStrings) {
		List<String> getListStrings = new ArrayList<String>(setStrings.size());
		for (String str : setStrings) {
			getListStrings.add(str);
		}
		return getListStrings;
	}

	// Method 10:
	public static Set<String> getSetStrings(Set<String> setStrings, CharSequence c) {

		Set<String> getSetStrings = new HashSet<String>();

		for (String s : setStrings) {
			if (s.contains(c)) {
				getSetStrings.add(s);
			}
		}

		return getSetStrings;
	}

	// Method 8:
	public static List<Integer> getStringLength(List<String> listStrings) {

		List<Integer> getStringLength = new ArrayList<>();

		for (String str : listStrings) {
			getStringLength.add(str.length());
		}
		return getStringLength;
	}

	// Method 7:
	public static List<List<Integer>> getMapResults(List<Integer> listOfIntegers) {

		List<Integer> two = new ArrayList<>();
		List<Integer> three = new ArrayList<>();
		List<Integer> five = new ArrayList<>();
		List<Integer> other = new ArrayList<>();
		List<List<Integer>> getMapResults = new ArrayList<List<Integer>>();

		for (int n : listOfIntegers) {
			int nState = 0;
			if (n % 2 == 0) {
				nState = 2;
			} else if (n % 3 == 0) {
				nState = 3;
			} else if (n % 5 == 0) {
				nState = 5;
			} else
				nState = 0;

			switch (nState) {

			case 2: // Code 2 Matches
				two.add(n);
				break;

			case 3: // Code 3 matches
				three.add(n);
				break;

			case 5: // Code 5 matches
				five.add(n);
				break;

			default: // Case Else
				other.add(n);

			}
		}
		getMapResults.add(two);
		getMapResults.add(three);
		getMapResults.add(five);
		getMapResults.add(other);

		return getMapResults;
	}

	// Method 6:
	public static List<String> getFindString(List<String> listStrings, String searchString) { // Code compares exact to
																								// string and is case
																								// sensitive.
		List<String> getReturnString = new ArrayList<>();
		for (String str : listStrings) {
			if (str.contains(searchString)) {
				getReturnString.add(str);
			}
		}
		return getReturnString;
	}

	// Method 5:
	public static String getConcatenatedString(List<String> listStrings) {
		String concatenatedString = "";
		for (String str : listStrings) {
			concatenatedString += str + ", ";
		}

		concatenatedString = concatenatedString.substring(0, concatenatedString.length() - 2);

		return concatenatedString;
	}

	// Method 4:
	private static List<String> getReversedStartEndElements(List<String> listStrings) {
		String strFirstToLast = listStrings.get(0);
		int intArrayLength = listStrings.size() - 1;
		String strLastToFirst = listStrings.get(intArrayLength);
		listStrings.set(0, strLastToFirst);
		listStrings.set(intArrayLength, strFirstToLast);
		return listStrings;
	}

	// Method 3:
	public static String getShortList(List<String> listStrings) {
		int strLength = 0;
		int strIndex = 0;
		int i = 0;
		strLength = listStrings.get(0).length();
		for (i = 0; i < listStrings.size(); i++) {
			if (listStrings.get(i).length() < strLength) {
				strLength = listStrings.get(i).length();
				strIndex = i;
			}
		}
		System.out.println(listStrings.get(strIndex).toString());
		return listStrings.get(strIndex).toString();
	}

}
