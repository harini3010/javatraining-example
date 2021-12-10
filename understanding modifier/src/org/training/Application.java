package org.training;
import com.training.*;
public class Application {

	public static void main(String[] args) {
		OldStudent suresh = new OldStudent();
		System.out.println(suresh.getFees());  //it can't access because it is in protected with different subclass
	

	}

}
