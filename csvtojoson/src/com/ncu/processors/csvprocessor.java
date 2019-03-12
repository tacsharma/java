package com.ncu.processors;
import java.io.*;
import org.json.simple.*;
public class csvprocessor{
public boolean processCSV(String csvFileName,String jsonFileName){
		String csvfilepath = "C:\\Users\\abc\\Desktop\\csvtojoson\\csvs";
		String jsonfilepath = "C:\\Users\\abc\\Desktop\\csvtojoson\\jsons";
	try{
		FileReader fr=new FileReader(csvfilepath+"\\"+csvFileName); 
		BufferedReader br = new BufferedReader(fr);
		String headerLine = br.readLine();
		String[] keyNames = headerLine.split(",");
		@SuppressWarnings("unchecked")
		int i=0;
		/*while (i<keyNames.length){
			System.out.println(keyNames[i]);
			i++;
		}*/
		String line;
		
		JSONArray jsonArry = new JSONArray(); //JSon Array
		FileWriter fw = new FileWriter(jsonfilepath+"\\"+jsonFileName);
		BufferedWriter bw = new BufferedWriter(fw);
		while ((line = br.readLine()) != null) {
			JSONObject jObj = new JSONObject(); //JSON Object - Key value pair like Maps in Collection
			String[] dataLine = line.split(",");
			for(i=0;i<dataLine.length;i++){
				jObj.put(keyNames[i],dataLine[i]);
			}
			jsonArry.add(jObj);    // Add the JSON object to JSON array
		}
		bw.write(jsonArry.toJSONString());
		bw.flush();
	}
	catch(Exception e){
		System.out.println(e);
		return (false);
	}
	return (true);
 }
}

class testprocessorcsv{
	public static void main(String[] args){
		csvprocessor cv = new csvprocessor();
		try{
			System.out.println(cv.processCSV("example.csv","jsonfile.json"));
		}
		catch(Exception e){}
	}
}

