package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Event implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
/*	@Version
//	@Column(name = "version")
//	private int version; */

	
	@Column (unique = true)
	@NotNull
	@Size (min = 5, max = 50, message = "An event’s name must contain between 5 and 50 characters")
	private String name;
	
	@NotNull
	@Size(min = 20, max = 1000, message = "An event’s name must contain between 20 and 1000 characters")
	private String description;
	
	@ManyToOne
	private MediaItem mediaItem;
	
	@ManyToOne
	@NotNull
	private EventCategory category;

	
	/* Boilerplate getters and setters */

	public EventCategory getCategory() {
		return category;
	}

	public void setCategory(EventCategory category) {
		this.category = category;
	}

	public MediaItem getMediaItem() {
		return mediaItem;
	}

	public void setMediaItem(MediaItem picture) {
		this.mediaItem = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

/*	public int getVersion() {
//		return this.version;
//	}
//
//	public void setVersion(final int version) {
//		this.version = version;
	}*/

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Event)) {
			return false;
		}
		Event other = (Event) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (name != null && !name.trim().isEmpty())
			result += "name: " + name;
		return result;
	}
}