package de.telran.g_10_170123_e_be_dto.service;

import de.telran.g_10_170123_e_be_dto.domain.dto.UserDTO;
import de.telran.g_10_170123_e_be_dto.domain.entity.User;
import de.telran.g_10_170123_e_be_dto.domain.entity.UserDetails;
import de.telran.g_10_170123_e_be_dto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMappingService mappingService;

    public List<UserDTO> getAll() {
        return repository.findAll().stream().map(mappingService::mapToDto).toList();
    }

    public UserDTO getById(int id) {
        User user = repository.findById(id).orElse(null);
        return user == null ? null : mappingService.mapToDto(user);
    }

    public UserDTO add(UserDTO user) {
        User newUser = mappingService.mapToEntity(user);
        UserDetails details = new UserDetails();
        details.setAddress("Test address");
        details.setEmail("test@test.de");
        details.setPhone("+3333333333333");
        details.setUser(newUser);
        newUser.setUserDetails(details);

        newUser = repository.save(newUser);
        return mappingService.mapToDto(newUser);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}