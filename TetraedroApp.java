//Aplicação para calcular o volume do tetraedro com inserção de vértices de 3 elementos
//Glauber Monteiro

import java.util.Arrays;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TetraedroApp {

	public static void main(String[] args) {
	int	qtd_vertices ;
	Double resultado,n1,n2,n3,ABpos1,ABpos2,ABpos3;
    Double [] VetorPE = new Double [3];
	Double um_sexto= 0.1666666666666667; // 1/6 do volume do paralelepípedo
	Double[] A= new Double[3];
	Double[] B= new Double[3];
	Double[] C= new Double[3];
	Double[] D= new Double[3];
	Double [] ABvet = new Double[3];
	Double [] ACvet = new Double[3];
	
	Double [] ADvet = new Double[3];
    
	DecimalFormat formatar_decimal = new DecimalFormat("#0.00");
    qtd_vertices = Integer.valueOf(JOptionPane.showInputDialog(null, "Programa feito para calcular o volume do tetraedro ABCD"+"\n"
    		+"Digite a Quantidade de vertices.: "));
		if (qtd_vertices == 4){

			for(int i =0 ; i <= qtd_vertices-2; i++){
				
				A[i] = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o "+ (i+1) + "º elemento do vertice A.:"));
			}
			
			for(int i =0 ; i <= qtd_vertices-2; i++){
				B[i] = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o "+ (i+1) + "º elemento do vertice B.:"));	
			}
			
			for(int i =0 ; i <= qtd_vertices-2; i++){
				
				C[i] = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o "+ (i+1) + "º elemento do vertice C.:"));	
			}
			for(int i =0 ; i <= qtd_vertices-2; i++){
				
				D[i] = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o "+ (i+1) + "º elemento do vertice D.:"));	
			}
			JOptionPane.showMessageDialog(null,"O vertice A ="+ Arrays.toString(A)+"\n"
			+"O vertice B ="+ Arrays.toString(B)+"\n"
			+"O vertice C ="+Arrays.toString(C)+"\n"
			+"O vertice D ="+Arrays.toString(D)+"\n"+
			"Clique em OK para calcular"+"\n"
			+" o vol do tetraedro");
            
			for(int i =0 ; i <= qtd_vertices-2; i++){	
        	   ABvet[i]=B[i]-A[i];
        	   ACvet[i]=C[i]-(A[i]);     // calcula os vetores
        	   ADvet[i]=D[i]-A[i];
            }
          
              VetorPE[0] = (ACvet[1]*ADvet[2])-(ACvet[2]*ADvet[1]); // calculo de produto escalar
              VetorPE[1] = (ACvet[2]*ADvet[0])-(ACvet[0]*ADvet[2]);
              VetorPE[2] = (ACvet[0]*ADvet[1])-(ACvet[1]*ADvet[0]); 
          
              n1=VetorPE[0]; 
              n2=VetorPE[1];
              n3=VetorPE[2];
         
              ABpos1 =ABvet[0];
              ABpos2 =ABvet[1];
              ABpos3 =ABvet[2];
          
              resultado = (ABpos1*n1)+(ABpos2*n2)+(ABpos3*n3);
           
              if (resultado <0){    // módudo matemático |resultado|
        	      resultado= resultado*-1;
             }

              JOptionPane.showMessageDialog(null,""+"\n"
             +"O vetor AB ="+ Arrays.toString(ABvet)+"\n"	  
             +"O vetor AC ="+ Arrays.toString(ACvet)+"\n"
             +"O vetor AD ="+ Arrays.toString(ADvet)+"\n"
             + "Clique em OK para continuar o calculo...");
        // formatar resultado
     
            JOptionPane.showMessageDialog(null," Resultado do Produto escalar ACXAD ="+ Arrays.toString(VetorPE)+"\n"
            +"O Produto Misto de AB.|(ACXAD)| .: "+resultado+"\n"
            +"Resultado do volume do tetraedro .: "+formatar_decimal.format(resultado*um_sexto)+"u.v ( UNIDADE DE VOLUME )" );
  
        
	  }
	  
            if (qtd_vertices !=4){
			
			  JOptionPane.showMessageDialog(null,"Digite o valor 4, o tetraedro ABCD possui 4 vertices - reinicie o programa");			
		}

	}
	
}


