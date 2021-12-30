package com.TestAPI.MyStsProject.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MediaContent {

    public String id;

    public String title;

    public String titleSlug;

    public String description;

    public Integer sortKey;

    public String recordStatus;

    public String contentId;

    public String posterFileId;

    public Integer internalRating;

    public String modifiedAt;

    public String createdAt;

    public List<String> platform;

    public String displayType;

    public String externalUrl;

}
