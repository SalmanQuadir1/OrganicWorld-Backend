package com.ecom.Ecommerce.Service;

import com.ecom.Ecommerce.DTO.RegisterRequestDTO;
import com.ecom.Ecommerce.DTO.UserDTO;
import java.util.List;
import java.util.UUID;

public interface UserService {
    UserDTO createUser(RegisterRequestDTO dto);
    UserDTO getUserById(UUID id);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(UUID id, UserDTO dto);
    void deleteUser(UUID id);
}
