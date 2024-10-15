package com.ticketrush.gds.theatre.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static com.ticketrush.gds.theatre.constants.ApiConstants.MOVIES_URI;

@Slf4j
@RestController
@RequestMapping(MOVIES_URI)
public class MovieController {

    @PostMapping
    public ResponseBody<MovieResponse> createMovie(@Validated final MovieRequest movieRequest) {

    }

}
