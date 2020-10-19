package buoi8;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac t = new TamGiac();
		
		t.soCanh = 3;
		t.tinhDienTich();
		HinhChop h = new HinhChop();
		//Nếu cha con có cung hàm thì no se su dung ham của thang con trước.
		h.tinhTheTich();
		
		
		
	}

}
