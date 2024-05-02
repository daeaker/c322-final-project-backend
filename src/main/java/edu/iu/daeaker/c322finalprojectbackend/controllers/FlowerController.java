package edu.iu.daeaker.c322finalprojectbackend.controllers;

import edu.iu.daeaker.c322finalprojectbackend.model.Flower;
import edu.iu.daeaker.c322finalprojectbackend.repository.FlowerFileRepository;
import edu.iu.daeaker.c322finalprojectbackend.repository.FlowerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/flowers")
public class FlowerController {

    private FlowerRepository flowerRepository;
    private FlowerFileRepository flowerFileRepository;

    public FlowerController(FlowerRepository flowerRepository, FlowerFileRepository flowerFileRepository) {
        this.flowerRepository = flowerRepository;
        this.flowerFileRepository = flowerFileRepository;
    }


    @GetMapping
    public List<Flower> findAll() {
        try {
            return flowerFileRepository.findAll();
        }
        catch (IOException e) {
            throw new RuntimeException();
        }
    }

    @GetMapping("/{id}/image")
    public ResponseEntity<?> getImage(@PathVariable int id) {
        try {
            byte[] image = FlowerFileRepository.getImage(id);
            return ResponseEntity.status(HttpStatus.FOUND)
                    .contentType(MediaType.IMAGE_PNG)
                    .body(image);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/{id}/image")
    public boolean updateImage(@PathVariable int id,
                               @RequestParam MultipartFile file) {
        try {
            return flowerFileRepository.updateImage(id, file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @PostMapping
    public int add(@RequestBody Flower flower) {
        try {
            return flowerFileRepository.add(flower);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    @GetMapping("/{id}")
    public Flower find(@PathVariable int id) {
        try {
            return flowerFileRepository.find(id);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }



}
