package program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class TopScoresHandler {
	public ArrayList<String> stringscores = new ArrayList<String>();
	public int[] integerScores;
	public TopScoresHandler () {
		File testfile = new File("src/resources/scores.txt");
		try {
			BufferedReader in = new BufferedReader(new FileReader(testfile.getPath()));
			String nextLine;
			while ((nextLine = in.readLine()) != null) {
				stringscores.add(nextLine);
			}
			in.close();
			
			//quicksort//
			
		}
		catch (Exception e) {
			System.out.println("Error Encountered During Reading Scores");
		}
		ArrayList<Integer> integerAryList = getIntegerArrayList (stringscores);
		int[] integerScores = getIntegerArray (integerAryList);
		Quicksort sorter = new Quicksort();
		sorter.sort(integerScores);
	}
	
	private ArrayList<Integer> getIntegerArrayList(ArrayList<String> stringArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(String stringValue : stringArray) {
            try {
                //Convert String to Integer, and store it into integer array list.
                result.add(Integer.parseInt(stringValue));
            } catch(NumberFormatException nfe) {
               System.out.println("Could not parse " + nfe);
               //Log.w("NumberFormat", "Parsing failed! " + stringValue + " can not be an integer");
            } 
        }       
        return result;
    }
	private int[] getIntegerArray(ArrayList<Integer> intArrayList) {
		int[] arylst = new int[intArrayList.size()];
		for (int i=0; i < arylst.length; i++) {
			arylst[i] = intArrayList.get(i).intValue();
		}
		return arylst;
	}

	/**
	 * @return the integerScores
	 */
	public int[] getIntegerScores() {
		return integerScores;
	}

	/**
	 * @param integerScores the integerScores to set
	 */
	public void setIntegerScores(int[] integerScores) {
		this.integerScores = integerScores;
	}

}
