/**
 * 
 */
package dimigo.org.exception;

/**
 * <pre>
 * dimigo.org.exception
 *  |_ Movie
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 *
 * @author	: 양권우
 * @version	: 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	/**
	 * @param title
	 * @param limitAge
	 */
	public Movie(String title, int limitAge) {
		super();
		this.title = title;
		this.limitAge = limitAge;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the limitAge
	 */
	public int getLimitAge() {
		return limitAge;
	}
	
	
}
