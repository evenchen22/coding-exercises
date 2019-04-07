import java.util.Comparator;

/**
 *
 */

/**

* <p>Title: Cuboid</p>

* <p>Description: </p>



* @author Yifan Chen

* @date

*/
public class Cuboid extends Rectangle {

	/**

	* <p>Title: </p>

	* <p>Description: </p>

	* @param width
	* @param length

	*/
	private int iDepth;
	public int getDepth() {
		return iDepth;
	}

	public void setDepth(int depth) {
		this.iDepth = depth;
	}

	public Cuboid(int width, int length, int depth) {
		super(width, length);
		// TODO Auto-generated constructor stub
		if(depth < 0) {
			throw new IllegalArgumentException();
		}
		this.iDepth = depth;
	}

	@Override
	public double perimeter() {
		if(true) {
			throw new UnsupportedOperationException("the perimeter isnotsuuported in Cuboid!");
		}
		return -1;
	}

	public double area() {
		return 2*(this.getiWidth()*this.getiLength() + this.getiWidth()*iDepth + this.getiLength() * iDepth);
	}

	public double volume() {
		return this.getiLength()*this.getiWidth()*iDepth;
	}

	public class SortByArea{
		public SortByArea() {

		}
		public int compare(Cuboid c1, Cuboid c2) {
			if(c1.area() > c2.area()) {
				return 1;
			}else if(c1.area() < c2.area()) {
				return -1;
			}
			return 0;
		}
	}

	public SortByVolume sortByVolume = new SortByVolume();
	public SortByArea sortByArea = new SortByArea();


	public class SortByVolume{
		public SortByVolume() {

		}
		public int compare(Cuboid c1, Cuboid c2) {
			if(c1.volume() > c2.volume()) {
				return 1;
			}else if(c1.volume() < c2.volume()) {
				return -1;
			}
			return 0;
		}
		/* (non-Javadoc)
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */

	}

}
