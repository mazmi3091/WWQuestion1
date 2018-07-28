// SEIT Question 1: 

package WWQuestion1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class WWQuestion1 {

	// Method created to verify if file exists in the system returns a boolean value
	// Returns true if file is present and false if it is not present
	public static boolean doesFileExist(String path) {
		File file = new File(path);
		if (file.exists()) {
			System.out.println("File Found!");
			return true;
		}
		System.out.println("File Does Not Exist. Please check your directory.");
		return false;
	}

	public static void main(String[] args) {
		try {
			
			// Declare string path with location to directory where file is saved
			String path = ("C:\\Users\\xxthe\\Desktop\\WWQuestion1\\text_file.txt");
			System.out.println(doesFileExist(path));
			System.out.println();
			
			// Initialize BufferReader to be able to read the text from the file. FileReader allows us to read the text.
			BufferedReader br = new BufferedReader(new FileReader(path));

			// While loop to read all the lines in the text file. Break loop when all the lines have been read.
			// Advantage of this is that if in the future we add more lines the BufferedReader will be able to read the new lines. 
			
			// line == null is used instead of isEmpty() to make sure the BufferedReader continues reading even if there is a blank line...
			// with more words after the blank line.
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}

				// Populate a new String array with the words in the text file. Used the split method to split the... 
				// lines into new line whenever a "," or "–" is present and used for loop print the words into console.
				String[] nextWord = line.split("–|\\,");
				for (String word : nextWord) {
					System.out.println(word);
				}
				System.out.println();
			}
			// Close BufferedReader
			br.close();

		} catch (Exception e) {

		}
	}
}
