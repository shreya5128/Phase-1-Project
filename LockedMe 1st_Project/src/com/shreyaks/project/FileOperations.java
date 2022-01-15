package com.shreyaks.project;

import java.awt.Desktop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.shreyaks.project.FileUtility;

public class FileOperations implements FileUtility {


		List<String> retrieve = new ArrayList<String>();
		File[] files = new File("C:\\Users\\HP\\eclipse-workspace\\LockedMe 1st_Project").listFiles();
		
		@Override
		public void showAllFiles() {
			
			for(File file : files) {
				if(file.isFile()) {
					retrieve.add(file.getName());
					
				}
			}
			retrieve.forEach(System.out::println);

		}
		
	

@Override
public void addFile() {
	
	System.out.println("Enter the name of the file which you want to add:");
	
	Scanner scan=new Scanner(System.in);
	String filename=scan.nextLine();
	File F = new File(filename);
	try {
		if(F.createNewFile()) {
			System.out.println(filename+" file is added to the directory");
			Desktop.getDesktop().edit(F);
		}
		else {
			System.out.println("This file already exists");
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}	

}

@Override
public void deleteFile() {
	
	System.out.println("Enter the name of the file which you want to delete:");
	
	Scanner scan=new Scanner(System.in);
	String filename=scan.nextLine();
	File F= new File(filename);
	if(F.delete())
		System.out.println(filename+" got Deleted");
	else
		System.out.println("File Not Found");
}

@Override
public void searchFile() {
	
	try {	
		Scanner scan= new Scanner(System.in);
		File directory = new File("C:\\Users\\HP\\eclipse-workspace\\LockedMe 1st_Project");
		System.out.println("Enter the name of the file which you want to search:");
		String fileName=scan.nextLine();
        File[] files=directory.listFiles();
        int flag=0;
        for (File file : files) {
            String name = file.getName();
            
            if (name.equals(fileName)) {
                   
    				File f= new File(fileName);
    				Scanner sc1 = new Scanner(f);
    				while(sc1.hasNextLine()) {
    				System.out.println(sc1.nextLine());
    				}
    			flag=1;	
            }
		}
    if(flag==0) {
    	System.out.println("File not found");
    }

	}catch(FileNotFoundException ex) {
		System.out.println("File not found");
	}

}
}
