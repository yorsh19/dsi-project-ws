package com.dsi.project.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompetitionResponse {
    private int count;
    private Filters filters;
    private List<Competition> competitions;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Filters {
        private List<Integer> areas;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Competition {
        private int id;
        private Area area;
        private String name;
        private String code;
        private String type;
        private String emblem;
        private String plan;
        private CurrentSeason currentSeason;
        private int numberOfAvailableSeasons;
        private String lastUpdated;

        @Data
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Area {
            private int id;
            private String name;
            private String code;
            private String flag;
        }

        @Data
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class CurrentSeason {
            private int id;
            private String startDate;
            private String endDate;
            private Integer currentMatchday;
            private String winner;
        }
    }
}
