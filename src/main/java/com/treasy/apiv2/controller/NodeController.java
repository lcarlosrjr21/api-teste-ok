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
// mapeando o crud
@RestController
@RequestMapping(value="/apiv2")
public class NodeController {
	
	@Autowired
	NodeRepository nodeRepository;
	//para listar todos os registros
	@GetMapping("/node")
	public List<Node> listaNodes(){
		return nodeRepository.findAll();
	}
	//para recuperar um registro por id
	@GetMapping("/node/{id}")
	public Optional<Node> listaNode(@PathVariable(value="id") long id){
		return nodeRepository.findById(id);
	}
	
	// tentativa listar registro por campo...
	/*@GetMapping("/node/{parentid}")
	public List<Node> listaNode(@PathVariable(value="parentid") long parentid){
		return nodeRepository.findbyparentid(parentid);
	}*/
	//adicionar um registro
	@PostMapping("/node")
	public Node salvaNode(@RequestBody Node node) {
	return nodeRepository.save(node);
	}
	//apagando um registro específico
	@DeleteMapping("/node/{id}")
	public void deletaNode(@PathVariable(value="id") long id) {
		nodeRepository.deleteById(id);
	}
	//atualizando um registro
	@PutMapping("/node")
	public Node atualizaNode(@RequestBody Node node) {
		return nodeRepository.save(node);
	}

}