package org.example.bai2.controller;

import org.example.bai2.model.Computer;
import org.example.bai2.service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ComputerController {
    @Autowired
    private IComputerService iComputerService;

    @GetMapping("")
    public ResponseEntity<Iterable<Computer>> getAllComputer(){
        Iterable<Computer> customerIterable = iComputerService.findAll();
        return new ResponseEntity<>(customerIterable, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Computer> findComputerById(@PathVariable Long id) {
        Optional<Computer> computerOptional = iComputerService.findById(id);
        if (!computerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(computerOptional.get(), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Computer> createComputer(@RequestBody Computer computer){
        iComputerService.save(computer);
        return new ResponseEntity<>(computer,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Computer> updateComputer(@PathVariable Long id, @RequestBody Computer computer) {
        Optional<Computer> computerOptional = iComputerService.findById(id);
        if (!computerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        computer.setId(computerOptional.get().getId());
        return new ResponseEntity<>(iComputerService.save(computer), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Computer> deleteComputerById(@PathVariable("id") Long id){
        Optional<Computer> computer = iComputerService.findById(id);
        iComputerService.remove(computer.get().getId());
        return new ResponseEntity<>(computer.get(),HttpStatus.OK);
    }
}
