package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
if (x==0 && y==0){
	        System.out.println( "zero");}
	        else if ((x == 4 && (y == 0 || y == 1 || y == 2 || y ==3 || y== 4)) || (x==0 && y ==4)){
	            System.out.println("first"); }
	        else if ((x == 3 && (y == 0 || y == 1 || y == 2 || y ==3))|| (x==0 && y ==3)){
	             System.out.println("second"); }
	             else if ((x == 2 && (y == 0 || y == 1 || y == 2 ))|| (x==0 && y ==2)){
	             System.out.println("third"); }
	             else if ((x == 3 && (y == 0 || y == 1 || y == 2 || y ==3))|| (x==0 && y ==1)){
	             System.out.println("fourth"); }
    }
}
