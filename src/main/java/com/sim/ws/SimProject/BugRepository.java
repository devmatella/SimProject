package com.sim.ws.SimProject;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Bug", path = "bug")
public interface BugRepository extends PagingAndSortingRepository<Bug,Integer> {
    List<Bug> findByEmail(@Param("email") String email);

    @Transactional(readOnly = false)
    @Modifying
    @Query(value = "delete from Bug u where u.email = ?1")
    void deleteByEmail(@Param("email")  String email);
}
