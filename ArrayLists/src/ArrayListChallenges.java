import java.util.ArrayList;
public class ArrayListChallenges
	{
		public static void main(String[] args)
			{
				
				ArrayList myArray = new ArrayList();
				myArray.add(54.38);
				myArray.add(28.88);
				myArray.add(89.57);
				myArray.add(38.88);
				myArray.add(51.1);	
					System.out.println(myArray);
							
				double sum = 0.0;
				for(int i = 0; i < myArray.size(); i++)
					{
						sum = sum + (double)myArray.get(i);
								
					}
				System.out.println(sum);
				
			}

	}
