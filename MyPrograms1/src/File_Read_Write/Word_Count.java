package File_Read_Write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Word_Count {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException   {
		FileReader f=new FileReader("C:\\Users\\Tanmayeee\\Desktop\\words.txt");
		BufferedReader br=new BufferedReader(f);
		int wcnt=0;
		String line=br.readLine();
		while(line !=null)
		{
			String[]words=line.split(" ");
			for(String w:words)
			{
				wcnt++;
			}
			
		}
		System.out.println("Word count :"+wcnt);
		}

}
