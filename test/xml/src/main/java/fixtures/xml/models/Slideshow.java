/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.xml.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Data about a slideshow.
 */
@JacksonXmlRootElement(localName = "slideshow")
public final class Slideshow {
    /**
     * The title property.
     */
    @JacksonXmlProperty(localName = "title", isAttribute = true)
    private String title;

    /**
     * The dateProperty property.
     */
    @JacksonXmlProperty(localName = "date", isAttribute = true)
    private String dateProperty;

    /**
     * The author property.
     */
    @JacksonXmlProperty(localName = "author", isAttribute = true)
    private String author;

    /**
     * The slides property.
     */
    @JsonProperty("slide")
    private List<Slide> slides = new ArrayList<>();

    /**
     * Get the title value.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title value.
     *
     * @param title the title value to set.
     * @return the Slideshow object itself.
     */
    public Slideshow withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the dateProperty value.
     *
     * @return the dateProperty value.
     */
    public String dateProperty() {
        return this.dateProperty;
    }

    /**
     * Set the dateProperty value.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the Slideshow object itself.
     */
    public Slideshow withDateProperty(String dateProperty) {
        this.dateProperty = dateProperty;
        return this;
    }

    /**
     * Get the author value.
     *
     * @return the author value.
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author value.
     *
     * @param author the author value to set.
     * @return the Slideshow object itself.
     */
    public Slideshow withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the slides value.
     *
     * @return the slides value.
     */
    public List<Slide> slides() {
        return this.slides;
    }

    /**
     * Set the slides value.
     *
     * @param slides the slides value to set.
     * @return the Slideshow object itself.
     */
    public Slideshow withSlides(List<Slide> slides) {
        this.slides = slides;
        return this;
    }
}