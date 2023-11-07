package de.telran.g_10_170123_e_be_dto.service;

import de.telran.g_10_170123_e_be_dto.domain.dto.UserDTO;
import de.telran.g_10_170123_e_be_dto.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMappingService {

    @Mapping(source = "user.name", target = "username")
    @Mapping(target = "password", constant = "password is hidden")
    @Mapping(source = "user.userDetails", target = "userDetails")
    UserDTO mapToDto(User user);

    @Mapping(source = "user.username", target = "name")
    @Mapping(target = "id", constant = "0")
    @Mapping(target = "password", expression = "java(String.valueOf(user.getPassword().hashCode()))")
    User mapToEntity(UserDTO user);
}