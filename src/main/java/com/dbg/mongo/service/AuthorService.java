package com.dbg.mongo.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.dbg.mongo.model.Author;

public interface AuthorService {

	List<Author> findAll();

	Author find(ObjectId id);

	Author create(Author author);

	void update(Author author);

	void delete(ObjectId id);

}
