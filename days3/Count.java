package days3;

public class Count {

    public static int countWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return 0;
	        }

	        int count = 1;

	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ' ') {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        String str = "'hello world'";
	        int wordCount = countWords(str);
	        System.out.println("The words in the string " + str + " is: " + wordCount);
	    
	

	}

}
