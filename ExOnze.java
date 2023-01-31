import java.util.*;

class ExOnze{
    /**
     * Calcular a nota semestral
     * nota = media de 3 bimestres
     * cada bimestres tem 3 provas
     */
    
    public static void main(String[] args) {
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Digite as notas das provas do 1° Bimestre");
        double provaUmBiUm = sc.nextDouble();
        double provaDoisBiUm = sc.nextDouble();
        double provaTresBiUm = sc.nextDouble();
        double notaBimestreUm = (provaUmBiUm+provaDoisBiUm+provaTresBiUm)/3d;
        
        System.out.println("Digite as notas das provas do 2° Bimestre");
        double provaUmBiDois = sc.nextDouble();
        double provaDoisBiDois = sc.nextDouble();
        double provaTresBiDois = sc.nextDouble();
        double notaBimestreDois = (provaUmBiDois+provaDoisBiDois+provaTresBiDois)/3d;
  
        System.out.println("Digite as notas das provas do 3° Bimestre");
        double provaUmBiTres = sc.nextDouble();
        double provaDoisBiTres = sc.nextDouble();
        double provaTresBiTres = sc.nextDouble();
        double notaBimestreTres = (provaUmBiTres+provaDoisBiTres+provaTresBiTres)/3d;
        
        double mediaSemestre = (notaBimestreUm+notaBimestreDois+notaBimestreTres)/3d;
        
        System.out.println("A média do Semestre foi: "+mediaSemestre);
            if (mediaSemestre >= 7){
                System.out.println("Aprovado");
            } else if(mediaSemestre >=5){
                System.out.println("Recuperação");
            }else{
                System.out.println("Reprovado");
            }
    }
} 