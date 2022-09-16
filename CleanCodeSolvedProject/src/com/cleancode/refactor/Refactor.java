package com.cleancode.refactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Refactor {

    public List<UserDto> createPerson (Set<UserEntity> resultSet) {
        List<UserDto> result = new ArrayList<>();
        for (UserEntity e : resultSet) {
            UserDto dto = new UserDto();
            dto.setName (e.getName());
            dto.setGender (e.getGender());
            dto.setAge (e.getAge());
            result.add(dto);
        }
        return result;
    }
}
