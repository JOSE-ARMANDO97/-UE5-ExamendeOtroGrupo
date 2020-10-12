package arregloar;

public class ArregloAr {
    int fila= 3,columna=6;
     int RestFilas[];
     int Arreglo [][]={{9,13,2,5,6,6},
                        {12,3,5,5,1,5},
                        {48,5,3,4,1,5}};
    public static void main(String[] args) {
        ArregloAr A= new  ArregloAr();
        A.MostrarAr();
        A.RestarFILa();
        A.MostrarRestaF();
    }
       
      public void MostrarAr(){
        System.out.println("******************EL ARREGLO ES ******************");
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
               System.out.print("  "+Arreglo[i][j]);
          }
            System.out.println("");
        }
         
    }
    public void RestarFILa(){
        System.out.println("\n");
         RestFilas = new int [Arreglo.length];
        System.out.println("************LA RESTA DE FILAS EN LAS POSICIONES*************** ");
       for(int i=0;i<Arreglo.length;i++){
             for(int j=0;j<Arreglo[i].length;j++){
           if(j==0){
               
               RestFilas[i]= Arreglo[i][j];
           }else{
         
           RestFilas[i]-=Arreglo[i][j];
           }
       }
       
      }
    }
    public void MostrarRestaF(){
       for(int i=0;i<Arreglo.length;i++){
           
                System.out.println("LA RESTA DE LA FILA "+(i+1)+"  ES: =  "+RestFilas[i]);
           System.out.println("");
      }
   }
}

