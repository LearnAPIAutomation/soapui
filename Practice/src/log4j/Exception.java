package log4j;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Exception {

	public static void main(String[] args)  {
		int i = 0;
		try {
			i = 10 / 0;
		} 
		
		

		catch (SQLException se) {

		}
		catch (Exception e) {
			// Arithmetic exception
		}

		System.out.println(i);

	}

}
