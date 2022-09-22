package explorandoExcecoes;

import java.util.Scanner;

public class Vetor implements Preenchimento{
	protected int[] pre;
	protected int[] index;
	
	
	public Vetor() {
		this.pre = new int[10];
		this.index = new int[10];
	}
	
	@Override
	public void preencheVetor() throws Exception{
		int valor = 0, posicao = 0, chave = 0;
		Scanner in = new Scanner(System.in);
		do {
			try {
				System.out.println("Insira o valor inteiro que você deseja: ");
				valor = Integer.parseInt(in.nextLine());
				System.out.println("Insira a posição que você deseja: ");
				posicao = Integer.parseInt(in.nextLine());
				
				while(buscaSequencial(this.index, posicao, 10)!=-1) {
					System.out.println("Valor já preenchido na posição "+posicao+".");
					System.out.println("Insira o valor inteiro que você deseja: ");
					valor = Integer.parseInt(in.nextLine());
					System.out.println("Insira a posição que você deseja: ");
					posicao = Integer.parseInt(in.nextLine());
				}
				this.index[chave] = posicao;
				this.pre[posicao] = valor;
				chave++;

			} catch (IndexOutOfBoundsException e){
				System.out.println("Posição indevida!");
			} catch (NumberFormatException e) {
				System.out.println("VocÊ deve passar um inteiro");
			}

		} while(chave<10);
		
	}
	
	
	public static int buscaSequencial (int v[], int procurado, int n) {
		int i;
		boolean achou = false;
		for (i = 0; i < n; i++) {
		if (v[i] == procurado) {
		achou = true;
		break;
		}
		}
		if (achou == true) {
		return i; // retorna a posição onde encontrou a chave
		}
		else {
		return -1; // retorna -1 indicando que não achou a chave
		}
	}
    


    public String toString(){
        String result="";
        int i;

        for(i=0;i<=this.pre.length-1;i++){
            result+=this.pre[i]+" ";
        }
        return result;
    } 
    
    

}
