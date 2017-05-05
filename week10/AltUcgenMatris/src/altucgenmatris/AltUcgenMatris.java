/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altucgenmatris;

/**
 *
 * @author BM
 */
public class AltUcgenMatris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m[][] = new int[][]{{1,2,3},{0,4,5},{0,0,6}};
        double sonuc[][] = new double[][]{{30},{30},{30}};
        
        System.out.println("Alt Üçgen Matris: ");
        for(int i=0; i < m.length; i++){
            for(int j=0; j < m[0].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        carpilanMatrisiBul(m, sonuc);
    }
    
    public static void carpilanMatrisiBul(int[][] m, double[][] sonuc){
        System.out.println("det: "+determinant(m));
        int det = determinant(m);
        System.out.println("iki: "+(m[0][2]*m[2][1]-m[0][1]*m[2][2])/det);
        double matrisTersi[][] = {{(m[1][1]*m[2][2]-m[1][2]*m[2][1])/det, (m[0][2]*m[2][1]-m[0][1]*m[2][2])/det, (m[0][1]*m[1][2]-m[0][2]*m[1][1])/det},
                                {(m[1][2]*m[2][0]-m[1][0]*m[2][2])/det, (m[0][0]*m[2][2]-m[0][2]*m[2][0])/det, (m[0][2]*m[1][0]-m[0][0]*m[1][2])/det},
                                {(m[1][0]*m[2][1]-m[1][1]*m[2][0])/det, (m[0][1]*m[2][0]-m[0][0]*m[2][1])/det, (m[0][0]*m[1][1]-m[0][1]*m[1][0])/det}};
 
        for(int i=0; i < matrisTersi.length; i++){
            for(int j=0; j < matrisTersi[0].length; j++){
                System.out.print(matrisTersi[i][j] + " ");
            }
            System.out.println();
        }
        
        double[][] ortaMatris = new double[m.length][sonuc[0].length];

        for(int i=0; i < matrisTersi.length; i++){
            for(int j=0; j < sonuc[0].length; j++){
                for(int k=0; k < sonuc.length; k++){
                    ortaMatris[i][j] = ortaMatris[i][j] + matrisTersi[i][k] * sonuc[k][j];
                }
            }
        }
        
        System.out.println("Orta Matris: ");
        for(int i=0; i < ortaMatris.length; i++){
            for(int j=0; j < ortaMatris[0].length; j++){
                System.out.print(ortaMatris[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
    public static int determinant(int[][] matrix){
        int sum=0; 
        int s;
        
        if(matrix.length==1){
          return(matrix[0][0]);
        }
        
        for(int i=0;i<matrix.length;i++){ 
          int[][]smaller= new int[matrix.length-1][matrix.length-1]; 
          for(int a=1;a<matrix.length;a++){
            for(int b=0;b<matrix.length;b++){
              if(b<i){
                smaller[a-1][b]=matrix[a][b];
              }
              else if(b>i){
                smaller[a-1][b-1]=matrix[a][b];
              }
            }
          }
          if(i%2==0){
            s=1;
          }
          else{
            s=-1;
          }
          sum+=s*matrix[0][i]*(determinant(smaller));
        }
        return(sum);
   }
    
}
