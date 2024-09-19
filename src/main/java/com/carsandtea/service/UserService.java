package com.carsandtea.service;

import com.carsandtea.dto.UserTo;
import com.carsandtea.mapping.EntityMapper;
import com.carsandtea.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@SuppressWarnings("unused")
@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Optional<UserTo> get(Long id) {
        return userRepository.findById(id).map(EntityMapper.MAPPER::from);
    }

    @Transactional
    public Collection<UserTo> getAll() {
        return userRepository.findAll()
                .stream()
                .map(EntityMapper.MAPPER::from)
                .toList();
    }

    @Transactional
    public void create(UserTo userTo) {
        userRepository.save(EntityMapper.MAPPER.from(userTo));
    }

    @Transactional
    public void update(UserTo userTo) {
        userRepository.save(EntityMapper.MAPPER.from(userTo));
    }

    @Transactional
    public void delete(UserTo userTo) {
        userRepository.delete(EntityMapper.MAPPER.from(userTo));
    }
}
