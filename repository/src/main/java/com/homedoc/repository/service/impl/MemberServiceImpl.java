package com.homedoc.repository.service.impl;

import com.homedoc.repository.dto.MemberDto;
import com.homedoc.repository.repository.MemberRepository;
import com.homedoc.repository.service.BasicService;
import com.homedoc.repository.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl extends BasicServiceImpl<MemberDto,Long, MemberRepository> implements MemberService {

}
