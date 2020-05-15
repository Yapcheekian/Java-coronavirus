package com.yap.coronavirustracker.controllers;

import com.yap.coronavirustracker.models.LocationStats;
import com.yap.coronavirustracker.services.CoronaVirusDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  private CoronaVirusDataService service;

  @CrossOrigin
  @GetMapping("/")
  public List<LocationStats> test() {
    return service.allStats;
  }
}
