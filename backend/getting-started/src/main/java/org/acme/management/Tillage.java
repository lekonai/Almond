package org.acme.management;

/**
 * Tillage
 * 
 * <p>
 * A land management method that involves plowing the soil a certain number of times per year.
 * </p>
 * 
 * @param timesPerYear
 */
public record Tillage(int timesPerYear) implements LandManagementMethod {
}
