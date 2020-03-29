package com.yap.coronavirustracker.models;

public class LocationStats {
  private String state;
  private String country;
  private int latestTotalCases;

  public String state() {
    return state;
  }

  public void state(String state) {
    this.state = state;
  }

  public String country() {
    return country;
  }

  public void country(String country) {
    this.country = country;
  }

  public int latestTotalCases() {
    return latestTotalCases;
  }

  public void latestTotalCases(int latestTotalCases) {
    this.latestTotalCases = latestTotalCases;
  }

  @Override
  public String toString() {
    return "LocationStats{" +
           "state='" + state + '\'' +
           ", country='" + country + '\'' +
           ", latestTotalCases=" + latestTotalCases +
           '}';
  }
}
