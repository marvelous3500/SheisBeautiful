package Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="image")
public class Image implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Integer Image_id;

    @Column(name = "image_name")
	private  String image_name;

    @Column(name = "image_size")
	private String image_size;

	@Column(name = "image_path")
    private byte[] image_path;

	@ManyToOne(cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
    @JoinColumn(name = "contestant_id", referencedColumnName = "contestant_id")
    private  Contestants contestants;


	public Image() {

	}

    public Image(Integer image_id, String image_name, String image_size, byte[] image_path, Contestants contestants) {
        Image_id = image_id;
        this.image_name = image_name;
        this.image_size = image_size;
        this.image_path = image_path;
        this.contestants = contestants;
    }

    public Image(Contestants contestants) {
        this.contestants = contestants;
    }

    public Image(byte[] image_path) {
        this.image_path = image_path;
    }

    public Integer getImage_id() {
        return Image_id;
    }

    public void setImage_id(Integer image_id) {
        Image_id = image_id;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public String getImage_size() {
        return image_size;
    }

    public void setImage_size(String image_size) {
        this.image_size = image_size;
    }

    public byte[] getImage_path() {
        return image_path;
    }

    public void setImage_path(byte[] image_path) {
        this.image_path = image_path;
    }

    public Contestants getContestants() {
        return contestants;
    }

    public void setContestants(Contestants contestants) {
        this.contestants = contestants;
    }
}