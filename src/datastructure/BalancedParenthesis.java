package datastructure;

public class BalancedParenthesis {

	public static void main(String[] args) {

	}
	
	public static boolean isBalanced(String str) {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '(':
				count++;
				break;
			case ')':
				count--;
				break;
			default:
				throw new IllegalArgumentException();
			}
			if(count < 0) {
				System.out.println("Input is imbalance at: "+i);
				return false;
			}
		}
		
		if(count != 0) {
			System.out.println("Input is imbalance at "+(str.length()-1));
			return false;
		}
			
		
		return true;
	}
	
}
