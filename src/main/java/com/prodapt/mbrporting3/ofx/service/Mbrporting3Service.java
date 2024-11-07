
package com.prodapt.mbrporting3.ofx.service;

import com.prodapt.mbrporting3.ofx.entity.Mbrporting3Entity;
import com.prodapt.mbrporting3.ofx.repository.Mbrporting3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Mbrporting3Service {

    @Autowired
    private Mbrporting3Repository repository;

    public List<Mbrporting3Entity> getAllEntities() {
        return repository.findAll();
    }

    public Optional<Mbrporting3Entity> getEntityById(Long id) {
        return repository.findById(id);
    }

    public Mbrporting3Entity createEntity(Mbrporting3Entity entity) {
        return repository.save(entity);
    }

    public Mbrporting3Entity updateEntity(Long id, Mbrporting3Entity updatedEntity) {
        Mbrporting3Entity entity = repository.findById(id).orElse(null);
        if (entity != null) {
            entity.setName(updatedEntity.getName());
            entity.setEmail(updatedEntity.getEmail());
            // Set other properties here as needed
            return repository.save(entity);
        }
        return null;
    }

    public void deleteEntity(Long id) {
        repository.deleteById(id);
    }
}

