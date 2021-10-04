package com.rafinha.bettinghelper.repository;

import com.rafinha.bettinghelper.domain.Match;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, Long> {
}
