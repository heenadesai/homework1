package homework1;

import java.util.Random;

public class hw1 {

	public static void main(String[] args) 
	{
		String sequence = "";
		Random random = new Random();
		int count = 0;
		
		// int num = (int) (Math.random()* 4);
		
		for(int a = 0; a <= 999; a++)
		{
			for(int b = 0; b <= 2; b++)
			{
				int num = random.nextInt(4);
				
				if(num == 0){
					sequence = sequence + "A";
				}else if(num == 1){
					sequence = sequence + "C";
				}else if(num == 2){
					sequence = sequence + "G";
				}else if(num == 3){
					sequence = sequence + "T";
				}else{
					System.out.print("This is not working!");
				}
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

		// TODO Auto-generated method stub

	
			
	
