package Com.utility.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.logging.Log;
import com.google.common.graph.Network;


/**----------------------------------------------------------------------------------------
   * @Solnet_backend_testing 
   * @File_Description: This Method is used to verify is Password Validation functionality 
   * @date            :02-Oct-2018@6:43:32 PM
   * @Mayur     
   *----------------------------------------------------------------------------------------
   */
public class Utility_method { 
	/**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static boolean IsPasswordValid(String etPassword) 
	{
		String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})";
		String strPassword = etPassword.trim();

		System.out.printf("strPassword", strPassword);
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(strPassword);
		System.out.printf("boolean", matcher.matches() + "");
		return matcher.matches();
	}

	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static boolean IsNameValid(String editText)
	{
		String strEmailId = editText.trim();
		Pattern pattern = Pattern.compile("[a-zA-Z ]+\\.?");
		Matcher matcher = pattern.matcher(strEmailId);
		return matcher.matches();
	}

	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static boolean IsNumber(String editText) {
		boolean flag = false;
		String regexStr = "^[0-9]*$";
		if (editText.trim().matches(regexStr)) {
			// write code here for success
			flag = true;
		}
		else {
			flag = false;
			// write code for failure
		}

		System.err.printf("Flag", flag + "");

		return flag;
	}


	
	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static boolean IsNumeric(String editText) {
		try {
			double d = Double.parseDouble(editText.trim());
		}
		catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}


	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static boolean IsContactNoValid(String contact) {

		String strcontact = contact.toString().trim();
		Pattern pattern = Pattern.compile("^[0-9]$");
		Matcher matcher = pattern.matcher(strcontact);
		return matcher.matches();
	}
	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static boolean IsEtEmpty(String find_length) {
		boolean flag = false;
		if (find_length.trim().length() == 0) {
			flag = true;
		}
		return flag;
	}

	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static boolean IsStringEmpty(String string) {
		boolean flag = false;
		if (string.trim().equals("")) {
			flag = true;
		}
		return flag;
	}
	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static boolean IsSecure_passwordValid(String secure_password) {
		String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})";
		String strPassword = secure_password.toString().trim();
		System.out.printf("strPassword", strPassword);
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(strPassword);
		System.out.printf("boolean", matcher.matches() + "");
		return matcher.matches();
	}
	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static boolean isUsernameValid(String etEmail) {
		String strEmailId = etEmail.trim();
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");
		Matcher matcher = pattern.matcher(strEmailId);
		return matcher.matches();
	}
	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static String CapatilzeFirstLetter(String input) {
		String output = input.substring(0, 1).toUpperCase() + input.substring(1);
		return output;
	}

	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static Date getDate(String datestring) {
		Date date1 = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date1 = dateFormat.parse(datestring);
		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date1;
	}


	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static String change_Date_Format(String str_input, String strSourceFormat, String strOputputFormat) {
		String desiredDateString = "";
		if (str_input != null && !str_input.equalsIgnoreCase("")) {
			Date input_date = null;
			SimpleDateFormat sourceFormat = new SimpleDateFormat(strSourceFormat);
			SimpleDateFormat desiredFormat = new SimpleDateFormat(strOputputFormat);
			try {
				input_date = sourceFormat.parse(str_input);
				desiredDateString = desiredFormat.format(input_date);
			}
			catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return desiredDateString;
	}


	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static String CapitalFirstLetter(final String myString) {
		String upperString = myString.substring(0, 1).toUpperCase() + myString.substring(1);

		return upperString;
	}

	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static String changeDetailsDateFormat(String formatDate) throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date newDate = format.parse(formatDate);

		format = new SimpleDateFormat("dd/mm/yyyy");
		String date = format.format(newDate);

		SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dates = inFormat.parse(formatDate);
		SimpleDateFormat outFormat = new SimpleDateFormat("EEEE");
		String currentDayDate = outFormat.format(dates);

		String day3Digit = currentDayDate.substring(0, Math.min(currentDayDate.length(), 3));
		return day3Digit + "\n" + date;
	}

	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static String returnDay(int result) {
		String Day = "";
		if (result == Calendar.MONDAY) {
			Day = "Mon";
		}
		else if (result == Calendar.TUESDAY) {
			Day = "Tue";
		}
		else if (result == Calendar.WEDNESDAY) {
			Day = "Wed";
		}
		else if (result == Calendar.THURSDAY) {
			Day = "Thu";
		}
		else if (result == Calendar.FRIDAY) {
			Day = "Fri";
		}
		else if (result == Calendar.SATURDAY) {
			Day = "Sat";
		}
		else if (result == Calendar.SUNDAY) {
			Day = "Sun";
		}
		return Day;
	}

	
	  /**----------------------------------------------------------------------------------------
	   * @Description     : This Method is used to verify is Password Validation functionality 
	   * @param           : String String etPassword is input of password validation
	   * @return          : return matcher.matches();
	   * ----------------------------------------------------------------------------------------
	   */
	public static String chnageTimeFormat(String time) throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date newDate = format.parse(time);

		format = new SimpleDateFormat("HH:mm");
		String date = format.format(newDate);

		return date;
	}

}
