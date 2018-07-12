package testA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class test {
	
	private static String filepath="C:\\Users\\Galaxy Yang\\Desktop\\WHETS.objcov";
	
	
 public ArrayList<String> read() throws IOException {
		 
		 File file=new File(filepath);
		 BufferedReader br=new BufferedReader(new FileReader(file));
		 String s;
		 ArrayList<String> sb=new ArrayList<String>();
		 while((s=br.readLine())!=null) {
			 sb.add(s);
		 }
		 br.close();
		 return sb;
		 }
	
public static void main(String args[]) throws IOException {
		
		 test t=new test();
		 
		 for(String s:t.read()) {
		    
			 if(s.length()>16){
			 
				 if(s.charAt(16)!='0') {
			    	 System.out.println("HH");
			     }
				 
		
			 }
			 
	     }
		 
		 
		 
		 System.out.println(t.read().get(11).indexOf('1'));
		 System.out.println(t.read().get(11).indexOf('1'));
	
	
	 
	 
	}
}
