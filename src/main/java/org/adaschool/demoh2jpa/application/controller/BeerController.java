package org.adaschool.demoh2jpa.application.controller;

import org.adaschool.demoh2jpa.application.service.BeerService;
import org.adaschool.demoh2jpa.domain.entity.Beer;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/beer")
public record BeerController(
        BeerService beerService
) {


    @PostMapping
    public ResponseEntity<?> createBeer(@RequestBody Beer beer) {
        beerService.createBeer(beer);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<?> searchAll() {
        return new ResponseEntity<>(beerService.listBeer(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBeer(@PathVariable("id") Integer id) {
        beerService.deleteBeer(id);
        return new  ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<?> updateBeer(@RequestBody Beer beer){
        beerService.updateBeer(beer);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//       Crear un endpoint POST Recibir una entidad Beer


}
