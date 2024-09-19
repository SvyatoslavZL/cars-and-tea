package com.carsandtea.mapping;

import com.carsandtea.dto.UserTo;
import com.carsandtea.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EntityMapper {

    EntityMapper MAPPER = Mappers.getMapper(EntityMapper.class);

    UserTo from(User user);

    User from(UserTo userTo);

}
