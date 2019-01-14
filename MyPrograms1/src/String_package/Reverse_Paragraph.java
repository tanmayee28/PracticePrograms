package String_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_Paragraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String para="   region    The house  at 78 Derngate";
		//para.trim();
		String[] s=para.split(" ");
		List<String> reverse = new ArrayList<>() ;
		
		for (String s1 : s) {
			
			
			if ( s1.equals("")) {
				
			}
			else {
				
				reverse.add(s1);
			}
		}
		Collections.reverse(reverse);
		StringBuffer sb=new StringBuffer();	
		for(String con:reverse)
		{
			sb.append(con);
			sb.append(" ");
		}
		System.out.println(sb);
	}

}
