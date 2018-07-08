package shuxue;

public class demo {
	public static void main(String[] args) {
		double s=0,s2 = 100000;
		for(int i=0;i<10;i++) {
			s2=s+s2;
			
			s=s2*Math.pow((1+0.15), 1);
			
			System.out.println("第"+(i+1)+"年：	"+s);
		}
		
	}

}
