package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListaPaginaRanking {
	
	List<PaginaRanking> listaPagina;
	
	public ListaPaginaRanking () {
		listaPagina = new ArrayList<PaginaRanking>();
	}
	
	public List<PaginaRanking> getListaPagina() {
		return listaPagina;
	}
	
	private PaginaRanking buscaPaginaRanking(IPagina pagina){
		PaginaRanking paginaRanking = null;
		IPagina paginaComparada = null;
		Iterator<PaginaRanking> iterator = listaPagina.iterator();
		
		while (iterator.hasNext()) //enquanto houver elementos na lista
		{
			paginaRanking = iterator.next();
			paginaComparada = paginaRanking.getPagina();
			if (paginaComparada.getNome().equals(pagina.getNome()))
				return paginaRanking;
		}
		return null;
	}
	
	public void adicionaPagina (IPagina pagina) {
		PaginaRanking paginaRanking = buscaPaginaRanking(pagina);
		
		if (paginaRanking != null){
			paginaRanking.incrementadorAmigoRanking();
		}else{
			PaginaRanking addPagina = new PaginaRanking(pagina);
			listaPagina.add(addPagina);
		}
	}
	
	public void ordenarRanking() {
		System.out.println("Ordenando p�ginas...");
        Collections.sort(listaPagina, new Comparator<PaginaRanking>() {
            @Override  
            public int compare(PaginaRanking o1, PaginaRanking o2) {  
                return o1.getPopularidade().compareTo(o2.getPopularidade());
            }  
        }				);
        
        System.out.println("P�ginas ordenadas.");
	}
	
	/**
	 * Aplica �s p�ginas curtidas pelos amigos do usu�rio, o �ndice de popularidade baseado em categorias mais curtidas pelo usu�rio.
	 * @param listaStrings Lista de Strings contendo as categorias mais curtidas pelo usu�rio
	 */
	public void aplicarCategoriasMaisCurtidas(List<String> listaStrings){
		System.out.println("Aplicando �ndices de categoria...");
		PaginaRanking paginaRanking = null;
		Iterator<PaginaRanking> iterator = listaPagina.iterator();
		
		for (int i = 0; i < listaStrings.size(); i++) //para cada String da lista recebida como par�metro
		{//percorre a lista de p�ginas curtidas
			while (iterator.hasNext()) //enquanto houver elementos na lista
			{
				 paginaRanking = iterator.next(); //pega uma p�gina curtida
				 if (paginaRanking.getPagina().getCategoria().equals(listaStrings.get(i))) //se a categoria dessa p�gina for uma das categorias que o usu�rio tem mais interesse
					 paginaRanking.incrementadorCategoria(); //aplicar �ndice.
			}
		}
	System.out.println("�ndices de categoria aplicados.");
	}
	
	
	
	
	
	
	
}