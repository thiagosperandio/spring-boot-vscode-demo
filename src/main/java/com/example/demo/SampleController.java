package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleController
 */
@RestController
public class SampleController {
@GetMapping("/sample")
public ResponseEntity<String> get() {
    return new ResponseEntity<String>("hello", HttpStatus.OK);
}


}