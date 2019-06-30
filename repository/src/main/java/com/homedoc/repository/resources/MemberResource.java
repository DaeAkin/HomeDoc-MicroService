package com.homedoc.repository.resources;

import com.homedoc.repository.dto.MemberDto;
import com.homedoc.repository.service.MemberService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/member")
@Api("MemberResource API")
public class MemberResource extends BasicResource{

    @Autowired
    MemberService service;



}
