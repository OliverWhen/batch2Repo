package classes;

/**
 * Created by JPMPC-B220 on 11/10/2016.
 */
public class Employee extends Person{

    public int ssId;
    public int pagibigId;
    public int departmentId;

    public int getSsId() {
        return ssId;
    }

    public void setSsId(int ssId) {
        this.ssId = ssId;
    }

    public int getPagibigId() {
        return pagibigId;
    }

    public void setPagibigId(int pagibigId) {
        this.pagibigId = pagibigId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
