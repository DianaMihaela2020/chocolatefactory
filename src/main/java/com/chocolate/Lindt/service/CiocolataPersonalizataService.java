package com.chocolate.Lindt.service;

import com.chocolate.Lindt.model.CiocolataPersonalizata;
import com.chocolate.Lindt.repository.CiocolataPersonalizataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CiocolataPersonalizataService {
    @Autowired
    private CiocolataPersonalizataRepository repo;

    public void save (CiocolataPersonalizata ciocolata) {
        repo.save(ciocolata);
    }



}
