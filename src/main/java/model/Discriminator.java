package model;

import java.util.Map;

/**
 * When request bodies or response payloads may be one of a number of different schemas, a discriminator object can
 * be used to aid in serialization, deserialization, and validation. The discriminator is a specific object in a
 * schema which is used to inform the consumer of the specification of an alternative schema based on the value
 * associated with it.
 *
 * When using the discriminator, inline schemas will not be considered.
 */
public class Discriminator {
    /**
     * REQUIRED. The name of the property in the payload that will hold the discriminator value.
     */
    private String propertyName;

    /**
     * An object to hold mappings between payload values and schema names or references.
     */
    private Map<String, String> mapping;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Map<String, String> getMapping() {
        return mapping;
    }

    public void setMapping(Map<String, String> mapping) {
        this.mapping = mapping;
    }
}
