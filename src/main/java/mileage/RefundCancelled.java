package mileage;

public class RefundCancelled extends AbstractEvent {

    private Long id;
    private Long memberId;
    private Long remainPoint;
    private String membertStatus;
    private Long refundPoint;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
    public Long getRemainPoint() {
        return remainPoint;
    }

    public void setRemainPoint(Long remainPoint) {
        this.remainPoint = remainPoint;
    }
    public String getMembertStatus() {
        return membertStatus;
    }

    public void setMembertStatus(String membertStatus) {
        this.membertStatus = membertStatus;
    }
    public Long getRefundPoint() {
        return refundPoint;
    }

    public void setRefundPoint(Long refundPoint) {
        this.refundPoint = refundPoint;
    }
}