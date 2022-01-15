package com.shreyaks.project;

import java.io.FileNotFoundException;

public interface FileUtility {
	public void showAllFiles();
	public void addFile();
	public void deleteFile();
	abstract void searchFile() throws FileNotFoundException;
	

}
