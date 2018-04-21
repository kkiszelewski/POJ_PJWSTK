package samochody;

import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Ogloszenie> lista = new ArrayList<Ogloszenie>();
		lista.add(new Ogloszenie(new Samochod("Opel", "Corsa", 2000, 150000),
				LocalDateTime.now()));
		lista.add(new Ogloszenie(new Samochod("Fiat", "125", 1989, 300000),
				LocalDateTime.of(1995, Month.MAY, 17, 0, 0, 0)));
		lista.add(new Ogloszenie(new Samochod("FSO", "Warszawa", 1970, 400000),
				LocalDateTime.of(1980, Month.JUNE, 27, 0, 0, 0)));

//		lista.sort(Comparator.comparing(ogl -> ogl.getSamochod().getRocznik()));
//		lista.sort(new RocznikComparator());
		Collections.sort(lista, new RocznikComparator());
		System.out.println(lista);
		
		System.out.println("FILTER");
		lista.stream().filter(ogl -> ogl.getSamochod().getRocznik() > 1990);
		System.out.println(lista);
		
	}

}