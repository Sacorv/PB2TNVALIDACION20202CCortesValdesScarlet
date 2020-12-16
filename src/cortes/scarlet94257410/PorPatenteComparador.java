package cortes.scarlet94257410;

import java.util.Comparator;

public class PorPatenteComparador implements Comparator<Camion>{

	@Override
	public int compare(Camion tienda1, Camion tienda2) {
		
		return tienda1.getPatente().compareTo(tienda2.getPatente());
	}

}
