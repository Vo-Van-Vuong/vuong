package dahinh.override;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaGiac d;
		d = new DaGiac();
		d.tinhDienTich();
		
		d = new HinhChuNhat();
		d.tinhDienTich();
		
		
		d = new TamGiac();
		d.tinhDienTich();
		
		HinhChuNhat c = new HinhChuNhat();
		c.tinhTheTich();

	}

}
