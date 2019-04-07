import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;

/**
 *
 */

/**

* <p>Title: CuboidTest</p>

* <p>Description: </p>



* @author Yifan Chen

* @date

*/
public class CuboidTest {

	@Test
	public void testConstructor() {
		Cuboid c1 = new Cuboid(1,2,2);

	}

	@Test
	public void testUnsupportedOperationException() {
		Cuboid c = new Cuboid(1,2,2);
		UnsupportedOperationException e = Assertions.assertThrows(UnsupportedOperationException.class,c::perimeter);
		Assert.assertEquals(e.getMessage(),"the perimeter isnotsuuported in Cuboid!");
	}

	@Test
	public void testIllegalArgumentException() {
			Throwable e = null;

		  try {
			  Cuboid c = new Cuboid(1,2,-2);
		  } catch (Throwable ex) {
		    e = ex;
		  }

		 Assert.assertTrue(e instanceof IllegalArgumentException);

	}

	@Test
	public void testGetterSetter() {
		Cuboid c1 = new Cuboid(1,2,2);
		Assert.assertEquals(2, c1.getDepth());
		c1.setDepth(4);
		Assert.assertEquals(4, c1.getDepth());
	}
	@Test
	public void testArea() {
		Cuboid c1 = new Cuboid(1,2,2);
		Assert.assertEquals(16, c1.area(),0.00001);

	}

	@Test
	public void testSortByArea() {
		Cuboid c1 = new Cuboid(1,1,1);
		Cuboid c2 = new Cuboid(2,2,2);
		Cuboid c3 = new Cuboid(3,3,3);
		List<Cuboid> cs = new LinkedList<>();
		cs.add(c2);
		cs.add(c1);
		cs.add(c3);
		Collections.sort(cs, new Comparator<Cuboid>() {

			@Override
			public int compare(Cuboid o1, Cuboid o2) {
				// TODO Auto-generated method stub
				return c1.sortByArea.compare(o1, o2);
			}

		});
		Assert.assertEquals(6, cs.get(0).area(),0.00001);
		Assert.assertEquals(24, cs.get(1).area(),0.00001);
		Assert.assertEquals(54, cs.get(2).area(),0.00001);
	}


	@Test
	public void testSortByVolume() {
		Cuboid c1 = new Cuboid(1,1,1);
		Cuboid c2 = new Cuboid(2,2,2);
		Cuboid c3 = new Cuboid(3,3,3);
		List<Cuboid> cs = new LinkedList<>();
		cs.add(c2);
		cs.add(c1);
		cs.add(c3);
		Collections.sort(cs, new Comparator<Cuboid>() {

			@Override
			public int compare(Cuboid o1, Cuboid o2) {
				// TODO Auto-generated method stub
				return c1.sortByVolume.compare(o1, o2);
			}

		});
		Assert.assertEquals(1, cs.get(0).volume(),0.00001);
		Assert.assertEquals(8, cs.get(1).volume(),0.00001);
		Assert.assertEquals(27, cs.get(2).volume(),0.00001);
	}

}
