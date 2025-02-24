public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray(){
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++){
			arr[i] = i+1;
		}
		return arr;
	}

	public static String[] createArray(String word, String word2, String word3, String word4){
		String[] arr = {word, word2, word3, word4};
		return arr;
	}

	public static int findValue(int num, int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == num){
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String word, String[] arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == word){
				count++;
				if(count == 3){
					return i;
				}
			}
		}
		return -1;
	}
}
