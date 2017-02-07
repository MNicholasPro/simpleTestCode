package EnumTest;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/3.
 */
public enum Size {
    SMALL(1, "S"),
    MEDIUM(2, "M"),
    LARGE(3,"L"),
    EXTRA_LARGE(4,"XL");


    private String abbreviation;
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    Size(int code, String abbreviation) {
        this.code = code;
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return "Size{" +
                "code=" + code +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}
