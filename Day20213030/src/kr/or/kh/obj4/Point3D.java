package kr.or.kh.obj4;
public class Point3D extends Point2D {
	
	protected int z;

	public Point3D() {
		super();
		z=0;
		
	}

	public Point3D(int x, int y,int z) {
		super(x, y);				//부모 매개변수 생성자
		this.z=z;
		
	}
	@Override
	public String toString() {
		return super.toString()+"Point3D [z=" + z + "]";
	}
	
	
	public static void main(String[] args) {
		
		
		Point3D point3D= new Point3D();
		System.out.println(point3D.toString());
		
		
		Point3D point3D1=new Point3D(10,20,30);
		System.out.println(point3D1);
	}
	
	

}
