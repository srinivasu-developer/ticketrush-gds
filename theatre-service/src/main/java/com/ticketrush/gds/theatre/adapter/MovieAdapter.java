package com.ticketrush.gds.theatre.adapter;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieAdapter {

    public static MovieEntity toEntity(final MovieRequest movieRequest) {
        return MovieEntity.builder()
                .name(movieRequest.getName())
                .language(movieRequest.getLanguage())
                .genre(movieRequest.getGenre())
                .releasedDate(movieRequest.getReleaseDate())
                .build();
    }

    public static MovieResponse toResponse(final MovieEntity movieEntity) {
        return MovieResponse.builder()
                .id(movieEntity.getId())
                .name(movieEntity.getName())
                .language(movieEntity.getLanguage())
                .genre(movieEntity.getGenre())
                .releaseDate(movieEntity.getReleaseDate())
                .build();
    }
}
