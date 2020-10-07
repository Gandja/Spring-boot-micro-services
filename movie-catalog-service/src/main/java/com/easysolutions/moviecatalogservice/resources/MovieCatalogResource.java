package com.easysolutions.moviecatalogservice.resources;

import com.easysolutions.moviecatalogservice.models.Catalog;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<Catalog> getCatalog(@PathVariable("userId") String userId){

        return Collections.singletonList( new Catalog("IronMan","Fantasy", 9));
    }
}
