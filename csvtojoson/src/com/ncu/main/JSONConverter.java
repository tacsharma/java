package com.ncu.main;
import com.ncu.exceptions.*;
import com.ncu.validators.*;
import com.ncu.processors.*;
import java.util.Scanner;
class JSONConverter{

	public static void main(String[] args){

		String c,csvfilename,jsonfilename;
		boolean b;
		NameValidator csvObject = new NameValidator();

		System.out.println("CSV FILE");
		csvfilename = getFileName();
		System.out.println("The entered path is "+csvfilename);	
		b = csvObject.nameValidator(csvfilename,"csv");
		if(b==true){
			System.out.println("CSV File is OK..");
			System.out.println("JSON FILE");
			jsonfilename = getFileName();
			b = csvObject.nameValidator(jsonfilename,"json");
			if(b==true)
				{
				System.out.println("JSON File is OK..");
				csvprocessor processorObj = new csvprocessor();
				boolean b1 = processorObj.processCSV(csvfilename,jsonfilename);
				if(b1==true)	
				System.out.println("...Converted...");
			}
		}

	}
	
	static String getFileName(){
		String filename=null;
		try{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter File Name:");
			filename = in.nextLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return filename;
	}
}

