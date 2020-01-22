package com.myCompany.hibernate_image_demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import hibernate_image_demo.Service.ServiceImpl;
import hibernate_image_demo.model.Album;
import hibernate_image_demo.model.Photo;

public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ServiceImpl s = new ServiceImpl();
        do {
        	
        	System.out.println(" Enter your choice: ");
        	System.out.println("1. Create Album. ");
        	System.out.println("2. View Album.");
        	System.out.println("3. Find By Id.");
        	System.out.println("4. Delete By Id");
        	System.out.println("5. exit.");
        	int choice = Integer.parseInt(br.readLine());
        	switch(choice)
        	{
        		case 1:
        				System.out.println("Enter album name:");
        		        String albumName  = br.readLine();
        		        System.out.println("Enter url:");
        		        String url = br.readLine();
        		        LocalDate d = LocalDate.now();
        		        Album al = new Album(albumName, d,new Photo(url));
        		        System.out.println(s.createAlbum(al));
        		        break;
        		case 2: 
        				List<Album> list = s.getAlbums();
        		 		Iterator i = list.iterator();
        		 		while(i.hasNext())
        		 		{
        		 			System.out.println(i.next());
        		 		}
        			    
        		 		break;
        		case 3: 
        				System.out.println("Enter id:");
        		        int id = Integer.parseInt(br.readLine());
        		        System.out.println(s.findById(id));
        		        break;
        		case 4:
        				System.out.println("Enter id:");
		         		int iddel = Integer.parseInt(br.readLine());
		         		s.deleteById(iddel);
		         		break;
//        		case 5: 
//        				System.out.println("Enter url:");
//        				String url1 = br.readLine();
//        		        System.out.println("Enter id:");
//        		        int upid = Integer.parseInt(br.readLine());
//        		        System.out.println(s.updateUrl(upid, url1, LocalDate.now()));
//        		        break;
        		case 5:
        				s.systemExit();
        			 	System.exit(0);		
        		 		break;
        		        
        	}
        }while(true);
    }
}