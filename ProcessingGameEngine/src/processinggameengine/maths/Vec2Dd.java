package processinggameengine.maths;

public class Vec2Dd {

	private double x = 0;
	private double y = 0;

	public Vec2Dd(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * ADDITION
	 */
	// with Vector
	public void add(Vec2Di b) {
		this.x += b.getX();
		this.y += b.getY();
	}

	public void add(Vec2Dd b) {
		this.x += (int) b.getX();
		this.y += (int) b.getY();
	}

	// with Number
	public void add(int b) {
		this.x += b;
		this.y += b;
	}

	public void add(double b) {
		this.x += b;
		this.y += b;
	}

	/*
	 * SUBTRAKTION
	 */
	// with Vector
	public void subtract(Vec2Di b) {
		this.x -= b.getX();
		this.y -= b.getY();
	}

	public void subtract(Vec2Dd b) {
		this.x -= b.getX();
		this.y -= b.getY();
	}

	// width Number
	public void subtract(int b) {
		this.x -= b;
		this.y -= b;
	}

	public void subtract(double b) {
		this.x -= b;
		this.y -= b;
	}

	/*
	 * MULTIPLIKATION
	 */
	// by Vector
	public void multiply(Vec2Di b) {
		this.x *= b.getX();
		this.y *= b.getY();
	}

	public void multiply(Vec2Dd b) {
		this.x *= b.getX();
		this.y *= b.getY();
	}

	// by Number
	public void multiply(int b) {
		this.x *= b;
		this.y *= b;
	}

	public void multiply(double b) {
		this.x *= b;
		this.y *= b;
	}

	/*
	 * OTHER FUNKTIONS
	 */

	public double length() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}

	public void moveX(int b) {
		this.x += b;
	}

	public void moveX(double b) {
		this.x += b;
	}

	public void moveY(int b) {
		this.y += b;
	}

	public void moveY(double b) {
		this.y += b;
	}

	/*
	 * GETTER & SETTER
	 */

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

}
