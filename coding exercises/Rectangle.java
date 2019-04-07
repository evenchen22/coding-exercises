import java.util.Comparator;

/**
 *
 */

/**

* <p>Title: Rectangle</p>

* <p>Description: </p>



* @author Yifan Chen

* @date

*/
public class Rectangle extends Shape{


	private int iWidth;
	private int iLength;
	public Rectangle(int width, int length) {
		if(width <0 || length <0) {
			throw new IllegalArgumentException("The width or length should not be less than 0!");
		}
		this.iWidth = width;
		this.iLength = length;
	}
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int width) {
		this.iWidth = width;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int length) {
		this.iLength = length;
	}
	/* (non-Javadoc)
	 * @see Shape#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return iWidth * iLength;
	}

	/* (non-Javadoc)
	 * @see Shape#perimeter()
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(iWidth + iLength);
	}

	public int compareTo(Object other)  {
		Rectangle r1 = this;
		Rectangle r2 = (Rectangle)other;
		if(r1.area() > r2.area()) {
			return 1;
		}else if(r1.area() < r2.area()) {
			return -1;
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */

}
