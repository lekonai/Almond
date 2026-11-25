package org.acme.DataStores;

public class Settings {
    // Creating a static instance so that we can reference settings in each class without creating a new object
    // NOTE THIS MIGHT CAUSE ISSUES if we intend for the user to change settings for each simulation as it is static
    public static Settings instance = new Settings();

    // As we want the user to add or change settings, should make some settings that shouldn't change static?
    public int x_size;
    public int y_size;

    // NOTE where do we keep a log of changes? Here or in a new class?
}
