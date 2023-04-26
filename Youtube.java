package exercicio;

public class YouTube {

	public static void main(String[] args) {
		Video v[] = new Video [5];
		v[0] = new Video("Tutorial POO");
		v[1] = new Video("How to learn English faster!");
		v[2] = new Video("Shrek vs Faustão");
		v[3] = new Video("Top 10 tobogãs no Brasil!");
		v[4] = new Video("Ja Morant Highlights 22/23  NBA Season");
		
		Usuario u[] = new Usuario[3];
		u[0] = new Usuario("Gustavo",19,"CoelhoUsagi");
		u[1] = new Usuario("Leticia",21,"AngelOfTheNight");
		u[2] = new Usuario("Marcos",29,"SuperGokuSan");
		
		u[0].viuMaisUm();
		u[0].viuMaisUm();
		u[0].ganharExp();
		System.out.println(u[0].getExperiencia());
		System.out.println(u[0].toString());
		
		Visualizacao vv[] = new Visualizacao[3];
		vv[0] = new Visualizacao(u[0],v[0]);
		vv[1] = new Visualizacao(u[1],v[2]);
		vv[2] = new Visualizacao(u[2],v[3]);
		
		vv[0].avaliar(8);
		vv[1].avaliar();
		vv[2].avaliar(40.3f);
		
		System.out.println(vv[0].toString());
		System.out.println(vv[1].toString());
		System.out.println(vv[2].toString());
		
		
		
	}

}
