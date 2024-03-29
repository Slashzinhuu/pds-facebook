package grafo;

import java.util.ArrayList;
import java.util.List;

import tests.ParDeVerticesNaoExistenteException;
import tests.VerticeJaExisteException;
import visitor.Visitor;

public class GraphAsList extends AbstractGraph {

	public GraphAsList() {
	}

	/**
	 * Retorna um vertice da lista buscando pela String "id". Retorna null caso
	 * o vertice nao seja encontrado
	 **/
	@Override
	public Vertex searchVertex(String id) {
		Vertex retorno = null;
		for (int i = 0; i < super.listVertex.size(); i++) {
			if (id.equals(super.listVertex.get(i).getId())) {
				retorno = super.listVertex.get(i);
			}
		}
		return retorno;
	}
	 
	@Override
	public Vertex searchVertexNome (String nome) {
		Vertex retorno = null;
		for (int i = 0; i < super.listVertex.size(); i++) {
			if (nome.equalsIgnoreCase(super.listVertex.get(i).getName())) {
				retorno = super.listVertex.get(i);
			}
		}
		return retorno;
	}

	public List<Vertex> buscarVerticeNome(String nome) {
		List<Vertex> listaVertices = new ArrayList<Vertex>();
		for (int i = 0; i < super.listVertex.size(); i++) {
			if ((super.listVertex.get(i).getName()).contains(nome) || super.listVertex.get(i).getName().equalsIgnoreCase(nome)) {
				listaVertices.add(super.listVertex.get(i));
			}
		}
		return listaVertices;
	}

	/**
	 * Retorna um inteiro correspondente a posicao do vertice na lista de
	 * vertices buscando pelo id. Retorna -1 caso o vertice nao exista
	 **/
	@Override
	public int searchPositionVertex(String id) {
		int retorno = -1;
		for (int i = 0; i < super.listVertex.size(); i++) {
			if (id.equals(super.listVertex.get(i).getId())) {
				retorno = i;
			}
		}
		return retorno;
	}

	/**
	 * Retorna true caso exista uma aresta com o id passado por parametro ou
	 * false caso contrario.
	 **/
	@Override
	public boolean existVertex(String id) {
		return (searchVertex(id) != null);
	}

	/** Retorna true se o grafo for direcionado e false caso contrario **/
	@Override
	public boolean isDirected() {
		return false;
	}

	/**
	 * Adiciona uma aresta entre dois vertices existentes. Lanca excecao caso um
	 * vertice seja invalido
	 **/
	@Override
	public void addEdge(Edge edge) throws ParDeVerticesNaoExistenteException {
		Vertex vertexOrigem = searchVertex(((edge.getOrigem().getId())));
		Vertex vertexDestino = searchVertex(edge.getDestino().getId());
		if (searchPositionVertex(edge.getOrigem().getId()) != -1
				&& searchPositionVertex(edge.getOrigem().getId()) != -1) {
			vertexOrigem.getVizinhos().add(vertexDestino);
			vertexDestino.getVizinhos().add(vertexOrigem);
		} else {
			throw new ParDeVerticesNaoExistenteException();
		}
	}

	/**
	 * Percorre o grafo em profundidade, chamando o visitor passado por
	 * parametro
	 **/
	@Override
	public void depthFirstTraversal(Visitor visitor, int startVertex,
			List<Vertex> list) {
		super.depthFirstTraversal(visitor, startVertex, list);
	}

	/** Percorre o grafo em largura, chamando o visitor passado por parametro **/
	@Override
	public void breadthFirstTraversal(Visitor visitor, int start,
			List<Vertex> list) {
		super.breadthFirstTraversal(visitor, start, list);
	}

	/** Cria um vertice. Caso esse vertice ja exista, lanca excecao **/
	@Override
	public void addVertex(Vertex v) throws VerticeJaExisteException {
		if (!existVertex(v.getId())) {
			super.listVertex.add(v);
		} else {
			throw new VerticeJaExisteException();
		}
	}

}