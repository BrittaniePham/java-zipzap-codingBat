package a03_codebat_jUnit;

public class CodingBat {
	
	public String zipZap(String str) {
		char[] arr = new char[str.length()];
	    int arrIndex = 0;
	    int i = 0;
	    
	    while(i < str.length()) {
	        if( str.charAt(i) == 'z' && str.charAt(i + 2) == 'p' && i < str.length() - 2) {
	            arr[arrIndex] = 'z';
	            arrIndex++;
	            arr[arrIndex] = 'p';
	            arrIndex++;
	            i += 3;
	        } else {
	            arr[arrIndex] = str.charAt(i);
	            arrIndex++;
	            i++;
	        }
	    }
	                                 
	    // Allocates a new String that contains characters from a subarray of the character array argument. 
	    // The offset argument is the index of the first character of the subarray and the count argument 
	    // specifies the length of the subarray. The contents of the subarray are copied; subsequent 
	    // modification of the character array does not affect the newly created string.
	    return new String(arr, 0, arrIndex);  
	}
}
