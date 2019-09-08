package com.treasy.apiv2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treasy.apiv2.model.Node;
import com.treasy.apiv2.repository.NodeRepository;

@RestController
@RequestMapping(value="/api")
public class NodeController {
	
	@Autowired
	NodeRepository nodeRepository;
	
	@GetMapping("/node")
	public List<Node> listaNodes(){
		return nodeRepository.findAll();
	}
	
	@GetMapping("/node/{id}")
	public Optional<Node> listaNode(@PathVariable(value="id") long id){
		return nodeRepository.findById(id);
	}
	
	@PostMapping("/node")
	public Node salvaNode(@RequestBody Node node) {
	return nodeRepository.save(node);
	}
	
	@DeleteMapping("/node/{id}")
	public void deletaNode(@PathVariable(value="id") long id) {
		nodeRepository.deleteById(id);
	}
	
	@PutMapping("/node")
	public Node atualizaNode(@RequestBody Node node) {
		return nodeRepository.save(node);
	}

}