package net.theoks.pcu.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

import net.theoks.pcu.control.xml.XmlModuleListParser;
import net.theoks.pcu.control.xml.XmlRaceListParser;
import net.theoks.pcu.model.Module;

/**
 * The driver class, used for running the program as a local application. Also
 * contains utility methods, and the main method.
 * 
 * @author Cedrick Cooke
 */
public class PCU {
	private static final String VERBOSE = "-v";
	private static final String COMMAND_LINE_INTERFACE = "-cl";
	private static final String HELP = "--help";
	private static final String FILE = "-f=";
		
	private static boolean verbose = false;
	private static boolean commandLineInterface = false;
	private static boolean help = false;
	
	private static String file = null;
	public static final String dataPath = System.getProperty("user.dir")
			+ "/dat/";
	private static List<Module> modules = new LinkedList<Module>();

	/**
	 * @param args
	 *            The arguments passed to the program
	 */
	public static void main(String... args) {
		// Interpret the arguments passed
		readArguments(args);

		// If they need help, give it. Otherwise, run the program.
		if (help) {
			System.out.println(readFile(dataPath + "help.txt"));
		} else {
			loadModules();
			// Attempt to load the given character file
			if (file != null) {
				// TODO : Attempt to load the given character file
			}

			// Use the command line if they asked for it. GUI otherwise
			if (commandLineInterface) {
				// TODO : Start the command line interface
			} else {
				// TODO : Load the graphical user interface
			}
		}
	}

	/**
	 * Method to load all modules in dat/installed_modules.xml
	 */
	private static void loadModules() {
		// Set the Mem module list
		modules = XmlModuleListParser.loadModules(new File(dataPath
				+ "installed_modules.xml"));

		for (Module m : modules) {
			// Should probably load in order of Items -> Skills ->
			// Magic/Psionics -> Occs -> Races
			// TODO Load items (inc. weapons and armor)
			// TODO Load items
			// TODO Load items
			m.setRaces(XmlRaceListParser.parseFile(new File(dataPath
					+ m.getFolder() + "races.xml")));
		}
		System.out.println(modules);
	}

	/**
	 * A utility method to pull arguments out of the main method.
	 * 
	 * @param args
	 *            The arguments passed to the program.
	 */
	private static void readArguments(String... args) {
		for (String arg : args) {
			if (arg.equals(VERBOSE))
				verbose = true;
			else if (arg.equals(COMMAND_LINE_INTERFACE))
				commandLineInterface = true;
			else if (arg.equals(HELP)) {
				verbose = true;
				help = true;
			} else if (arg.startsWith(FILE))
				file = arg.substring(3);
		}
	}

	/**
	 * A utility method to be used in other parts of the program.
	 * 
	 * @param s
	 *            If the program is currently running the command line
	 *            interface, print s.
	 */
	public static void speak(String s) {
		if (commandLineInterface)
			System.out.println(s);
	}

	/**
	 * A utility method to be used in other parts of the program.
	 * 
	 * @param s
	 *            If the program is currently running verbose, print s.
	 */
	public static void whisper(String s) {
		if (verbose)
			System.out.println(s);
	}

	/**
	 * Convenience method from reading a file from a String filepath
	 * 
	 * @param s
	 *            The file you want to read.
	 * @return If the file can be read, a String containing its contents. <br/>
	 *         Else returns null.
	 */
	public static String readFile(String s) {
		return readFile(new File(s));
	}

	/**
	 * Reads a file and returns it as a string.
	 * 
	 * @param f
	 *            The file you want to read.
	 * @return If the file can be read, a String containing its contents. <br/>
	 *         Else returns null.
	 */
	public static String readFile(File f) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			StringBuilder sb = new StringBuilder((int) f.length());
			String seperator = System.getProperty("line.separator");
			String line = null;
			line = br.readLine();
			sb.append(line);
			while ((line = br.readLine()) != null) {
				sb.append(seperator);
				sb.append(line);
			}
			br.close();
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Writes to a file. </br> <b>WARNING!</b>: Deletes whatever file was there.
	 * 
	 * @param f
	 *            The file you want to read.
	 * @param s
	 *            The string to write to the file
	 * @return true if the write was successful, false otherwise
	 */
	public static boolean writeFile(File f, String s) {
		try {
			if (f.exists())
				f.delete();
			f.createNewFile();
			BufferedWriter write = new BufferedWriter(new FileWriter(f));
			BufferedReader read = new BufferedReader(new StringReader(s));
			String seperator = System.getProperty("line.separator");
			String line = read.readLine();
			write.append(line);
			while ((line = read.readLine()) != null) {
				write.append(seperator);
				write.append(line);
			}
			write.close();
			read.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
