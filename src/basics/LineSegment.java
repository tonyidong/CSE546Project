package basics;

import java.util.ArrayList;

public class LineSegment {
	
	private final Point start, end;
	private final ArrayList<Point> intersects;

	public LineSegment(Point start, Point end) {
		// TODO Auto-generated constructor stub
		this.start = start;
		this.end = end;
		this.intersects = new ArrayList<Point>();
	}

	public Point getStart() {
		return start;
	}

	public Point getEnd() {
		return end;
	}
	
	public void insertPoint(Point point){
		if(intersects.size() == 0){
			intersects.add(point);
		}
		int i = 0;
		while(intersects.get(i).getX() <= point.getX() && i < intersects.size()-1){
			i++;
		}
		intersects.add(i, point);
	}
	
	public void removePoint(Point point){
		intersects.remove(point);
	}
	
	public int getIntersectsSize(){
		return intersects.size();
	}
	
	

}
