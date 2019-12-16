package verichu.test;

import javax.naming.*;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class TestDirContext {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		System.out.println("hello world.");
		
		InitialDirContext dc = new InitialDirContext(); 
		dc.doLookup("one.txt");

	}

}
