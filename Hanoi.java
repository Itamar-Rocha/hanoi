import java.lang.Math;

public class Hanoi {
	public int calcMovimentos(int numDiscos){
		return (int) (Math.pow(2,numDiscos) - 1);
	}
}
