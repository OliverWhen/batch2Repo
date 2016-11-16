package classes;

/**
 * Created by JPMPC-B220 on 11/10/2016.
 */
public class Customer extends Person{

    public long CustomerId;
    public String memberLevel;
    public long creditNumber;

    public long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(long customerId) {
        CustomerId = customerId;
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    public long getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(long creditNumber) {
        this.creditNumber = creditNumber;
    }
}
