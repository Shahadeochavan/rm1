package com.capgemini.Resource_Management.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Resource_Management.model.Page;
import com.capgemini.Resource_Management.repository.PageRepository;
import com.capgemini.Resource_Management.service.PageService;

@Service
@Transactional
public class PageServiceImpl implements PageService {
	@Autowired
	PageRepository pageRepository;

	@Override
	public List<Page> getPageList() {
		// TODO Auto-generated method stub
		return pageRepository.findAll();
	}

}
