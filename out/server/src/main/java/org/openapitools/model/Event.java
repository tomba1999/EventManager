package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Event
 */
@Entity
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-12T13:57:43.210224513Z[Etc/UTC]", comments = "Generator version: 7.7.0-SNAPSHOT")
public class Event {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "event_id")
  private Integer eventId;

  private String eventName;

  private String eventLocation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate eventDate;

  private String eventDescription;

  private Integer eventPrice;

  private Integer eventDuration;

  private String eventExactLocation;

  private String eventImage;

  public Event eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  */
  
  @Schema(name = "eventId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventId")
  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public Event eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Get eventName
   * @return eventName
  */
  
  @Schema(name = "eventName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Event eventLocation(String eventLocation) {
    this.eventLocation = eventLocation;
    return this;
  }

  /**
   * Get eventLocation
   * @return eventLocation
  */
  
  @Schema(name = "eventLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventLocation")
  public String getEventLocation() {
    return eventLocation;
  }

  public void setEventLocation(String eventLocation) {
    this.eventLocation = eventLocation;
  }

  public Event eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  */
  @Valid 
  @Schema(name = "eventDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventDate")
  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public Event eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

  /**
   * Get eventDescription
   * @return eventDescription
  */
  
  @Schema(name = "eventDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventDescription")
  public String getEventDescription() {
    return eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  public Event eventPrice(Integer eventPrice) {
    this.eventPrice = eventPrice;
    return this;
  }

  /**
   * Get eventPrice
   * @return eventPrice
  */
  
  @Schema(name = "eventPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventPrice")
  public Integer getEventPrice() {
    return eventPrice;
  }

  public void setEventPrice(Integer eventPrice) {
    this.eventPrice = eventPrice;
  }

  public Event eventDuration(Integer eventDuration) {
    this.eventDuration = eventDuration;
    return this;
  }

  /**
   * Get eventDuration
   * @return eventDuration
  */
  
  @Schema(name = "eventDuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventDuration")
  public Integer getEventDuration() {
    return eventDuration;
  }

  public void setEventDuration(Integer eventDuration) {
    this.eventDuration = eventDuration;
  }

  public Event eventExactLocation(String eventExactLocation) {
    this.eventExactLocation = eventExactLocation;
    return this;
  }

  /**
   * Get eventExactLocation
   * @return eventExactLocation
  */
  
  @Schema(name = "eventExactLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventExactLocation")
  public String getEventExactLocation() {
    return eventExactLocation;
  }

  public void setEventExactLocation(String eventExactLocation) {
    this.eventExactLocation = eventExactLocation;
  }

  public Event eventImage(String eventImage) {
    this.eventImage = eventImage;
    return this;
  }

  /**
   * Get eventImage
   * @return eventImage
  */
  
  @Schema(name = "eventImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventImage")
  public String getEventImage() {
    return eventImage;
  }

  public void setEventImage(String eventImage) {
    this.eventImage = eventImage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.eventId, event.eventId) &&
        Objects.equals(this.eventName, event.eventName) &&
        Objects.equals(this.eventLocation, event.eventLocation) &&
        Objects.equals(this.eventDate, event.eventDate) &&
        Objects.equals(this.eventDescription, event.eventDescription) &&
        Objects.equals(this.eventPrice, event.eventPrice) &&
        Objects.equals(this.eventDuration, event.eventDuration) &&
        Objects.equals(this.eventExactLocation, event.eventExactLocation) &&
        Objects.equals(this.eventImage, event.eventImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventName, eventLocation, eventDate, eventDescription, eventPrice, eventDuration, eventExactLocation, eventImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventLocation: ").append(toIndentedString(eventLocation)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    eventPrice: ").append(toIndentedString(eventPrice)).append("\n");
    sb.append("    eventDuration: ").append(toIndentedString(eventDuration)).append("\n");
    sb.append("    eventExactLocation: ").append(toIndentedString(eventExactLocation)).append("\n");
    sb.append("    eventImage: ").append(toIndentedString(eventImage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

