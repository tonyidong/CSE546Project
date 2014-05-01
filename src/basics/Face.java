package basics;

public class Face {
	
	LineSegment upperSegment, lowerSegment;
	Point upperLeft, lowerRight;

	public Face(LineSegment upperSegment, LineSegment lowerSegment, Point upperLeft, Point lowerRight) {
		// TODO Auto-generated constructor stub
		this.upperSegment = upperSegment;
		this.lowerSegment = lowerSegment;
		this.upperLeft = upperLeft;
		this.lowerRight = lowerRight;
	}

	public LineSegment getUpperSegment() {
		return upperSegment;
	}

	public void setUpperSegment(LineSegment upperSegment) {
		this.upperSegment = upperSegment;
	}

	public LineSegment getLowerSegment() {
		return lowerSegment;
	}

	public void setLowerSegment(LineSegment lowerSegment) {
		this.lowerSegment = lowerSegment;
	}

	public Point getUpperLeft() {
		return upperLeft;
	}

	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}

	public Point getLowerRight() {
		return lowerRight;
	}

	public void setLowerRight(Point lowerRight) {
		this.lowerRight = lowerRight;
	}
	
	

}
