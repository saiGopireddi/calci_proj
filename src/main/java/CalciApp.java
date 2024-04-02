public class CalciApp{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		CalciApp calciObj = new CalciApp();
		int addition = calciObj.add(4, 4);
		System.out.println(addition);
		
		
	}
	
}