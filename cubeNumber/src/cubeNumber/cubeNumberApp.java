package cubeNumber;



public class cubeNumberApp {

	public static void main(String[] args) {
		System.out.println(cubeNumber.CubeNumber(3));

	}

}
class cubeNumber {
	public static int CubeNumber(int num) {
	return num*num*num;
}
}