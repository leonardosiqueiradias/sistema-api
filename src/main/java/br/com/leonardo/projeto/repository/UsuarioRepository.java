package br.com.leonardo.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leonardo.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
