package hahaha;

public class Continue {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i ++) {
			if(i==1||i==3){
				System.out.println(i);
			}
			else{
				continue;
			}
		}
	}
}
