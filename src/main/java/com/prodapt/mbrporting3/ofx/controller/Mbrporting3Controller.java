
package com.prodapt.mbrporting3.ofx.controller;

import com.prodapt.mbrporting3.ofx.entity.Mbrporting3Entity;
import com.prodapt.mbrporting3.ofx.service.Mbrporting3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entities")
public class Mbrporting3Controller {
    
    @Autowired
    private Mbrporting3Service mbrporting3Service;

    @GetMapping
    public List<Mbrporting3Entity> getAllEntities() {
        return mbrporting3Service.getAllEntities();
    }

    @PostMapping
    public Mbrporting3Entity createEntity(@RequestBody Mbrporting3Entity entity) {
        return mbrporting3Service.createEntity(entity);
    }

    @PutMapping("/{id}")
    public Mbrporting3Entity updateEntity(@PathVariable Long id, @RequestBody Mbrporting3Entity entity) {
        return mbrporting3Service.updateEntity(id, entity);
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable Long id) {
        mbrporting3Service.deleteEntity(id);
    }
}
