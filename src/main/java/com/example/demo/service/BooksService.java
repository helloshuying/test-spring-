package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Books;

import com.example.demo.repository.BooksRepository;
@Service
public class BooksService {
	@Resource
	private BooksRepository BooksRepository;
	
	@Transactional
	public Books inser(Books b) {
		return BooksRepository.save(b);
	}
	@Transactional
	public void deleteById(Integer id) {
		BooksRepository.delete(id);
	}
	@Transactional
	public Books findOne(Integer b) {
		return BooksRepository.findOne(b);
	}
	@Transactional
	public List<Books> findAll() {
		return BooksRepository.findAll();
	}
	
	@Transactional
	public Books update(Books b) {
		return BooksRepository.save(b);

	}
 
}
