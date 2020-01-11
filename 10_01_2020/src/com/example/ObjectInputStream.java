
	package com.example;
	import java.io.*;
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;

	public class ObjectInputStream {

		
		
		public ObjectInputStream(FileInputStream in) {
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
			BufferedReader reader;
			
			Emp e = new Emp(null, null, null);
			List<Emp> list = new ArrayList<Emp>();
			try {
				reader = new BufferedReader(new FileReader("emp.in"));

				String line = reader.readLine();
				while (line != null) {
					String str[] = line.split(",");
					e = new Emp(str[0], str[1], LocalDate.now());
					System.out.println("ToDo to write is: " + line);
					list.add(e);
					line = reader.readLine();
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			try {
				FileOutputStream out = new FileOutputStream("emp.out");
				ObjectOutputStream oos = new ObjectOutputStream(out);
				oos.writeObject(list);
				oos.flush();
			} catch (Exception e1) {
				System.out.println("Problem serializing: " + e1);
			}

			try {
				FileInputStream in = new FileInputStream("todo.out");
				ObjectInputStream ois = new ObjectInputStream(in);
				list = (List<Emp>) (ois.readObject());
			} catch (Exception e1) {
				System.out.println("Problem serializing: " + e1);
			}
			System.out.println("displaying all todo\n===================\n");
			for(Emp t:list)
			{
				System.out.println( t+"\n");
			}
				

		}

		private List<Emp> readObject() {
			// TODO Auto-generated method stub
			return null;
		}
	}


