package spacecoding.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestPoint{

    public static void main(String[] args) {
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(in);
        double x, y;
        String name, stringaX;
        try{
            System.out.println("Insersci la x");
            stringaX = stdin.readLine();
            x= Double.parseDouble(stringaX);
            System.out.println("Inserisci la y");
           y=Double.parseDouble(stdin.readLine());
            System.out.println("Inserisci il nome del punto");
            name=stdin.readLine();

            // Costruite il punto con i dati letti da standard input
            Point p1 = new Point(x,y,name);
            System.out.println(p1.toString());

        }catch(IOException e){
            System.out.println("Non è stato possibile leggere da standard input");
        }
    //    Point p1 = new Point(2,3,"A");

    //    Point p2 = new Point(4,3,"B");

    //    double dist1 = p1.distance(p2);
    //    double dist2 = p2.distance(p1);

    //    System.out.println("La distanza tra i due punti : " + dist1);
    //    System.out.println("La distanza tra i due punti : " + dist2);
    }
}