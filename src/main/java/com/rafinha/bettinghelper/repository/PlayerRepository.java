package com.rafinha.bettinghelper.repository;

import com.rafinha.bettinghelper.domain.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, Long> {
    List<Player> findAllByIdMatches(Long id);
}
