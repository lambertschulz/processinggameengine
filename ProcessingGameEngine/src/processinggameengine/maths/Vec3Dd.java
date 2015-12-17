package processinggameengine.maths;

public class Vec3Dd {
	private double x = 0;
	private double y = 0;
	private double z = 0;

	public Vec3Dd(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/*
	 * ADDITION
	 */
	// with Vector
	public void add(Vec3Di b) {
		this.x += (double) b.getX();
		this.y += (double) b.getY();
		this.z += (double) b.getZ();
	}

	public void add(Vec3Dd b) {
		this.x += b.getX();
		this.y += b.getY();
		this.z += b.getZ();
	}

	// with Number
	public void add(int b) {
		this.x += b;
		this.y += b;
		this.z += b;
	}

	public void add(double b) {
		this.x += (int) b;
		this.y += (int) b;
		this.z += (int) b;
	}

	/*
	 * SUBTRAKTION
	 */
	// with Vector
	public void subtract(Vec3Di b) {
		this.x -= (double) b.getX();
		this.y -= (double) b.getY();
		this.z -= (double) b.getZ();
	}

	public void subtract(Vec3Dd b) {
		this.x -= b.getX();
		this.y -= b.getY();
		this.z -= b.getZ();
	}

	// width Number
	public void subtract(int b) {
		this.x -= b;
		this.y -= b;
		this.z -= b;
	}

	public void subtract(double b) {
		this.x -= b;
		this.y -= b;
		this.z -= b;
	}

	/*
	 * MULTIPLIKATION
	 */
	// by Vector
	public void multiply(Vec3Di b) {
		this.x *= (double) b.getX();
		this.y *= (double) b.getY();
		this.z *= (double) b.getZ();
	}

	public void multiply(Vec3Dd b) {
		this.x *= b.getX();
		this.y *= b.getY();
		this.z *= b.getZ();
	}

	// by Number
	public void multiply(int b) {
		this.x *= b;
		this.y *= b;
		this.z *= b;
	}

	public void multiply(double b) {
		this.x *= b;
		this.y *= b;
		this.z *= b;
	}

	/*
	 * OTHER FUNKTIONS
	 */

	public double length() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ", " + this.z + ")";
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
	
	public void moveZ(int b) {
		this.z += b;
	}

	public void moveZ(double b) {
		this.z += b;
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
	
	public double getZ() {
		return this.z;
	}

}
