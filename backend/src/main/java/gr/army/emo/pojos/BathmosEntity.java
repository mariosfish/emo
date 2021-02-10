package gr.army.emo.pojos;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "bathmos", schema = "misthodosia", catalog = "")
public class BathmosEntity {
    private int bathmosId;
    private String bathmosPerigrafi;
    private Collection<OplitisEntity> oplitisByBathmosId;

    @Id
    @Column(name = "bathmos_id", nullable = false)
    public int getBathmosId() {
        return bathmosId;
    }

    public void setBathmosId(int bathmosId) {
        this.bathmosId = bathmosId;
    }

    @Basic
    @Column(name = "bathmos_perigrafi", nullable = true, length = 20)
    public String getBathmosPerigrafi() {
        return bathmosPerigrafi;
    }

    public void setBathmosPerigrafi(String bathmosPerigrafi) {
        this.bathmosPerigrafi = bathmosPerigrafi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BathmosEntity that = (BathmosEntity) o;
        return bathmosId == that.bathmosId && Objects.equals(bathmosPerigrafi, that.bathmosPerigrafi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bathmosId, bathmosPerigrafi);
    }

    @OneToMany(mappedBy = "bathmosByBathmos")
    public Collection<OplitisEntity> getOplitisByBathmosId() {
        return oplitisByBathmosId;
    }

    public void setOplitisByBathmosId(Collection<OplitisEntity> oplitisByBathmosId) {
        this.oplitisByBathmosId = oplitisByBathmosId;
    }
}
