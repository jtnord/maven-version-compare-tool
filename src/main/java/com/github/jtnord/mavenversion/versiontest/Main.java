package com.github.jtnord.mavenversion.versiontest;

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;

public class Main {

    public static void main(String[] args) {
        // 2 arguments of versions.
        ArtifactVersion v1 = new DefaultArtifactVersion(args[0]);
        ArtifactVersion v2 = new DefaultArtifactVersion(args[1]);

        System.out.println("parsed first version " + v1 + " as:");
        printVersionDetails(v1);
        System.out.println();

        System.out.println("parsed second version " + v2 + " as:");
        printVersionDetails(v2);
        System.out.println();

        int comparison = v1.compareTo(v2);
        if (comparison < 0) {
            System.out.println(v1 + " is older than " + v2);
        } else if (comparison == 0) {
            System.out.println(v1 + " is the same as " + v2);
        } else {
            System.out.println(v1 + " is newer than " + v2);
        }
        
    }

    public static void printVersionDetails(ArtifactVersion version) {
        System.out.println("\t Major version:" + version.getMajorVersion());
        System.out.println("\t Minor version:" + version.getMinorVersion());
        System.out.println("\t Patch version:" + version.getIncrementalVersion());
        System.out.println("\t Major version:" + version.getBuildNumber());
        System.out.println("\t Major version:" + version.getQualifier());
    }
}
