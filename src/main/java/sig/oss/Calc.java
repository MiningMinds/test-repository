public class Calc{
	int r = 0;
	public int add(int x, int y){//add method
		return x+y;
	}
	public int sub(int x, int y){
		return x-y; //fix subfunction
	}
	public int mul(int x, int y){
		return x*y;
	}
	public void inc(int d){
		r+=d;
	}
	public int getResult(){
		return r;
	}

}
