package apps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class crawl {
	
	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {

		try {
			System.out.println("What is the website?");
			String input = keyboard.readLine();
			URL url = new URL(input);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String strTemp = "";
        
			while(null != (strTemp = br.readLine())){
				System.out.println(strTemp);
			}
        
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}