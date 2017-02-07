package EnumTest;

import java.io.Serializable;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/3.
 */
public class EnumTestRO  implements Serializable {

    private static final long serialVersionUID = -7556617260453272471L;

    private Integer code;
    private String abbreviation;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return "EnumTestRO{" +
                "code=" + code +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}
