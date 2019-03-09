/*
Name: Douglas Oak

Student# : Not Available due to post in public repository

Algorithm Description: This program generates a random array of ones and zeros of any size
and calculates where the largest square of ones is


No functions or external packages were used as part of this program

Version: 0.1.0.0

*/

import java.util.*;

public class LargestBlock {
	
	public static void main(String[] args){


		//initialize width and hieght
		int width = 5;
		int height = 5;
		
		//objects for generating randowm numbers
		Random rand = new Random();
		int rNumber;

		//initializing arrays
		int[][][] bitArrayMap = new int [width][height][2];
		int[][] bitArray = new int [width][height];
		
		
		//generating random arrays
		for (int x = 0; x < width; x++){
			for (int y = 0; y < height; y++){
				
				rNumber = rand.nextInt(100);
				if (rNumber < 30){
					
					bitArray[x][y] = 0;
					
				}
				
				else {
					
					bitArray[x][y] = 1;
					
				}
				
			}
		}

		//length mapping array
		
		for (int y = 0; y < height; y++){
			
			for (int x = 0; x < width; x++){

				bitArrayMap[x][y][0] = 0;
		
				if (bitArray[x][y] == 1){
	
					for(int j = x; j < width; j++){
		
						if (bitArray[j][y] == 1){
				
							bitArrayMap[j][y][0] = bitArrayMap[j][y][0] + 1; 
			
						}
			
						else {
				
				
							break;
				
						}
			
					}			
	
				}

			}

		}
		
		//Hieght mapping array
		

			for (int y = 0; y < height; y++){
				
				for (int x = 0; x < width; x++){

				bitArrayMap[x][y][1] = 0;
		
				if (bitArray[x][y] == 1){
	
					for(int j = x; j < height; j++){
		
						if (bitArray[x][j] == 1){
				
							bitArrayMap[x][y][1] = bitArrayMap[x][y][1] + 1; 
			
						}
			
						else {
				
				
							break;
				
						}
			
					}			
	
				}

			}

		}
		
		//array for storing bitmap meta data
		int[][] rowLongest = new int[width][3];
		int max = 0;
		int position = 0;
		
		System.out.println();
		System.out.println("Actual Bit map");
		System.out.println();
		
		for (int x = 0; x < width; x++){
			System.out.println();
			for (int y = 0; y < height; y++){
				System.out.print(bitArray[x][y]);
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("Map of Number of ones in front row");
		System.out.println();
		//mapping ones in front
		
		for (int y = 0; y < height; y++){
			max = 0;
			position = 0;
			
			for (int x = 0; x < width; x++){

				System.out.print(bitArrayMap[x][y][0] + " ");
				
				if (bitArrayMap[x][y][0] > max){
					max = bitArrayMap[x][y][0];
					position = y;
				}

			}
			System.out.println();
			rowLongest[x][0] = position;
			rowLongest[x][1] = max;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Map of Number of ones in below column");
		System.out.println();
		//map of ones below
		for (int x = 0; x < width; x++){
			System.out.println();
			for (int y = 0; y < height; y++){
		
			System.out.print(bitArrayMap[x][y][1] + " ");
		
			}
		}
		
		System.out.println();
		System.out.println("Position of longest string of ones in each row and length");
		System.out.println();
		
		//mapping largest square
		for (int x = 0; x < width; x++){
			
			System.out.print("[" + rowLongest[x][0] + "," + rowLongest[x][1] + "] , ");
			
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Row with longest x and y length");
		System.out.println();
		
		for (int x = 0; x < (width); x++){
			
			rowLongest[x][2] = 0;
			for (int j = x; j < (width -1); j++){
				
				if(rowLongest[x][0] == rowLongest[j][0] && rowLongest[x][1] == rowLongest[j][1]){
					
					rowLongest[x][2]++; 	
				
				}
				
				else { break;}
				
			}
			
			System.out.print(rowLongest[x][2] + ", ");
		
		}
		
		int largest = 0;
		int startX = 0; //top left x coordinate
		int endX = 0; //top right coordinate
		int startY = 0; //top right y coordinate
		int endY = 0; //bottom right y coordinate
		int lengthX = 0; //width
		int lengthY = 0; //height
		
		for (int x = 0; x < (width); x++){
		
			if(rowLongest[x][2] > largest){
				
				startX = rowLongest[x][0];
				endX = rowLongest[x][0] + rowLongest[x][1];
				startY = x;
				endY = x + rowLongest[x][1]; 
				
			}
		
		}
		
		lengthX = endX - startX;
		lengthY = endY - startY;
		
		System.out.println();
		System.out.println();
		System.out.println("The largest Square of ones is " + lengthX + " by " + lengthY);
		System.out.println("running " + startX + " to " + endX);
		System.out.println("and " + startY + " to " + endY);
		
	}
}