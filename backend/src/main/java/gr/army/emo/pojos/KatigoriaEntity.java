package gr.army.emo.pojos;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "katigoria", schema = "misthodosia", catalog = "")
public class KatigoriaEntity {
    private int katigoriaId;
    private double doroPasxa;
    private double doroXmas;
    private double katalogisteo;
    private double kratiseis;
    private String katigoriaPerigrafi;
    private double pliroteo;
    private Collection<OplitisEntity> oplitisByKatigoriaId;

    @Id
    @Column(name = "katigoria_id", nullable = false)
    public int getKatigoriaId() {
        return katigoriaId;
    }

    public void setKatigoriaId(int katigoriaId) {
        this.katigoriaId = katigoriaId;
    }

    @Basic
    @Column(name = "doro_pasxa", nullable = false, precision = 0)
    public double getDoroPasxa() {
        return doroPasxa;
    }

    public void setDoroPasxa(double doroPasxa) {
        this.doroPasxa = doroPasxa;
    }

    @Basic
    @Column(name = "doro_xmas", nullable = false, precision = 0)
    public double getDoroXmas() {
        return doroXmas;
    }

    public void setDoroXmas(double doroXmas) {
        this.doroXmas = doroXmas;
    }

    @Basic
    @Column(name = "katalogisteo", nullable = false, precision = 0)
    public double getKatalogisteo() {
        return katalogisteo;
    }

    public void setKatalogisteo(double katalogisteo) {
        this.katalogisteo = katalogisteo;
    }

    @Basic
    @Column(name = "kratiseis", nullable = false, precision = 0)
    public double getKratiseis() {
        return kratiseis;
    }

    public void setKratiseis(double kratiseis) {
        this.kratiseis = kratiseis;
    }

    @Basic
    @Column(name = "katigoria_perigrafi", nullable = false, length = 100)
    public String getKatigoriaPerigrafi() {
        return katigoriaPerigrafi;
    }

    public void setKatigoriaPerigrafi(String katigoriaPerigrafi) {
        this.katigoriaPerigrafi = katigoriaPerigrafi;
    }

    @Basic
    @Column(name = "pliroteo", nullable = false, precision = 0)
    public double getPliroteo() {
        return pliroteo;
    }

    public void setPliroteo(double pliroteo) {
        this.pliroteo = pliroteo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KatigoriaEntity that = (KatigoriaEntity) o;
        return katigoriaId == that.katigoriaId && Double.compare(that.doroPasxa, doroPasxa) == 0 && Double.compare(that.doroXmas, doroXmas) == 0 && Double.compare(that.katalogisteo, katalogisteo) == 0 && Double.compare(that.kratiseis, kratiseis) == 0 && Double.compare(that.pliroteo, pliroteo) == 0 && Objects.equals(katigoriaPerigrafi, that.katigoriaPerigrafi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(katigoriaId, doroPasxa, doroXmas, katalogisteo, kratiseis, katigoriaPerigrafi, pliroteo);
    }

    @OneToMany(mappedBy = "katigoriaByKatigoria")
    public Collection<OplitisEntity> getOplitisByKatigoriaId() {
        return oplitisByKatigoriaId;
    }

    public void setOplitisByKatigoriaId(Collection<OplitisEntity> oplitisByKatigoriaId) {
        this.oplitisByKatigoriaId = oplitisByKatigoriaId;
    }
}
