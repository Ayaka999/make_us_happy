package makeUsHappy;

import java.util.ArrayList;

public class MakeUsHappy {

	// This is the called method in line 39
	static void makeEverybodyHappy(String yourName) {
		System.out.println(yourName + ", you're so cool!");
	}

	// This is the called method in line 42
	static void makeMeHappy() {
		String myName = "Ayaka";
		System.out.println(myName + ", I'm so cool! ...lonely~~");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// for makeEverybodyHappy
		// try to create normal array.
		String[] Classmates = { "Taro", "Kim", "Nancy", };

		// I wanna change my array in the future.so, I set ArrayList.
		ArrayList<String> changedClassmates = new ArrayList<String>();

		// put elements of array"Classmates" into the ArrayList"changedClassmates"
		int n = Classmates.length;

		//insert blank line to make the code easy to see
		System.out.println("");
		// check if everybody here?
		System.out.println("Current ArrayList Member");
		for (int i = 0; i < n; i++) {
			changedClassmates.add(Classmates[i]);
			// print out the elements in Arraylist
			System.out.println(changedClassmates.get(i));
		}
		// I wanna add more class mates.
		changedClassmates.add("Mike");
		changedClassmates.add("Maria");
		changedClassmates.add("Hana");
		
		System.out.println("");
		System.out.println("Current ArrayList Member");
		int nlist = changedClassmates.size();
		for (int i = 0; i < nlist; i++) {

			// print out the elements in Arraylist
			System.out.println(changedClassmates.get(i));
		}
			
			System.out.println("");
		// calling happy function
		System.out.println("Make Everybody Happy");
		for (int i = 0; i < nlist; i++) {
			makeEverybodyHappy(changedClassmates.get(i));
		}
		
		System.out.println("");
		System.out.println("Make Me Happy");
		makeMeHappy();

	}

}
