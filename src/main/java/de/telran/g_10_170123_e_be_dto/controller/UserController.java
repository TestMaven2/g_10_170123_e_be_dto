package de.telran.g_10_170123_e_be_dto.controller;

import de.telran.g_10_170123_e_be_dto.domain.dto.UserDTO;
import de.telran.g_10_170123_e_be_dto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<UserDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public UserDTO add(@RequestBody UserDTO user) {
        return service.add(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}