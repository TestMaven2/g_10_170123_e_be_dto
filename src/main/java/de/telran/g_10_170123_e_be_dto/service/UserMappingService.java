package de.telran.g_10_170123_e_be_dto.service;

import de.telran.g_10_170123_e_be_dto.domain.dto.UserDTO;
import de.telran.g_10_170123_e_be_dto.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserMappingService {

    public UserDTO mapToDto(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        return dto;
    }

    public User mapToEntity(UserDTO dto) {
        User entity = new User();
        entity.setName(dto.getName());
        entity.setPassword(String.valueOf(dto.getPassword().hashCode()));
        return entity;
    }
}