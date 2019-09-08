package com.treasy.apiv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treasy.apiv2.model.Node;

public interface NodeRepository extends JpaRepository<Node, Long> {

}