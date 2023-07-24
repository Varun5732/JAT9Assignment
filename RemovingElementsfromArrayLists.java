package tasks;

import java.util.ArrayList;

public class RemovingElementsfromArrayLists {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> stringArrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        stringArrayList.add("Boeing");
        stringArrayList.add("Augusta Westland");
        stringArrayList.add("Northdrop Grumman");
        stringArrayList.add("Lockheed Martin");

        System.out.println("Original ArrayList: " + stringArrayList);

        // Remove all elements from the ArrayList
        stringArrayList.clear();

        System.out.println("ArrayList after removing all elements: " + stringArrayList);
    }
}
