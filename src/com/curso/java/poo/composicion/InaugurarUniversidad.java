package com.curso.java.poo.composicion;

public class InaugurarUniversidad {

	public static void main(String[] args) {
		Departamento dep1 = new Departamento("Dept1", "Planta1");
		Departamento dep2 = new Departamento("Dept2", "Planta2");
		Departamento[] departamentos = {dep1,dep2};
		Cafeteria cafeteria = new Cafeteria("Caf1",20);
		
		Universidad universidad = new Universidad("Universidad1", "Direc1", cafeteria, departamentos);
		
		
		Departamento[] depts = universidad.getDepartamentos();
		Departamento d = depts[1];
		System.out.println(d.getPlanta());
		
		System.out.println(universidad.getDepartamentos()[1].getPlanta());

	}

}
