package de.telran.g_10_170123_e_be_dto.controller;

import de.telran.g_10_170123_e_be_dto.domain.dto.UserDTO;
import de.telran.g_10_170123_e_be_dto.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Tag(name = "Контроллер пользователей", description = "Контроллер для различных операций, связанных с пользователями")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    @Operation(
            summary = "Получение всех пользователей",
            description = "Получение списка всех пользователей, хранящихся в базе данных"
    )
    public List<UserDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "Получение конкретного пользователя",
            description = "Получение пользователя, соответствующего переданному идентификатору"
    )
    public UserDTO getById(@PathVariable
                           @Parameter(description = "Идентификатор пользователя")
                           int id) {
        return service.getById(id);
    }

    @PostMapping
    @Operation(
            summary = "Добавление пользователя",
            description = "Сохранение в базу данных нового пользователя, переданного в теле запроса"
    )
    public UserDTO add(@RequestBody
                       @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Объект пользователя")
                       UserDTO user) {
        return service.add(user);
    }

    @DeleteMapping("/{id}")
    @Operation(
            summary = "Удаление конкретного пользователя",
            description = "Удаление пользователя, соответствующего переданному идентификатору"
    )
    public void delete(@PathVariable
                       @Parameter(description = "Идентификатор пользователя")
                       int id) {
        service.delete(id);
    }
}