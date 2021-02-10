package gr.army.emo.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dikaiologitiko", schema = "misthodosia", catalog = "")
public class DikaiologitikoEntity {
    private int dikaiologitikoId;
    private String dikaiologitikoPerigrafi;

    public DikaiologitikoEntity(String dikaiologitiko) {
        this.dikaiologitikoPerigrafi = dikaiologitiko;
    }

    @Id
    @Column(name = "dikaiologitikoId", nullable = false)
    public int getDikaiologitikoId() {
        return dikaiologitikoId;
    }

    public void setDikaiologitikoId(int dikaiologitikoId) {
        this.dikaiologitikoId = dikaiologitikoId;
    }

    @Basic
    @Column(name = "dikaiologitikoPerigrafi", nullable = false, length = 255)
    public String getDikaiologitikoPerigrafi() {
        return dikaiologitikoPerigrafi;
    }

    public void setDikaiologitikoPerigrafi(String dikaiologitikoPerigrafi) {
        this.dikaiologitikoPerigrafi = dikaiologitikoPerigrafi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DikaiologitikoEntity that = (DikaiologitikoEntity) o;
        return dikaiologitikoId == that.dikaiologitikoId && Objects.equals(dikaiologitikoPerigrafi, that.dikaiologitikoPerigrafi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dikaiologitikoId, dikaiologitikoPerigrafi);
    }
}
