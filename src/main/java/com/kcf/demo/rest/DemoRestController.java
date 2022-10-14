package com.kcf.demo.rest;


import com.kcf.demo.DemoApplication;
import com.kcf.demo.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import javax.print.Doc;
import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/demo")
public class DemoRestController
{
    @Autowired
    RestTemplate restTemplate;
    List<Demo> demos = new ArrayList<>();

    @PostMapping()
    public ResponseEntity<Demo> insertData(@RequestBody Demo demo)
    {

        demos.add(demo);
        //addDemo(demo);

        return ResponseEntity.ok(demo);

    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Demo> getDemo(@PathVariable Integer id )
    {

        return ResponseEntity.ok(demos.get(id));

    }

    @PostMapping(path = "/mongodb/filter")
    public ResponseEntity<Document> addDemo(@RequestBody FilterRequest filterRequest)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("api-key","yDRk6c5OxH3cAaH5j6AECnWiY8QHr36gGKJZWwBOdJcjYSl9EuuZJ4eIPSQx2x5Y");
        HttpEntity<FilterRequest> request = new HttpEntity<>(filterRequest,headers);

            //public HttpHeaders(MultiValueMap<"api-key","yDRk6c5OxH3cAaH5j6AECnWiY8QHr36gGKJZWwBOdJcjYSl9EuuZJ4eIPSQx2x5Y"> headers);

        Document doc = restTemplate.postForObject("https://data.mongodb-api.com/app/data-ohzey/endpoint/data/v1/action/findOne"
                , request
                , Document.class);
        return ResponseEntity.ok(doc);
    }




    @PostMapping(path = "/mongodb/insert")
    public ResponseEntity<Document> addDoc(@RequestBody InsertRequest insertRequest)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("api-key","yDRk6c5OxH3cAaH5j6AECnWiY8QHr36gGKJZWwBOdJcjYSl9EuuZJ4eIPSQx2x5Y");
        HttpEntity<InsertRequest> request = new HttpEntity<>(insertRequest,headers);

        Document doc = restTemplate.postForObject("https://data.mongodb-api.com/app/data-ohzey/endpoint/data/v1/action/insertOne"
                , request
                , Document.class);
        return ResponseEntity.ok(doc);

    }




    @PostMapping(path = "/mongodb/delete")
    public ResponseEntity<Document> delres(@RequestBody FilterRequest filterRequest)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("api-key","yDRk6c5OxH3cAaH5j6AECnWiY8QHr36gGKJZWwBOdJcjYSl9EuuZJ4eIPSQx2x5Y");
        HttpEntity<FilterRequest> request = new HttpEntity<>(filterRequest,headers);

        //public HttpHeaders(MultiValueMap<"api-key","yDRk6c5OxH3cAaH5j6AECnWiY8QHr36gGKJZWwBOdJcjYSl9EuuZJ4eIPSQx2x5Y"> headers);

        Document doc = restTemplate.postForObject("https://data.mongodb-api.com/app/data-ohzey/endpoint/data/v1/action/deleteOne"
                , request
                , Document.class);
        return ResponseEntity.ok(doc);
    }
}

