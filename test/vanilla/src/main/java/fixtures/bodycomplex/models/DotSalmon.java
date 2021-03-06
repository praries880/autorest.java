/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The DotSalmon model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "fish\\.type")
@JsonTypeName("DotSalmon")
public class DotSalmon extends DotFish {
    /**
     * The location property.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The iswild property.
     */
    @JsonProperty(value = "iswild")
    private Boolean iswild;

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the DotSalmon object itself.
     */
    public DotSalmon withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the iswild value.
     *
     * @return the iswild value
     */
    public Boolean iswild() {
        return this.iswild;
    }

    /**
     * Set the iswild value.
     *
     * @param iswild the iswild value to set
     * @return the DotSalmon object itself.
     */
    public DotSalmon withIswild(Boolean iswild) {
        this.iswild = iswild;
        return this;
    }

}
