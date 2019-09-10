package com.treasy.apiv2.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treasy.apiv2.model.Node;
// usando metodos do JPA
public interface NodeRepository extends JpaRepository<Node, Long> {
	
	// tentativa listar registro por campo especifico...
	//List<Node> findbyparentid(long parentid);

}