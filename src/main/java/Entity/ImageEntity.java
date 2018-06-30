package Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="image")
public class ImageEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "images")
    private byte [] images;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @Column(name = "contestant_id")
    private  ContesttantEntity contestant;


    public ImageEntity() {
    }

    public ImageEntity(Integer id, byte[] images, ContesttantEntity contestant) {
        this.id = id;
        this.images = images;
        this.contestant = contestant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

    public ContesttantEntity getContestant() {
        return contestant;
    }

    public void setContestant(ContesttantEntity contestant) {
        this.contestant = contestant;
    }
}
