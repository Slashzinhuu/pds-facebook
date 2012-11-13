package visitor;

import graph.*;

public class VisitaAniversario implements Visitor {
	public boolean visited = false;

	public void visit(ConcreteVertex vertice) {
		System.out.println("Nome: " + vertice.getName() + "\nAniversário: "
				+ vertice.getBirthday().getDia() + "\n");
		visited = true;
	}

	public boolean isDone() {
		return visited;
	}
}