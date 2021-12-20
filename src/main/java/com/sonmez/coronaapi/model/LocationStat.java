package com.sonmez.coronaapi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LocationStat {

    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevDay;
}
