import java.io.*;
import java.util.Arrays;

public class Temporarys {
	public static void main(String args[]) throws IOException{
		
		String s="\\t \\n \\t \\n asd  \\tnhy \\nhgf \\twerdsff      \\tdfd\\nsgsgb   hg";
		s=s.replace("\\n", " ");
		s=s.replace("\\t", " ");
		s=s.replace("\\s"," ");
		
		System.out.print(s);
		String[] str=s.split("\\s");
		System.out.println();
		int t=str.length;
		System.out.println(t);
	}	
}
