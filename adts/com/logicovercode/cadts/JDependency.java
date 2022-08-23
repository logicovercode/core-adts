package com.logicovercode.cadts;

public class JDependency {

    public final String organization ;
    public final String artifactId ;
    public final String version ;
    public final Boolean pomOnly ;

    public JDependency(String organization, String artifactId, String version, Boolean pomOnly) {
        this.organization = organization;
        this.artifactId = artifactId;
        this.version = version;
        this.pomOnly = pomOnly;
    }
}
