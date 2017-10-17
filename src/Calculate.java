import java.util.*;

import javax.script.*;


public class Calculate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String input = in.nextLine();
			ScriptEngine se = new ScriptEngineManager().getEngineByName("JavaScript");
			try {
				//Double d = (Double) ;
				System.out.println(se.eval(input));
			} catch (ScriptException e) {
				e.printStackTrace();
			}
			/*StringBuffer all = new StringBuffer(input);
			String[] snums = input.split("\\+|-|\\*|/|\\(|\\)");
			double[] nums = new double[snums.length];
			for(int i=0;i<snums.length;i++){
				nums[i] = Double.parseDouble(snums[i]);
			}
			String[] scals = input.split("1|2|3|4|5|6|7|8|9|0");
			for(double i:nums) System.out.print(i+" ");
			System.out.println();
			for(String i:scals) System.out.print(i+" ");
			System.out.println();
			/*for(int i=0;i<all.length();i++){
				if(all.charAt(i)=='+'||all.charAt(i)=='-'||all.charAt(i)=='*'||all.charAt(i)=='/'){
					
				}
			}*/
		}
	}
}
