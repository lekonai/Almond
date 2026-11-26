package org.acme.management;

/**
 * Grazing
 * 
 * <p>
 * A land management method that involves allowing livestock to graze on the land.
 * </p>
 * 
 * @param intensity
 */

public record Grazing(double intensity) implements LandManagementMethod {
}
