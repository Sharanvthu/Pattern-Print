
public class InterviewQue {

	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i <n ; i++) {
			for (int j = 0; j <n ; j++) {
				if((i==2||j==2)||(i==0&&j==0)||(i==0&&j==1)||(i==4&&j==0)||(i==3&&j==0)||(i==0&&j==4)||(i==1&&j==4)||(i==4&&j==3)||(i==4&&j==4))
					System.out.print("* ");
				else
					System.out.print("  ");
				
				
			}
			System.out.println();
		}

	}

}
