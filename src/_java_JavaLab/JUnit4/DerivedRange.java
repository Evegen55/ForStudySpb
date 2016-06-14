/**
 * 
 */
package _java_JavaLab.JUnit4;

import java.util.Iterator;
import java.util.List;

/**
 * @author Evegen
 *
 */
public class DerivedRange implements Range {

	/* (non-Javadoc)
	 * @see _java_JavaLab.JUnit4.Range#isBefore(_java_JavaLab.JUnit4.Range)
	 */
	@Override
	public boolean isBefore(Range otherRange) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see _java_JavaLab.JUnit4.Range#isAfter(_java_JavaLab.JUnit4.Range)
	 */
	@Override
	public boolean isAfter(Range otherRange) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see _java_JavaLab.JUnit4.Range#isConcurrent(_java_JavaLab.JUnit4.Range)
	 */
	@Override
	public boolean isConcurrent(Range otherRange) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see _java_JavaLab.JUnit4.Range#getLowerBound()
	 */
	@Override
	public long getLowerBound() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see _java_JavaLab.JUnit4.Range#getUpperBound()
	 */
	@Override
	public long getUpperBound() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see _java_JavaLab.JUnit4.Range#contains(long)
	 */
	@Override
	public boolean contains(long value) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see _java_JavaLab.JUnit4.Range#asList()
	 */
	@Override
	public List<Long> asList() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see _java_JavaLab.JUnit4.Range#asIterator()
	 */
	@Override
	public Iterator<Long> asIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
