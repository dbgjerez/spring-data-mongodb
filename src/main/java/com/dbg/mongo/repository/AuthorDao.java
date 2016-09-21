package com.dbg.mongo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbg.mongo.model.Author;

@Repository
public interface AuthorDao extends CrudRepository<Author, ObjectId> {

}
