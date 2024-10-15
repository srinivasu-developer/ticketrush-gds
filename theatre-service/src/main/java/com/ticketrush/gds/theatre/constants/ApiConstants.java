package com.ticketrush.gds.theatre.constants;

public final class ApiConstants {

    private ApiConstants() {}

    public static final String API_VERSION_V1 = "/v1";
    public static final String MOVIES_URI = API_VERSION_V1 + "/movies";
    public static final String MOVIE_ID_PATH_PARAM = "/{movieId}";
    public static final String THEATRES_URI = API_VERSION_V1 + "/theatres";
    public static final String THEATRE_ID_PATH_PARAM = "/{theatreId}";
    public static final String SHOWS_URI = THEATRES_URI + THEATRE_ID_PATH_PARAM + "/shows";

}
