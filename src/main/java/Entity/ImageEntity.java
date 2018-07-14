package Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="image")
public class ImageEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Integer Image_id;

    @Column(name = "images")
    private byte[] images;
  
    
	public ImageEntity() {

	}


	public ImageEntity(Integer image_id, byte[] images) {
		super();
		Image_id = image_id;
		this.images = images;
	}


	public Integer getImage_id() {
		return Image_id;
	}


	public void setImage_id(Integer image_id) {
		Image_id = image_id;
	}


	public byte[] getImages() {
		return images;
	}


	public void setImages(byte[] images) {
		this.images = images;
	}
	

    
}