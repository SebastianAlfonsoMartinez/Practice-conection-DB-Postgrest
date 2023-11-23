package org.adaschool.demoh2jpa.application.service;

import org.adaschool.demoh2jpa.domain.entity.Beer;
import org.adaschool.demoh2jpa.domain.repository.BeerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public record BeerService(
        BeerRepository beerRepository
) {

    public void createBeer(Beer beer) {
        beerRepository.save(beer);
    }

    public List<Beer> listBeer() {
        return beerRepository.findAll();
    }

    public void deleteBeer(Integer id){
        Beer beer = beerRepository.findById(id).orElseThrow(()-> new RuntimeException("Beer not found.. :("));
        beerRepository.delete(beer);

    }

    public void updateBeer(Beer beer) {
        beerRepository.findById(beer.getId()).orElseThrow(()-> new RuntimeException("Beer not found.. :("));
        beerRepository.save(beer);
    }


}
