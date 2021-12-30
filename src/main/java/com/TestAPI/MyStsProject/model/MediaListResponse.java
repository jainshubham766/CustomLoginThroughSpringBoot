package com.TestAPI.MyStsProject.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MediaListResponse {

    private List<MediaContent> content;

}
