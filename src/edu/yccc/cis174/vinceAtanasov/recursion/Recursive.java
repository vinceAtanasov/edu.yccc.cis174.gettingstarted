package edu.yccc.cis174.vinceAtanasov.recursion;

import java.io.File;

public class Recursive {

	public void walkDirectories(String filePath) {
		// 1. List files.
		File f = new File(filePath);
		File[] files = f.listFiles();
		if (files != null) {
			for (int n = 0; n < files.length; n++) {
				// System.out.println(files[n].getName());
				System.out.println(files[n].getAbsolutePath());
				// 2. If directory exists, call self, pass the directory path
				if (files[n].isDirectory()) {
					walkDirectories(files[n].getAbsolutePath());
				}
			}
		}
	}

	public static void main(String[] args) {
		Recursive r = new Recursive();
		r.walkDirectories("C:\\Users\\velik\\git");

	}

}
