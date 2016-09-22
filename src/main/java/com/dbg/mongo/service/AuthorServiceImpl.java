package com.dbg.mongo.service;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbg.mongo.model.Author;
import com.dbg.mongo.repository.AuthorDao;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorDao authorDao;

	@Override
	public Author find(ObjectId id) {
		return authorDao.findOne(id);
	}

	@Override
	public Author create(Author author) {
		return authorDao.save(author);
	}

	@Override
	public void update(Author author) {
		authorDao.save(author);
	}

	@Override
	public void delete(ObjectId id) {
		authorDao.delete(id);
	}

	@Override
	public List<Author> findAll() {
		final List<Author> res = new ArrayList<>();
		final Iterable<Author> it = authorDao.findAll();
		it.forEach(a -> res.add(a));
		return res;
	}

}
