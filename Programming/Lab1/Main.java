import  java.util.ArrayList;

public class Main {
	public static void main(String []arg) {
		short[] c = {3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		float[] x = new float[19];
		float max,min;
		boolean ans;
		max=14f;	
		min=-13f;
		final int massize1=14;
		final int massize2=19;
	    double[][] mas= new double[massize1][massize2];
	
		for (int f = 0; f < x.length; f++) {
			x[f]=(float) (Math.random() * (max - min)) + min;
		for (int i=0; i<mas.length; i++) {
			for (int j = 0; j<mas.length; j++) {
				if (c[i]==14) 
					mas[i][j] = Math.tan(Math.sin(x[j]/(4-x[j])));
			    
				else if (c[i] == 3 || c[i] == 5 || c[i] == 6 || c[i] == 9 || c[i] == 10 || c[i] == 12 || c[i] == 13)	
			        mas[i][j] = Math.atan(Math.cos(Math.pow(Math.asin((x[j]+0.5)/27),Math.pow(6*(1-x[j]),3))));
				
				else
					mas[i][j]= Math.sin(Math.pow((Math.sin(Math.asin((x[j]+0.5)/27)))*0.5+Math.pow(Math.pow(x[j]*(x[j]+0.75),x[j])/(Math.PI+1/3*(2+x[j])),2),2));
			}
			}
		}
	    for (int i=0; i<massize1; i++) {
			for (int j=0; j<massize2; j++) {
				System.out.printf("%.3f ", mas[i][j]);
			}
			System.out.println();
	    }
	
		

	}
}
