package ExperimentClasses;

import java.io.FileNotFoundException;

import StrategiesClasses.*;

/**
 * @author Fernando J. Bermudez Medina
 */
public class ExperimentalTrials {

	public static void main(String[] args) {

		/**
		 * @param1 Initial Size
		 * @param2 Trials per Size
		 * @param3 Incremental Steps (Size)
		 * @param4 Last Size to Consider
		 */
		ExperimentController ec = new ExperimentController(50, 200, 50, 1000); 
		
		/*
		TODO UNCOMMENT THESE LINES TO RUN EXPERIMENTAL TRIALS AND RECEIVE THE OUTPUT DATA
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new SequentialFD<Integer>())); 
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new SortedListFD<Integer>())); 
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new OrderedFD<Integer>())); 
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new MapFD<Integer>())); 
		*/
		
		ec.run(); // run the experiments on all the strategies added to the controller object (ec)
		
		// save the results for each strategy....
		try {
			ec.saveResults();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

}