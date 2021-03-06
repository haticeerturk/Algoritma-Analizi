/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kmeans;

/**
 *
 * @author BM
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Util {
    
    public static double toParse(double d){
    	double resultado;
    	Locale locale  = new Locale("en", "UK");
        String pattern = "###.##";

        DecimalFormat decimalFormat = (DecimalFormat)
                NumberFormat.getNumberInstance(locale);
        decimalFormat.applyPattern(pattern);

        String format = decimalFormat.format(d);
        resultado = Double.parseDouble(format);
        return resultado;
    }
    
    public static void plotInicialMessage(int numPoints, int munClusters, int minCoordinate, int maxCoordinate){
    	
    	StringBuilder s = new StringBuilder();
    	
    	s.append("############################################################	\n");
    	s.append("# K-MEANS ALGORITHM 											\n");
    	s.append("############################################################	\n");
    	s.append("# Data entry:													\n");
    	s.append("#  Number of Clusters\t: " + munClusters + "\n");
    	s.append("#  Number of Points \t: " + numPoints + "\n");
    	s.append("#  Points : Are generated randomly taking values from "+minCoordinate+" to "+maxCoordinate+"	\n");
    	s.append("#           in the cartesian plane  \n");
    	s.append("############################################################	\n");
    	System.out.println(s.toString());
    	
    }
    
    public static void plotPoins(List<Point> points){
    	System.out.println("List of "+points.size() +" points generated randomly:");
    	for(Point p: points){
    		System.out.println("-" + p.toString());
    	}
    	System.out.println("\n");
    }
    
}
