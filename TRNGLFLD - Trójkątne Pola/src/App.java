import java.util.*;

import static java.lang.Math.abs;

public class App {
    public static void main(String[] args) {

        //getting number of cases
        Scanner input = new Scanner( System.in );
        Integer numberOfCases = 0;
        //check if input is correct
        do{
            numberOfCases = input.nextInt();

        }while (numberOfCases <= 0 || numberOfCases > 50);

        for(int i  = 0 ; i < numberOfCases; i++){
            Set<Point> pointList = new HashSet<>();
            Integer numberOfPoints = 0;

            //check if input is correct
            do{

                numberOfPoints = input.nextInt();
            }
            while (numberOfPoints % 3 != 0 || numberOfPoints < 3 || numberOfPoints > 45000);

            //getting points from user
            for(int j = 0; j < numberOfPoints; j++){
                Integer x = 0;
                Integer y = 0;
                do{
                    x = input.nextInt();
                    y = input.nextInt();
                }while ( x < -1000000000 || x > 1000000000  || y < -1000000000 || y > 1000000000 );

                Point point = new Point(x,y,j + 1);
                pointList.add(point);
            }

            Integer howManyTriangles = numberOfPoints/3;

            for(int k = 0; k < howManyTriangles; k++){

                //Point[] points = (Point[]) pointList.toArray();
                Point[] points = new Point[pointList.size()];
                pointList.toArray(points);

                Point theBiggestX = points[0];
                Point theSmallestX = points[0];
                Point theBiggestY = points[0];

                Integer numberOfFoundPoints =0;

                //first we are looking for point with biggest x value
                //next we search for point with lowest y
                //at the end we are looking for point with biggest |y| value
                //after finding three points we delete them from list and repeat sequence
                for (Point point: pointList){

                    if(point.getX() > theBiggestX.getX()){
                        theBiggestX = point;
                    }

                    if(point.getX() < theSmallestX.getX()){
                        theSmallestX = point;
                    }

                    if(abs(point.getY()) > abs(theBiggestY.getY())){
                        theBiggestY = point;

                    }
                }

                //integers list is here to sort the output
                List<Integer> integers = new ArrayList<>();
                integers.add(theBiggestX.getId());
                integers.add(theBiggestY.getId());
                integers.add(theSmallestX.getId());

                Collections.sort(integers);

                System.out.println(integers.get(0) + " " + integers.get(1) + " " + integers.get(2));

                //removing found points to look for another triangle
                pointList.remove(theSmallestX);
                pointList.remove(theBiggestY);
                pointList.remove(theBiggestX);
            }

            System.out.println();
        }

    }
}
