package homework1;

import java.util.Random;


public class extra_credit {
	public static void main(String[] args)
	{
		String sequence = "";
		Random random = new Random();
		int count = 0;
		for(int a = 0; a <= 999; a++)
		{ 	
			for (int b = 0; b <= 2; b++)
			{
				float num =  random.nextFloat();
				if (num <= 0.12){
					sequence = sequence + "A";
				}else if(num > 0.12 && num < 0.50){
					sequence = sequence + "C";
				}else if(num > 0.50 && num <= 0.89){
					sequence = sequence + "G";
				}else if(num > 0.89 && num <= 1.00){
					sequence = sequence + "T";
				}//else{
					//System.out.print("This is not working");
				//}
				if(sequence.equals("AAA")){
					count = count + 1;
				}
	
			
			}
			System.out.println(sequence);
			sequence = "";
		}
		System.out.println("There are " + count + " 3-mers of 'AAA'");
		
}
	
	
	
	
	
	
}
