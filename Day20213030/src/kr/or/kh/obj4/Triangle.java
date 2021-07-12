package kr.or.kh.obj4;

import java.util.Arrays;

public class Triangle extends Point2D {
	
		protected Point2D[] point;
	
		public Triangle() {
			point = new Point2D[3];  //삼각형 꼭지점 3개 x .y 는 상속받고 from2d
			
			
			point[0]=new Point2D(10,10);
			point[1]=new Point2D(20,20);
			point[2]=new Point2D(30,30);
		}
	
		public Triangle(Point2D[] p) {
			this.point=p;
			
		}

		@Override
		public String toString() {
			return point[0].x+":"+point[0].y+":"+point[1].x+":"+point[1].y+":"+point[2];
					
		}
		public static void main(String[] args) {
			Triangle triangle= new Triangle();
			System.out.println(triangle.toString());
			
			
			//매개변수 생성자사용
			Point2D[] point=new Point2D[3]
			Point[0]=new Point		
		}
}
