package br.com.ronaldvale.testemvrestapi.controller;

import br.com.ronaldvale.testemvrestapi.model.ColaboradorMV;
import br.com.ronaldvale.testemvrestapi.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ColaboradorController {

    @Autowired
    private ColaboradorRepository repository;

    @GetMapping(path = "/api/colaborador/{cpf}")
    public ResponseEntity consultar(@PathVariable("cpf")Integer cpf){
        return repository.findById(cpf)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/colaborador/salvar")
    public ColaboradorMV salvar(@RequestBody ColaboradorMV colaborador){
        return repository.save(colaborador);
    }
}
