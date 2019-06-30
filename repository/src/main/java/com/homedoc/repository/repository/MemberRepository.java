package com.homedoc.repository.repository;

import com.homedoc.repository.dto.MemberDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends MongoRepository<MemberDto,Long> {

}
