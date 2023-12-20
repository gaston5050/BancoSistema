package negocioImplementado;

import java.util.ArrayList;

import dao.IDaoProvincia;
import daoImplementado.DaoProvinciaImplementado;
import entidades.Provincia;
import negocio.INegocioProvincia;

public class NegocioProvinciaImplementado implements INegocioProvincia{

	@Override
	public ArrayList<Provincia> leerTodas() {
		ArrayList <Provincia> listaP = new ArrayList<Provincia> ();
		IDaoProvincia dp = new DaoProvinciaImplementado();
		
		listaP = dp.leerTodas();
		listaP.forEach(System.out::println);
		
		System.out.println("llego a negocio prov ");
		return listaP;
	}

}
