package com.Bharani.FileHandling;
	import java.io.*;
import java.util.ArrayList;

	public class FileEx
	{
		public static void main(String[] args) throws Exception
		{
			System.out.println("Creating Folder");
			File myFile = new File("D:\\programfile");
			
			String[] requiredFolders ={"Java", "Documents","Images"};
			
			for(String folder :requiredFolders)
			{
				File newFile = new File(myFile,folder);
				newFile.mkdir();
			}
			
		
			
			File[] allFiles = myFile.listFiles();
			
			for(File file:allFiles)
			{
				if(file.isFile())
				{
					String ext = getFileExtention(file.getName());
					System.out.println(ext);
					if(ext.equalsIgnoreCase("jpg") || ext.equalsIgnoreCase("bmp") || ext.equalsIgnoreCase("jpj") || ext.equalsIgnoreCase("png") )
					{
					
						File newFile = new File(myFile,"Images/"+file.getName());
						file.renameTo(newFile);
					}
					else if(ext.equalsIgnoreCase("java") || ext.equalsIgnoreCase("class")) {
						File newFile=new File(myFile,"Java//"+file.getName());
						file.renameTo(newFile);
					}
					else if(ext.equalsIgnoreCase("txt")) {
						File newFile=new File(myFile,"Documents//"+file.getName());
						file.renameTo(newFile);
					}
				}
			}
			
		
	
			
		
		}
		
		
		public static String getFileExtention(String fileName)
		{
			return 	fileName.substring(fileName.lastIndexOf(".")+1,fileName.length());
		}


	}

