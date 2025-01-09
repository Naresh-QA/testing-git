package Test;

import javax.sql.rowset.JoinRowSet;

import org.eclipse.collections.impl.lazy.DropWhileIterable;
import org.openqa.selenium.SearchContext;

import io.opentelemetry.sdk.metrics.internal.view.SumAggregation;

public class test_work {
	public static void main(String[] args) {
		 int a[][] = {{100, 120}, {86, 5}, {78, 86}};
	      int search_element=10;  
	        // Flag to track if the element is found
	        boolean found = false;

	        // Loop through all rows and columns
	        for (int row = 0; row < a.length; row++) {
	        
	            for (int column = 0; column < a[row].length; column++) {
	                if (a[row][column] == 8) { 
	                    System.out.println("It is found: " + a[row][column]);
	                    found = true;
	                    break;
	                }
	            }
	            
	}

	        // If the element was not found, print this message
	        if (!found) {
	            System.out.println("No element found");
	        }
	}}