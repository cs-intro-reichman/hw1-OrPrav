public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		//double totalRate =  Math.pow((intrestRate + 1), years);
		double futureValue = (currentValue * Math.pow(((interestRate/100) + 1), years));
		System.out.println("After " + years + " years, " + currentValue + "$ saved at " + interestRate + 
		"% will yield " + (int)futureValue + "$");
	}
}