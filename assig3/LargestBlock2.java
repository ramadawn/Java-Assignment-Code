/*
Name: Douglas Oak

Student# : Not Available due to post in public repository

Algorithm Description: This program generates a random array of ones and zeros of any size
and calculates where the largest square of ones is


No functions or external packages were used as part of this program

Version: 0.1.0.2

*/

import java.util.*;

public class LargestBlock {

	public static void main(String[] args){

      //initialize variables
      int width = 6; //field width
      int height = 6; //field height
      int mapLayers =3; //layers bit array bitArrayMap
      int searchWidth;
      int oneChance = 75; //chance of spawning a one in the bitmap
      int largestSquare = 1;
      int posX = 0; //x oordinate top left
      int posY = 0; //y oordinate top left
      int Ymap = 1;
      int Xmap = 0;
	  int TruthMap = 2;

      //initialize arrays
      int [][] bitArray = new int [height][width];
      int [][][] bitArrayMap = new int [height][width][mapLayers];

      //calculate square search area
      searchWidth = searchWidth(width, height);

      //generate bitmap
      bitMapPopulate(bitArray, height, width, oneChance);


      //print out bitmap
      for (int y = 0; y < height; y++){

        System.out.println();
        for(int x = 0; x < width; x++){

          System.out.print(bitArray[y][x] + " ");


        }
      }

      System.out.println();



      //map the bitmap
      for (int y = 0; y < height; y++){
        for(int x = 0; x < width; x++){

          bitArrayMap[y][x][Xmap] = 0;
          bitArrayMap[y][x][Ymap] = 0;
          //create the x map
          for(int i = x; i < searchWidth; i++){
            if(bitArray[y][i]==1){
                bitArrayMap[y][x][Xmap]++;

              }
            else{break;}

        }
          //create the y map
          for(int j = y; j < searchWidth; j++){

            if(bitArray[j][x]==1){
                  bitArrayMap[y][x][Ymap]++;
              }

            else{break;}

          }

          //squring x and y
          if(bitArrayMap[y][x][Xmap] > bitArrayMap[y][x][Ymap]){

             bitArrayMap[y][x][Xmap] = bitArrayMap[y][x][Ymap];

          }

         if(bitArrayMap[y][x][1] > bitArrayMap[y][x][Xmap]){

             bitArrayMap[y][x][1] = bitArrayMap[y][x][Xmap];

          }

          //clean up the map to make it more readable
          if(bitArrayMap[y][x][Xmap] < 2){

             bitArrayMap[y][x][Xmap] = 0;

          }

          if(bitArrayMap[y][x][Ymap] < 2){

              bitArrayMap[y][x][Ymap] = 0;

          }

          //this array maps true or false full square 1 True, 0 False
          //for(int value = bitArrayMap[y][x][Xmap]; value > 1; value--){

          bitArrayMap[y][x][TruthMap] = 1; //assume sqaure is true

          if(y == (height - 1)){bitArrayMap[y][x][TruthMap] = 0;}
          if(x == (width - 1)){bitArrayMap[y][x][TruthMap] = 0;}
            //System.out.println("X " + x + " Y " + y + " VALUE " + bitArrayMap[y][x][TruthMap]);

            int searchSide = bitArrayMap[y][x][Xmap];

          for(int j = y; j < searchWidth && j < (y + searchSide) ; j++){

            for(int i = x; i < searchWidth && i < (x + searchSide); i++){



                if(j > (y + searchSide) && i > (x + searchSide)){break;}
                //System.out.println("I " + i + " J " + j + " Value " + bitArray[i][j] + " Value truth " + bitArrayMap[y][x][TruthMap]);
                if(bitArray[j][i] == 0){
                  bitArrayMap[y][x][TruthMap] = 0;
                  break;
                }
              }
            }

          //Biuld solution if x map is greater than 1 and truth table is 1 you have found a square
           if(bitArrayMap[y][x][Xmap] > largestSquare && bitArrayMap[y][x][TruthMap] == 1){

              largestSquare = bitArrayMap[y][x][Xmap];
              posX = x; //x oordinate top left
              posY = y; //y oordinate top left


           }
          }
        }


      //map out the bit arrays maps
      //print out bitmap
      System.out.println();
      System.out.println();
      System.out.println("X MAP");

      for (int y = 0; y < height; y++){

        System.out.println();
        for(int x = 0; x < width; x++){

          System.out.print(bitArrayMap[y][x][Xmap] + " ");


        }
      }
      System.out.println();
      System.out.println();
      System.out.println("Y MAP");

      for (int y = 0; y < height; y++){

        System.out.println();
        for(int x = 0; x < width; x++){

          System.out.print(bitArrayMap[y][x][Ymap] + " ");


        }
      }

      System.out.println();
      System.out.println();
      System.out.println("Square Truth MAP");

      for (int y = 0; y < height; y++){

        System.out.println();
        for(int x = 0; x < width; x++){

          System.out.print(bitArrayMap[y][x][TruthMap] + " ");


        }
      }


			System.out.println();
			System.out.println();
			System.out.println("Largest Square is " + largestSquare + " * " + largestSquare);
			System.out.println("Top left hand corner can be found at " + posX + " x and " + posY + " y ");





  }
//calculates max search box
static int searchWidth(int width, int height){

        //how big is each side of the search length?

        if(width >= height){

            return height;

          }

          else{

            return width;

          }

       }
//creates bitmap
static void bitMapPopulate(int bitArray[][], int height, int width, int oneChance){

      int rNumber; //random number storage
      //initialize random number object
      Random rand = new Random();

      //visit each column one row at a time
      for (int y = 0; y < height; y++){

        for(int x = 0; x < width; x++){

          //System.out.println("y = " + y + " x = " + x );
          rNumber = rand.nextInt(100);
          //needs to greater than 50 to get proper clustering of ones
          if(rNumber < oneChance){

              bitArray[y][x] = 1;

          }

          else {

              bitArray[y][x] = 0;

          }

        }
      }
  }



}
