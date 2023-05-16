public class Studente{
	public int anno;
	public String nome;
	public Studente(String nome, int anno) {
		this.nome=nome;
		this.anno=anno;
	}
	public void Studentedef() {
		this.nome="Jacopo";
		this.anno=2006;
	}
	
	public void SetAnno(int anno) {
		this.anno=anno;
	}
	public int getAnno() {
		return this.anno;
		
	}
	public void SetNome(String nome) {
		this.nome=nome;
	}
	public String toString() {
		return ("lo studente "+this.nome+" è nato nel "+this.anno);
		
	}
	public void confronto(int anno2,String nome2) {
		if (this.anno==anno2) {
			System.out.println(this.nome +" e "+nome2+" sono coetanei");
		}
		else if (this.anno<anno2) {
			System.out.println(nome2+" è più giovane di "+this.nome);
		}
		else {
			System.out.println(this.nome+" è più giovane di "+nome2);
		}
	}
}
