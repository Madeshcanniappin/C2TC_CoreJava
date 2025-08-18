package dayThree.BufferReader;

import java.io.*;
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name: ");
		String name = buffer.readLine();
		
		System.out.println("Enter the age: ");
		int age=Integer.parseInt(buffer.readLine());
		
		System.out.println(name+ +age);

	}

}
