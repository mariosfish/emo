package gr.army.emo.pojos;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "oplitis", schema = "misthodosia", catalog = "")
public class OplitisEntity {
    private long oplitis_id;
    private String asm;
    private int bathmos;
    private Date diagrafiDate;
    private boolean diagrammenos;
    private Date eggrafiDate;
    private String eponymo;
    private int katigoria;
    private Date lastPaymentDate;
    private String loxos;
    private Date metaboliDate;
    private String onoma;
    private String paratiriseis;
    private BathmosEntity bathmosByBathmos;
    private KatigoriaEntity katigoriaByKatigoria;

    @Id
    @Column(name = "oplitis_id", nullable = false)
    public long getOplitis_id() {
        return oplitis_id;
    }

    public void setOplitis_id(long oplitisId) {
        this.oplitis_id = oplitisId;
    }

    @Basic
    @Column(name = "asm", nullable = false, length = 20)
    public String getAsm() {
        return asm;
    }

    public void setAsm(String asm) {
        this.asm = asm;
    }

    @Basic
    @Column(name = "bathmos", nullable = false, insertable = false, updatable = false)
    public int getBathmos() {
        return bathmos;
    }

    public void setBathmos(int bathmos) {
        this.bathmos = bathmos;
    }

    @Basic
    @Column(name = "diagrafi_date", nullable = true)
    public Date getDiagrafiDate() {
        return diagrafiDate;
    }

    public void setDiagrafiDate(Date diagrafiDate) {
        this.diagrafiDate = diagrafiDate;
    }

    @Basic
    @Column(name = "diagrammenos", nullable = false)
    public boolean isDiagrammenos() {
        return diagrammenos;
    }

    public void setDiagrammenos(boolean diagrammenos) {
        this.diagrammenos = diagrammenos;
    }

    @Basic
    @Column(name = "eggrafi_date", nullable = false)
    public Date getEggrafiDate() {
        return eggrafiDate;
    }

    public void setEggrafiDate(Date eggrafiDate) {
        this.eggrafiDate = eggrafiDate;
    }

    @Basic
    @Column(name = "eponymo", nullable = false, length = 30)
    public String getEponymo() {
        return eponymo;
    }

    public void setEponymo(String eponymo) {
        this.eponymo = eponymo;
    }

    @Basic
    @Column(name = "katigoria", nullable = false, insertable = false, updatable = false)
    public int getKatigoria() {
        return katigoria;
    }

    public void setKatigoria(int katigoria) {
        this.katigoria = katigoria;
    }

    @Basic
    @Column(name = "last_payment_date", nullable = true)
    public Date getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(Date lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    @Basic
    @Column(name = "loxos", nullable = true, length = 10)
    public String getLoxos() {
        return loxos;
    }

    public void setLoxos(String loxos) {
        this.loxos = loxos;
    }

    @Basic
    @Column(name = "metaboli_date", nullable = true)
    public Date getMetaboliDate() {
        return metaboliDate;
    }

    public void setMetaboliDate(Date metaboliDate) {
        this.metaboliDate = metaboliDate;
    }

    @Basic
    @Column(name = "onoma", nullable = false, length = 30)
    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    @Basic
    @Column(name = "paratiriseis", nullable = true, length = -1)
    public String getParatiriseis() {
        return paratiriseis;
    }

    public void setParatiriseis(String paratiriseis) {
        this.paratiriseis = paratiriseis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OplitisEntity that = (OplitisEntity) o;
        return oplitis_id == that.oplitis_id && bathmos == that.bathmos && diagrammenos == that.diagrammenos && katigoria == that.katigoria && Objects.equals(asm, that.asm) && Objects.equals(diagrafiDate, that.diagrafiDate) && Objects.equals(eggrafiDate, that.eggrafiDate) && Objects.equals(eponymo, that.eponymo) && Objects.equals(lastPaymentDate, that.lastPaymentDate) && Objects.equals(loxos, that.loxos) && Objects.equals(metaboliDate, that.metaboliDate) && Objects.equals(onoma, that.onoma) && Objects.equals(paratiriseis, that.paratiriseis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oplitis_id, asm, bathmos, diagrafiDate, diagrammenos, eggrafiDate, eponymo, katigoria, lastPaymentDate, loxos, metaboliDate, onoma, paratiriseis);
    }

    @ManyToOne
    @JoinColumn(name = "bathmos", referencedColumnName = "bathmos_id", nullable = false)
    public BathmosEntity getBathmosByBathmos() {
        return bathmosByBathmos;
    }

    public void setBathmosByBathmos(BathmosEntity bathmosByBathmos) {
        this.bathmosByBathmos = bathmosByBathmos;
    }

    @ManyToOne
    @JoinColumn(name = "katigoria", referencedColumnName = "katigoria_id", nullable = false)
    public KatigoriaEntity getKatigoriaByKatigoria() {
        return katigoriaByKatigoria;
    }

    public void setKatigoriaByKatigoria(KatigoriaEntity katigoriaByKatigoria) {
        this.katigoriaByKatigoria = katigoriaByKatigoria;
    }
}
