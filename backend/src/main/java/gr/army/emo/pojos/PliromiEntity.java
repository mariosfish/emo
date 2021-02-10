package gr.army.emo.pojos;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "pliromi", schema = "misthodosia", catalog = "")
public class PliromiEntity {
    private long pliromiId;
    private Date lastPaymentDate;
    private Date paymentDate;
    private double poso;

    @Id
    @Column(name = "pliromi_id", nullable = false)
    public long getPliromiId() {
        return pliromiId;
    }

    public void setPliromiId(long pliromiId) {
        this.pliromiId = pliromiId;
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
    @Column(name = "payment_date", nullable = false)
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Basic
    @Column(name = "poso", nullable = false, precision = 0)
    public double getPoso() {
        return poso;
    }

    public void setPoso(double poso) {
        this.poso = poso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PliromiEntity that = (PliromiEntity) o;
        return pliromiId == that.pliromiId && Double.compare(that.poso, poso) == 0 && Objects.equals(lastPaymentDate, that.lastPaymentDate) && Objects.equals(paymentDate, that.paymentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pliromiId, lastPaymentDate, paymentDate, poso);
    }
}
