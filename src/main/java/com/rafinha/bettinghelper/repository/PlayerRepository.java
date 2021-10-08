package com.rafinha.bettinghelper.repository;

import com.rafinha.bettinghelper.domain.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
