import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class RobotInGrid {

	/**
	 * @param args
	 */
	static class Point{
		int x;
		int y;
		
		Point(int x, int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int r= scan.nextInt();
		int c= scan.nextInt();
		int maze[][] = new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				maze[i][j]= scan.nextInt();
		ArrayList<Point> path = getPath(maze);
	}

	private static ArrayList<Point> getPath(int[][] maze) {
		// TODO Auto-generated method stub
		if(maze.length==0 || maze==null)
			return null;
		ArrayList<Point> path= new ArrayList<Point>();
		HashSet<Point> offPoints= new HashSet<Point>();
		if(getPath(maze, maze.length-1, maze[0].length-1, path, offPoints))
			return path;
		return null;
	}

	private static boolean getPath(int[][] maze, int row, int col,
			ArrayList<Point> path, HashSet<Point> offPoints) {
		// TODO Auto-generated method stub
		if(row<0 || col<0 || maze[row][col]==0)
			return false;
		
		Point p= new Point(row,col);
		boolean isAtOrigin = (row==0) && (col==0);
		
		if(offPoints.contains(p))
			return false;
		
		if(isAtOrigin || getPath(maze, row-1,col, path, offPoints) || getPath(maze, row, col-1, path, offPoints)){
			path.add(p);
			return true;
		}
		offPoints.add(p);
		return false;
	}
}
