package com.treasy.apiv2.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treasy.apiv2.model.Node;

public interface NodeRepository extends JpaRepository<Node, Long> {
	
	//List<Node> findbyparentid(long parentid);

}