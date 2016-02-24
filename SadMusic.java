
public class SadMusic {

	public static void main(String[] args){
		int[][] array = {{1,0,0,0},{1,0,0,0},{1,0,0,0},{1,1,1,0},{1,0,0,0},{1,0,0,0},{1,0,0,0},{1,1,9,0}};
		getTheCheese(array);
	}
	public static void getTheCheese(int[][] maze){
		boolean[][] bool = new boolean[maze.length][maze[1].length];
		if(cheeseUtil(bool, maze, 0,0)) 
			System.out.print(1);
		else 
			System.out.print(0);
	}


	static boolean cheeseUtil(boolean[][] bool, int[][] maze, int i, int j){
		bool[i][j] = true;
		if (maze[i][j] == 0)
			return false;
		if(maze[i][j] == 9){
			System.out.println("true");
			return true;
		}

		if(i<maze[1].length-1 ){
			
			if(!bool[i+1][j]){
				
				if(cheeseUtil(bool, maze, i+1, j))
					System.out.print("down");
					return true;
			}
		}
		if(j<maze.length-1){
			if(!bool[i][j+1]){
				if(cheeseUtil(bool, maze, i, j+1))
					
					return true;
			}
		}
		if(i>0){
			if(!bool[i-1][j]){

				if(cheeseUtil(bool, maze, i-1, j))
					
					return true;
			}
		}
		if(j>0){
			if(!bool[i][j-1]){
				if(cheeseUtil(bool, maze, i, j-1))
					return true;
			}
		}
		return false;

	}
}
