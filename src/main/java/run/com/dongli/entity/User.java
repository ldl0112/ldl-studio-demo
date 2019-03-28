package run.com.dongli.entity;

public class User {
    private Integer id;

    private String name;

    private Byte sex;

    private String desc;

    public User(Integer id, String name, Byte sex, String desc) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.desc = desc;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}