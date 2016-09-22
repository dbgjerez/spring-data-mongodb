package com.dbg.mongo.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.mongo.model.Author;
import com.dbg.mongo.service.AuthorService;

@RestController
@RequestMapping(value = "/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@RequestMapping
	public List<Author> findAll() {
		return authorService.findAll();
	}

	@RequestMapping(value = "/{id}")
	public Author find(@PathVariable("id") String id) {
		return authorService.find(new ObjectId(id));
	}

	@RequestMapping(method = RequestMethod.POST)
	public Author create(@RequestBody Author author) {
		return authorService.create(author);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@RequestBody Author author) {
		authorService.update(author);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@RequestParam("id") String id) {
		authorService.delete(new ObjectId(id));
	}

}
