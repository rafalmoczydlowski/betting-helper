package com.rafinha.bettinghelper.repository;

import com.rafinha.bettinghelper.domain.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
