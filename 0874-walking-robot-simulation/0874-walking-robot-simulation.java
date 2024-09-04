class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
		int facing = 1;
		int[] loc = {0, 0};
		int output = 0;
		
		for(int c : commands){
			if(c < 0){
				facing = func_facing(facing, c);
			}else{
				loc = func_loc(loc, facing, c, obstacles);
				output = Math.max(output, loc[0] * loc[0] + loc[1] * loc[1]);
			}
		}
		
		return output;
    }
	
	public int func_facing(int f, int c){
		// facing +Y = 1, -Y = -1, +X = 2, -X = -2
		if(f == 1 && c == -1){
			f = 2; // +X
		}else if(f == 1 && c == -2){
			f = -2; // -X
		}else if(f == -1 && c == -1){
			f = -2; // -X
		}else if(f == -1 && c == -2){
			f = 2; // +X
		}else if(f == 2 && c == -1){
			f = -1; // -Y
		}else if(f == 2 && c == -2){
			f = 1; // +Y
		}else if(f == -2 && c == -1){
			f = +1; // +Y
		}else if(f == -2 && c == -2){
			f = -1; // -Y
		}
		
		return f;
	}
	
	public int[] func_loc(int[] loc, int f, int c, int[][] obstacles){
		int x = loc[0], y = loc[1];
		
		while(c > 0){
			if(f == 1) y++;
			else if(f == -1) y--;
			else if(f == 2) x++;
			else if(f == -2) x--;
			
			for(int i = 0; i < obstacles.length; i++){
				int o_x = obstacles[i][0], o_y = obstacles[i][1];
				if(o_x == x && o_y == y){
					c = 0;
					
					if(f == 1) y--;
					else if(f == -1) y++;
					else if(f == 2) x--;
					else if(f == -2) x++;
					
					break;
				}
			}
			c--;
		}
		
		return new int[] {x, y};
	}
}