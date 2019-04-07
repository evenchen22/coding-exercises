import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 *
 */

/**

* <p>Title: RectangleTest</p>

* <p>Description: </p>



* @author Yifan Chen

* @date

*/
public class RectangleTest {



	@Test
	public void testConstruction() {
		Rectangle rc = new Rectangle(1,2);

	}

	@Test
	public void testIllegalArgumentException() {
		Throwable e = null;

		  try {
			  Rectangle rc1 = new Rectangle(-1,2);
		  } catch (Throwable ex) {
		    e = ex;
		  }

		 Assert.assertTrue(e instanceof IllegalArgumentException);
	}

	@Test
	public void testGetterSetter() {
		Rectangle rc = new Rectangle(1,2);
		Assert.assertEquals(1,rc.getiWidth());
		rc.setiWidth(5);
		Assert.assertEquals(5,rc.getiWidth());
	}
	@Test
	public void testArea() {
		Rectangle rc = new Rectangle(6,2);
		Assert.assertEquals(12.0,rc.area(),0.000001);
	}

	@Test
	public void testCompareTo() {
		Rectangle rc1 = new Rectangle(6,2);
		Rectangle rc2 = new Rectangle(5,2);
		Rectangle rc3 = new Rectangle(4,2);
		List<Rectangle> rcs = new LinkedList<>() ;
		rcs.add(rc1);
		rcs.add(rc2);
		rcs.add(rc3);

		Collections.sort(rcs,new Comparator<Rectangle>() {

			@Override
			public int compare(Rectangle o1, Rectangle o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}}
		);
		Assert.assertEquals(8, rcs.get(0).area(),0.000001);
		Assert.assertEquals(10, rcs.get(1).area(),0.000001);
		Assert.assertEquals(12, rcs.get(2).area(),0.000001);


	}
	@Test
	public void testPerimeter() {
		Rectangle rc = new Rectangle(5,2);
		Assert.assertEquals(14,rc.perimeter(),0.00001);

	}


}
