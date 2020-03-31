package coderbyte;

public class LongestWord {
    public static String LongestWord(String sen) {
        String[] arrWords = sen.split("[^A-Za-z0-9]");
        int max = 0;
        for(int i=1;i<arrWords.length;i++){
            if (arrWords[i].length() > arrWords[max].length() ){
                max = i;
            }
        }
	 return arrWords[max];
	}

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }
}
