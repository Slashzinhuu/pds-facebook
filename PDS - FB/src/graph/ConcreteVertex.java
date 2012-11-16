package graph;

import java.util.LinkedList;

import visitor.Visitable;
import visitor.Visitor;
import apifb.Data;

public class ConcreteVertex implements Vertex, Visitable {
	private LinkedList<Vertex> listVertex = new LinkedList<Vertex>();
	private String name;
	private Data birthday;
	private String id;

	public ConcreteVertex(String name, Data data, String id) {
		this.name = name;
		this.birthday = data;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Data getBirthday() {
		return birthday;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	/**Retorna uma lista de vertices com os vizinhos**/
	@Override
	public LinkedList<Vertex> getVizinhos() {
		return listVertex;
	}

	/**Chama metodo visit do visitor passado por parametro se passando como parametro**/
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}