package TesterClasses;

import java.io.File;
import java.io.FileNotFoundException;

import StrategiesClasses.SortedListFD;

/**
 * 
 * @author pedroirivera-vega
 *
 */
public class SortedListTester {

	public static void main(String[] args) throws FileNotFoundException {
	    GenericFDTester<Integer> tester = 
	    		new GenericFDTester<>(new SortedListFD<Integer>());
	    tester.run(new IntegerDataReader(new File("inputData", "integerData.txt")));

	    GenericFDTester<String> stester = 
	    		new GenericFDTester<>(new SortedListFD<String>());
	    stester.run(new StringDataReader(new File("inputData", "stringData.txt")));
	}

}