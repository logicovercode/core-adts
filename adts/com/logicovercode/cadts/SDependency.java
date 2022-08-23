package com.logicovercode.cadts;

public class SDependency {

    public final String organization ;
    public final String artifactId ;
    public final String version ;

    public SDependency(String organization, String artifactId, String version) {
        this.organization = organization;
        this.artifactId = artifactId;
        this.version = version;
    }
}
