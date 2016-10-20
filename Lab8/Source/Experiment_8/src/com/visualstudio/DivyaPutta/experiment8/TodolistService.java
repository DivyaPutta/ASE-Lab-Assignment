package com.visualstudio.DivyaPutta.experiment8;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TodolistService {
		public String todolist(String input_your_list_items){
		Scanner input = new Scanner(System.in);
		final int MAX = 10;
		String[] list = new String[MAX];
		int option = 0;
		while (option != 3) {
			System.out.println();
			System.out.println("Type 1 if you want to add a new item to your to do list.");
			System.out.println("Type 2 to print your to do list.");
	        System.out.println("Type 3 to exit.");
	        System.out.print("Select your option: ");
	        option = input.nextInt();
	        int count = 0;
	        String userEnteredItem;
	        if (option == 1) {
	            System.out.println("Type 'stop' to stop adding items to your to do list.");
	            for (int i=0;i<MAX;i++) {
	                userEnteredItem = input.nextLine();
	                if(!userEnteredItem.isEmpty()) {
	                    list[i] = userEnteredItem;
	                    if (userEnteredItem.equals("stop"))  {
	                        break;
	                    }
	                    count++;
	                } else {
	                    i--;
	                }
	            }
	        }
	        else if (option == 2) {
	            for (int index = 0;index < count; index++) {
	                System.out.println(list[index]);
	            }
	        }
	        else {
	            input.close();
	        }
	    }
	    return "Your todo list is saved"; 
	}
		
}
