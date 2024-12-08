package com.everyoneblogsspring.everyonesblogs.dto;

import java.util.UUID;

import org.springframework.lang.Nullable;

import com.everyoneblogsspring.everyonesblogs.model.Post;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class PostDTO implements EntityConverter<Post> {
    private UUID id;
    @NotNull
private String title;
@Nullable
private String body;
private byte[] midia;
}
