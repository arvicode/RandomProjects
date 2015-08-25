
public class MarbleSimulation {
	public static void main(String Args[])
	{
	System.out.println("Probability of drawing marbles of the same color?");
	System.out.println("100 trials" + marbles(100));
	System.out.println("1000 trials" + marbles(1000));
	System.out.println("10000 trials" + marbles(10000));
	}
	public static String marbles(int numTrials) {

final int w=2,b=1;
double number=0.0,result=0.0;
for (int i=0;i<numTrials;i++)
{
	result++;
	int [] bowl = {b,b,b,w,w,w};
	int [] drawMarbles = new int [3];
	
	for(int draw =0; draw <3; draw ++) {
		int index = (int) (Math.random() * bowl.length);
		drawMarbles[draw] = bowl[index];
		int[] newBowl =new int[bowl.length -1];
		int j=0;
		for(int t=0; t< bowl.length; t++) {
			if (t == index) {
				continue;
			}
			newBowl[j] =bowl[t];
			j++;
		}
			bowl = newBowl;	
		}
	if (drawMarbles[0] == drawMarbles[1] && drawMarbles[1] == drawMarbles[2]) {
	
		number++;
		
	}
}
	
return "Results:" +(number/result);	

	}
	}
	

	
