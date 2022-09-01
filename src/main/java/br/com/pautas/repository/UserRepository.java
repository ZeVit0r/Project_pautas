package br.com.pautas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pautas.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    public Optional<User> findByUsername(String username);

}
