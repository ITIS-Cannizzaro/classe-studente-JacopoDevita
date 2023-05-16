import java.util.Scanner;
public class Devita {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int x=10;
		int i;
		String j;
		Studente studente = new Studente(null, 0);
		studente.Studentedef();
		String nome;
		int anno;
		System.out.println("1 per usare il default");
		System.out.println("2 per usare il parametrico");
		x=a.nextInt();
		if (x==1) {
		}
		else if (x==2) {
			System.out.println("nome");
			nome=a.next();
			studente.SetNome(nome);
			System.out.println("anno");
			anno=a.nextInt();
			studente.SetAnno(anno);;
		}
		while (x!=0){
		System.out.println("0 per uscire dal programma");
		System.out.println("1 per cambiare nome");
		System.out.println("2 per cambiare l'anno");
		System.out.println("3 per stampare il tutto");
		System.out.println("4 per confrontare l'età dello studente 2");
		x=a.nextInt();
		if (x==1) {
			System.out.println("nome");
			nome=a.next();
			studente.SetNome(nome);
		}
		else if (x==2) {
			System.out.println("anno");
			anno=a.nextInt();
			studente.SetAnno(anno);
		}
		else if (x==3) {
			System.out.println(studente.toString());
		}
		else if(x==4) {
			System.out.println("anno studente 2");
			i=a.nextInt();
			System.out.println("nome studente 2");
			j=a.next();
			studente.confronto(i, j);
		}
		}
		
	}
}

