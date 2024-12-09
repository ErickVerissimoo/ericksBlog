package com.everyoneblogsspring.everyonesblogs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everyoneblogsspring.everyonesblogs.dto.PostDTO;
import com.everyoneblogsspring.everyonesblogs.service.PostService;
import com.everyoneblogsspring.everyonesblogs.utils.Authenticated;
import com.everyoneblogsspring.everyonesblogs.utils.UserMapper;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/post")
@Validated
public class PostController {
private final PostService service;
private final UserMapper mapper;
@Authenticated
@PostMapping("postar")
public ResponseEntity<String> postar(@ModelAttribute @Valid PostDTO dto) {
    service.postar(mapper.toPost(dto));
    return ResponseEntity.ok().body("Postado");
}
@Authenticated
@DeleteMapping("/{id}")
public ResponseEntity<String> apagar(@PathVariable String id){
return ResponseEntity.status(HttpStatus.OK).body("deletado");
}
}
